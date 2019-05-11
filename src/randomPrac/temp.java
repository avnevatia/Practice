package randomPrac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

public class temp
{

  public static void main( String[] args ) throws NullPointerException
  {
//      try {
//         throw new NullPointerException("demo");
//      } catch (Exception e) {
//         System.out.println("catch call");
//      } finally {
//         System.out.println("final call");
//      }

//     Payable[] creditors = new Payable[] {
//         new Employee(), new Contractor()
//     };
//     
//     for (Payable creditor: creditors) {
//       creditor.pay();
//     }

    String oneDriveToken = "User YMpP0oLEjqrHy9CKhh+/2TnUSY6cLNA16C5/ue5PhL4=, Organization fa4c6d3fce29c7daca28535c36883c12, Element RsWQ3q/64UFETk+nM32sJD551TyBZo+5JT8tM+pxNMU=";
    String driveToken = "User YMpP0oLEjqrHy9CKhh+/2TnUSY6cLNA16C5/ue5PhL4=, Organization fa4c6d3fce29c7daca28535c36883c12, Element AQBsD5BmUSTWSFn1ajZ2JOZsaSw0ZUE01YkCfesv2LE=";
    String oneDrivePath = "%2FTestOD%2FtestOD.txt";    
    String drivePath = "%2FTest%2Ftest.txt";    
    
    BufferedReader reader = null;
    try
    {
      URL url = new URL( "https://staging.cloud-elements.com/elements/api-v2/files?path=" + drivePath);
      HttpsURLConnection connection = (HttpsURLConnection) url.openConnection();
      connection.setRequestProperty( "authorization", driveToken );
      connection.setDoOutput( true );
      connection.setRequestMethod( "GET" );
      reader = new BufferedReader( new InputStreamReader( connection.getInputStream() ) );

      String line = null;
      StringWriter out = new StringWriter( connection.getContentLength() > 0 ? connection.getContentLength() : 2048 );
      
      while( (line = reader.readLine()) != null )
      {
        out.append( line );
      }
      
      String response = out.toString();
      System.out.println( response );
    
    }
    catch( Exception e )
    {
      e.printStackTrace();
    }

  }

}

//interface Payable
//{
//  void pay();
//}
//
//class Implementation implements Payable
//{
//  public void pay()
//  {
//    System.out.println( "Implentation" );
//  }
//}
//
//class Employee extends Implementation
//{
//
//}
//
//class Contractor implements Payable
//{
//  public void pay()
//  {
//    System.out.println( "Contractor" );
//  }
//}
