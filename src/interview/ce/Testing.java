package interview.ce;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

import javax.net.ssl.HttpsURLConnection;

public class Testing
{

  public static void main( String[] args )
  {
    String oneDriveToken = "User YMpP0oLEjqrHy9CKhh+/2TnUSY6cLNA16C5/ue5PhL4=, Organization fa4c6d3fce29c7daca28535c36883c12, Element RsWQ3q/64UFETk+nM32sJD551TyBZo+5JT8tM+pxNMU=";
    String driveToken = "User YMpP0oLEjqrHy9CKhh+/2TnUSY6cLNA16C5/ue5PhL4=, Organization fa4c6d3fce29c7daca28535c36883c12, Element AQBsD5BmUSTWSFn1ajZ2JOZsaSw0ZUE01YkCfesv2LE=";
    String oneDrivePath = "/TestOD/testOD.txt";
    String drivePath = "/Test/test.txt";

    System.out.println( downloadFile( oneDriveToken, oneDrivePath ) );
    System.out.println( downloadFile(driveToken, drivePath) );

  }

  private static String downloadFile( String token, String path )
  {

    String response = null;

    BufferedReader reader = null;
    try
    {
      URL url = new URL( "https://staging.cloud-elements.com/elements/api-v2/files?path=" + path );
      HttpsURLConnection connection = (HttpsURLConnection) url.openConnection();
      connection.setRequestProperty( "authorization", token );
      connection.setDoOutput( true );
      connection.setRequestMethod( "GET" );
      int responseCode = connection.getResponseCode();

//      reader = new BufferedReader( new InputStreamReader( connection.getInputStream() ) );
//
//      String line = null;
//      StringWriter out = new StringWriter( connection.getContentLength() > 0 ? connection.getContentLength() : 2048 );
//      
//      while( (line = reader.readLine()) != null )
//      {
//        out.append( line );
//      }
//      
//      response = out.toString();

      if( responseCode == HttpsURLConnection.HTTP_OK )
      {
        String fileName = "";
        String disposition = connection.getHeaderField( "Content-Disposition" );
        String contentType = connection.getContentType();
        int contentLength = connection.getContentLength();

//        if( disposition != null )
//        {
//          // extracts file name from header field
//          int index = disposition.indexOf( "filename=" );
//          if( index > 0 )
//          {
//            fileName = disposition.substring( index + 9, disposition.length() );
//          }
//        }
//        else
//        {
          // extracts file name from URL
          fileName = path.substring( path.lastIndexOf( "/" ) + 1, path.length() );
//        }

        System.out.println( "Content-Type = " + contentType );
        System.out.println( "Content-Disposition = " + disposition );
        System.out.println( "Content-Length = " + contentLength );
        System.out.println( "fileName = " + fileName );

        ReadableByteChannel rbc = Channels.newChannel( connection.getInputStream() );
        FileOutputStream fos = new FileOutputStream( new File( "C:\\ANKDEV\\"+fileName ) );
        fos.getChannel().transferFrom( rbc, 0, Long.MAX_VALUE );
        fos.close();
        rbc.close();

        System.out.println( "File downloaded" );
      }
      else
      {
        System.out.println( "No file to download. Server replied HTTP code: " + responseCode );
      }
      connection.disconnect();

    }
    catch( Exception e )
    {
      e.printStackTrace();
    }

    return response;
  }

  private static void downloadUsingNIO( String urlStr, String file ) throws IOException
  {
    URL url = new URL( urlStr );
    ReadableByteChannel rbc = Channels.newChannel( url.openStream() );
    FileOutputStream fos = new FileOutputStream( file );
    fos.getChannel().transferFrom( rbc, 0, Long.MAX_VALUE );
    fos.close();
    rbc.close();
  }

}
