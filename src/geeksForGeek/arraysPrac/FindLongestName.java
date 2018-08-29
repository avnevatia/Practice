package geeksForGeek.arraysPrac;

import java.util.Scanner;

/*
 * Given a list of names, display the longest name.
 * 
 * Input: First line of input contains an integer T, the number of test cases. T test cases follows. First line of each
 * test case contains an integer N, i.e total number of names. Next N lines contains names of different length.
 * 
 * 
 * Output: Longest name in the list of names.
 * 
 * 
 * Constraints:
 * 
 * 1<=T<=10
 * 1<=N<=10
 * 
 * 
 * Example:
 * 
 * Input:
 * 1
 * 5
 * Geek
 * Geeks
 * Geeksfor
 * GeeksforGeek
 * GeeksforGeeks
 * 
 * Output:
 * GeeksforGeeks
 */
public class FindLongestName {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int testCase = sc.nextInt();
      while (testCase > 0) {
         int n = sc.nextInt();
         int len = 0;
         String longest = "";
         String input;
         for (int i = 0; i < n; i++) {
            input = sc.next();
            if (input.length() > len) {
               longest = input;
               len = longest.length();
            }

         }
         System.out.println(longest);
         testCase--;
      }
      sc.close();

   }

}
