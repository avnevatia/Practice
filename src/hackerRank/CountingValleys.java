package hackerRank;

import java.util.Scanner;

public class CountingValleys
{

  private static final Scanner scanner = new Scanner(System.in);
  
  public static void main( String[] args )
  {
    int n = scanner.nextInt();
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

    String s = scanner.nextLine();

    System.out.println(countingValleys(n, s));

    scanner.close();

  }

  static int countingValleys(int n, String s) {

    int noOfValleys=0;
    int stepsCount = 0;
    char[] steps = s.toCharArray();
    
    for (int i=0; i<steps.length; i++) {
      if(steps[i] == 'u' || steps[i] == 'U' ) {
        stepsCount++; 
      }else if(steps[i] == 'd' || steps[i] == 'D' ) {
        stepsCount--; 
      }
      
      if(stepsCount == 0 && (steps[i] == 'u' || steps[i] == 'U' )) {
        noOfValleys++;
      }
    }
    
    return noOfValleys;
  }

}
