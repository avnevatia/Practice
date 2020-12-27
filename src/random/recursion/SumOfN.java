package random.recursion;

public class SumOfN
{

  public static void main( String[] args )
  {
    System.out.println( sumNonRecursive( 3 ) );
    System.out.println( sumRecursive( 3 ) );
  }

  public static int sumNonRecursive( int n )
  {
    if( n == 0 )
    { return 0; }

    int sum = n;
    while( n > 1 )
    {
      sum += (n - 1);
      n--;
    }

    return sum;
  }
  
  public static int sumRecursive (int n) {
    if (n == 0) {
      return 0;
    }
    
    return n + sumRecursive( n-1 );
  }
}
