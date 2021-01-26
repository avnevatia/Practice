package random.recursion;

/**
 * 
 * Write a recursive function that, given a string s, prints the characters of s in reverse order.
 *
 */
public class ReverseString
{

  public static void main( String[] args )
  {
//    strReverseNonRecursive( "Ankit" );
    strReverseRecursive( "Ankit" );
  }

  public static void strReverseNonRecursive( String s )
  {
    for( int i = s.length() - 1; i >= 0; i-- )
    {
      System.out.print( s.charAt( i ) );
    }
  }

  public static void strReverseRecursive( String s )
  {
    if(s.isBlank()) {
      return ;
    }
    
    strReverseRecursive( s.substring( 1 ) );
    System.out.print( s.charAt( 0 ) );
  }
}
