package random.recursion;

public class Factorial
{

  public static void main( String[] args )
  {
    System.out.println( factorialNonRecursive( 4 ) );
    System.out.println( factorialRecursive( 4 ) );
  }

  public static int factorialNonRecursive( int n )
  {
    if( n == 0 )
    { return 1; }

    int factorial = n;
    while( n > 2 )
    {
      System.out.println( n );
      factorial *= (n - 1);
      n--;
    }
    
    return factorial;
  }

  public static int factorialRecursive( int n )
  {
    System.out.println( n );
    if( n == 1 || n == 0) {
      return 1;
    }
    return n * factorialRecursive( n - 1 );
  }

}