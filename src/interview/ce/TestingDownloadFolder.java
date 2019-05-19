package interview.ce;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.URL;
import java.util.LinkedList;

import javax.net.ssl.HttpsURLConnection;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class TestingDownloadFolder
{

  public static JSONArray jArray;;

  public static void main( String[] args )
  {
    String oneDriveToken = "User YMpP0oLEjqrHy9CKhh+/2TnUSY6cLNA16C5/ue5PhL4=, Organization fa4c6d3fce29c7daca28535c36883c12, Element RsWQ3q/64UFETk+nM32sJD551TyBZo+5JT8tM+pxNMU=";
    String driveToken = "User YMpP0oLEjqrHy9CKhh+/2TnUSY6cLNA16C5/ue5PhL4=, Organization fa4c6d3fce29c7daca28535c36883c12, Element AQBsD5BmUSTWSFn1ajZ2JOZsaSw0ZUE01YkCfesv2LE=";
    String oneDrivePath = "/TestOD";
    String drivePath = "/Test";
    Boolean isDirectory;
    JSONObject jObj;
    FolderDetails tempFD;

    LinkedList<FolderDetails> directoryList = new LinkedList<>();
    directoryList.add( new FolderDetails( drivePath, true ) );

    for( int i = 0; i < directoryList.size(); i++ )
    {
      tempFD = directoryList.get( i );
      if( tempFD.isDirectory() )
      {
        downloadFile( driveToken, tempFD.getPath() );
        
        for( int j = 0; j < jArray.size(); j++ )
        {
          jObj = (JSONObject) jArray.get( j );
          drivePath = (String) jObj.get( "path" );
//          System.out.println( drivePath );
          isDirectory = (Boolean) jObj.get( "directory" );
//          System.out.println( isDirectory );
          directoryList.add( new FolderDetails( drivePath, isDirectory ) );
        }
      }
    }
    for( FolderDetails directory : directoryList )
    {
      System.out.println( directory.getPath() + " ## " + directory.isDirectory() );
      if(directory.isDirectory()) {
        createFolder(oneDriveToken, directory.getPath());
      }
    }

  }

  private static void createFolder( String token, String path )
  {
    BufferedReader reader = null;
    try
    {
      URL url = new URL( "https://staging.cloud-elements.com/elements/api-v2/folders" );
      HttpsURLConnection httpsConn = (HttpsURLConnection) url.openConnection();
      httpsConn.setRequestProperty( "authorization", token );
      httpsConn.setDoOutput( true ); // indicates POST method
      httpsConn.setRequestProperty( "Content-Type", "application/json; utf-8" );
      httpsConn.setRequestProperty( "Accept", "application/json" );

      String jsonInputString = "{\"path\":\"" + path + "\"}";

      OutputStream os = httpsConn.getOutputStream();
      byte[] input = jsonInputString.getBytes( "utf-8" );
      os.write( input, 0, input.length );
      
      reader = new BufferedReader( new InputStreamReader( httpsConn.getInputStream() ) );

      StringBuilder result = new StringBuilder();
      String line;

      while( (line = reader.readLine()) != null )
      {
        result.append( line );
      }
      System.out.println( result.toString() );

      httpsConn.disconnect();

    }
    catch( Exception e )
    {
      e.printStackTrace();
    }
  }

  private static void downloadFile( String token, String path )
  {

    BufferedReader reader = null;
    try
    {
      URL url = new URL( "https://staging.cloud-elements.com/elements/api-v2/folders/contents?path=" + path );
      HttpsURLConnection httpsConn = (HttpsURLConnection) url.openConnection();
      httpsConn.setRequestProperty( "authorization", token );
      httpsConn.setRequestProperty( "accept", "application/json" );
      httpsConn.setDoOutput( true );
      httpsConn.setRequestMethod( "GET" );

      reader = new BufferedReader( new InputStreamReader( httpsConn.getInputStream() ) );

      StringBuilder result = new StringBuilder();
      String line;

      while( (line = reader.readLine()) != null )
      {
        result.append( line );
      }
//      System.out.println( result.toString() );
      JSONParser parser = new JSONParser();
      jArray = (JSONArray) parser.parse( result.toString() );

      httpsConn.disconnect();

    }
    catch( Exception e )
    {
      e.printStackTrace();
    }
  }

}
