package geeksForGeek.mathPrac;

import java.util.Scanner;

/*
 * Input:
 * First line of the input contains an integer T, denoting the number of test cases. Then T test case follows. The only
 * line of each test case contains an integer N.
 * 
 * Output:
 * For each test case output the required anser on a new line.
 * 
 * Constraints:
 * 1<=T<=100
 * N<=104
 * 
 * Example:
 * Input:
 * 3
 * 2
 * 5
 * 9
 * Output:
 * 20
 * 220
 * 1140
 */

public class SquareEvenNum {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int testCase = sc.nextInt();
      while (testCase > 0) {
         int n = sc.nextInt();
         long sum = 0;
         int even = 2;
         for (int i = 1; i <= n; i++) {
            sum += (even * even);
            even += 2;
         }
         System.out.println(sum);
         testCase--;
      }
      sc.close();
   }

}
