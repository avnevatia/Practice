package hackerRank.arrays;

import java.util.Scanner;

public class LeftRotation
{

  public static void main( String[] args )
  {
    try (Scanner scanner = new Scanner( System.in ))
    {
      String[] nd = scanner.nextLine().split( " " );

      int n = Integer.parseInt( nd[0] );

      int d = Integer.parseInt( nd[1] );

      int[] a = new int[n];

      String[] aItems = scanner.nextLine().split( " " );
      scanner.skip( "(\r\n|[\n\r\u2028\u2029\u0085])?" );

      for( int i = 0; i < n; i++ )
      {
        int aItem = Integer.parseInt( aItems[i] );
        a[i] = aItem;
      }

      int[] result = rotLeft(a, d);

      for (int i = 0; i < result.length; i++) {
          System.out.print( result[i] );
      }
    }
    catch( Exception e )
    {
      e.printStackTrace();
    }
  }

  static int[] rotLeft( int[] a, int d )
  {
    int[] newArr = new int[a.length];
    int j=0;

    for( int i = d; i < a.length; i++ )
    {
      newArr[j++] = a[i];
    }

    for( int i = 0; i < d; i++ )
    {
      newArr[j++] = a[i];
    }

    return newArr;
  }
}
