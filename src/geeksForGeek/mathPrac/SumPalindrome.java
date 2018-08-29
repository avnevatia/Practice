package geeksForGeek.mathPrac;

import java.util.Scanner;

/*
 * Given a number, reverse it and add it to itself unless it becomes a palindrome in count of 5. If it becomes a
 * palindrome then print that palindrome number, otherwise print -1.
 * 
 * Input: First line of the input contains an integer T denoting the number of test cases. Each test case has a single
 * line containing a number.
 * 
 * Output: Corresponding to each test case, print the palindrome number or -1 as stated above.
 * 
 * Constraints:
 * 1 <= T <= 200
 * 1 <= N <= 1000
 * 
 * Example:
 * Input:
 * 2
 * 23
 * 30
 * Output:
 * 55
 * 33
 */

public class SumPalindrome {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int testCase = sc.nextInt();
      while (testCase > 0) {
         long n = sc.nextInt();
         long rev = getRev(n);
         long sum = n + rev;
         rev = getRev(sum);

         if (rev == sum) {
            System.out.println(sum);
         } else {
            System.out.println("-1");
         }

         testCase--;
      }
      sc.close();
   }

   public static long getRev(long n1) {
      long rev = 0;
      while (n1 > 0) {
         rev *= 10;
         rev += (n1 % 10);
         n1 /= 10;
      }
      return rev;
   }

}
