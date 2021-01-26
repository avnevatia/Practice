package random.recursion;

/**
 * 
 * Write a recursive function that, given two strings, returns whether the first string is a
 * subsequence of the second. For example, given hac and cathartic, you should return true,
 * but given bat and table, you should return false.
 *
 */
public class Subsequence
{

  public static void main( String[] args )
  {
    String str = "cathartic";
    String search = "hact";
    System.out.println( nonRecursive( str, search ) );
    System.out.println( recursive( str, search, 0, 0 ) );
  }

  public static boolean nonRecursive(String str, String search) {
    
    int j=0;
    for(int i=0; i<str.length(); i++) {
      if(str.charAt( i ) == search.charAt( j )) {
        j++;
      }
      if(j == search.length()) {
        return true;
      }
    }
    return false;
  }
  
  public static boolean recursive(String str, String search, int i, int j) {
    if(search.length() == j) {
      return true;
    }
    if(str.length() == i) {
      return false;
    }
    if(str.charAt( i ) == search.charAt( j )) {
      j++;
    }
    return recursive(str, search, ++i, j);
  }
} 
