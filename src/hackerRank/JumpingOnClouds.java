package hackerRank;

import java.io.IOException;
import java.util.Scanner;

public class JumpingOnClouds
{

  static int jumpingOnClouds( int[] c )
  {
    int shortestPath = 0;
    for( int i = 0; i < c.length-1; i++ )
    {
      if( i < c.length - 2 && c[i + 1] == 1 && c[i + 2] == 1 )
      {
        break;
      }

      if( i < c.length - 2 && c[i + 2] != 1 )
      {
        ++shortestPath;
        i += 1;
      }
      else
      {
        shortestPath++;
      }
    }
    return shortestPath;
  }

  private static final Scanner scanner = new Scanner( System.in );

  public static void main( String[] args ) throws IOException
  {
    int n = scanner.nextInt();
    scanner.skip( "(\r\n|[\n\r\u2028\u2029\u0085])?" );

    int[] c = new int[n];

    String[] cItems = scanner.nextLine().split( " " );
    scanner.skip( "(\r\n|[\n\r\u2028\u2029\u0085])?" );

    for( int i = 0; i < n; i++ )
    {
      int cItem = Integer.parseInt( cItems[i] );
      c[i] = cItem;
    }

    System.out.println( jumpingOnClouds( c ) );

    scanner.close();
  }
}
