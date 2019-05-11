package hackerRank;

import java.util.Scanner;

public class RepeatedString
{

  private static final Scanner scanner = new Scanner(System.in);
  
  public static void main( String[] args )
  {
    String s = scanner.nextLine();

    long n = scanner.nextLong();
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

    System.out.println(repeatedString(s, n));

    scanner.close();

  }

  static long repeatedString(String s, long n) {

    long noOfA=0;
    long countA = 0;
    long mod;
    char[] steps = s.toCharArray();
    long len = steps.length;
    
    for (int i=0; i<len; i++) {
      if(steps[i] == 'a' ) {
        countA++; 
      }
    }
    
    noOfA = (n/len) * countA;
    mod = n % len;
    
    if( mod > 0) {
      for (int i=0; i<mod; i++) {
        if(steps[i] == 'a' ) {
          noOfA++; 
        }
      }
    }
    
    return noOfA;
  }

}
