package codeChef;

public class GreatestCommonDivisor
{

  public static void main( String[] args )
  {
    System.out.println( gcd( 10, 45 ) );

    int[] arr =
    { 4, 2, 10, 8, 6 };
    
    int result = arr[0];
    for( int i = 1; i < arr.length; i++ )
    {
      result = gcd( result, arr[i] );
    }
    System.out.println( result );
  }

  public static int gcd( int a, int b )
  {
    int result = -1;
    
    if(a < b) {
      a = a+b ;
      b = a - b;
      a = a - b;
    }
    while( result != 0 && result != 1 )
    {
      result = a % b;
      a = b;
      if( result != 0 )
      {
        b = result;
      }
    }

    return b;
  }

}
