package geeksForGeek.mathPrac;

import java.util.Scanner;

/*
 * Given a number N, find the Nth term in the series 1, 3, 6, 10, 15, 21…
 * 
 * Input :
 * The first line of input contains a positive integer T denoting the number of testcases. For each test case, there
 * will be a single line containing an integer N.
 * 
 * Output:
 * For each testcase, print the Nth term.
 * 
 * Constraints:
 * 1 <= T <= 100
 * 1 <= N <= 1000
 * 
 * Examples:
 * Input:
 * 2
 * 3
 * 4
 * 
 * Output:
 * 6
 * 10
 */
public class FindNthTerm {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int testCase = sc.nextInt();
      while (testCase > 0) {
         int n = sc.nextInt();
         long add = 1;
         long sum = 0;
         for (int i = 0; i < n; i++) {
            sum += add++;
         }

         System.out.println(sum);
         testCase--;
      }
      sc.close();
   }

}
