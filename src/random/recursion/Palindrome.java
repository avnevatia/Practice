package random.recursion;

/**
 * 
 * Write a recursive function that checks whether a string is a palindrome (a palindrome is a string that's the same when reads forwards and backwards.)
 *
 */
public class Palindrome
{

  public static void main( String[] args )
  {
    String str = "aba";
    System.out.println( nonRecursive( str ) );
    System.out.println( recursive( str, 0, str.length() ) );
  }

  public static String nonRecursive( String s )
  {
    int len = s.length();
    String temp = s.toLowerCase();

    for( int i = 0; i < (len / 2); i++ )
    {
      if( temp.charAt( i ) != temp.charAt( len - i - 1 ) )
      { return "Not Palindrome"; }
    }

    return "Palindrome";
  }

  public static String recursive( String str, int s, int e )
  {
    e = e - 1;

    if( s == e )
    { return "Palindrome"; }

    if( str.charAt( s ) != str.charAt( e ) )
    { return "Not Palindrome"; }

    return recursive( str, s + 1, e );
  }

}
