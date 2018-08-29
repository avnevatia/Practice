package geeksForGeek.arraysPrac;

import java.util.Scanner;

/*
 * Given an N length array and you have to tell whether the array is perfect or not.An array is said to be perfect if
 * it's reverse array matches the original array. If the array is perfect then print "PERFECT" else print "NOT PERFECT".
 * 
 * Input:
 * 
 * The first line of input contains an integer T denoting the number of test cases. Then T test cases follow. Each test
 * case consists of two lines. First line of each test case contains an integer N (size of the array)and the second line
 * contains N elements a1,a2,......aN of an array .
 * 
 * Output:
 * For each test case, print either "PERFECT" or "NOT PERFECT" in new line as your answer.
 * 
 * Constraints:
 * 1<=T<=100
 * 1<=N<=100
 * 
 * 1<=aN<=1000
 * 
 * Example:
 * Input:
 * 2
 * 5
 * 1 2 3 2 1
 * 5
 * 1 2 3 4 5
 * Output:
 * PERFECT
 * 
 * NOT PERFECT
 */

public class PerfectArray {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int testCase = sc.nextInt();
      while (testCase > 0) {
         int n = sc.nextInt();
         int[] inputArr1 = new int[n];
         int len = inputArr1.length;
         boolean perfect = true;
         for (int i = 0; i < len; i++) {
            inputArr1[i] = sc.nextInt();
         }

         for (int i = 0; i < (inputArr1.length / 2); i++) {
            if (inputArr1[i] != inputArr1[--len]) {
               perfect = false;
               break;
            }
         }
         if (perfect) {
            System.out.println("PERFECT");
         } else {
            System.out.println("NOT PERFECT");
         }

         testCase--;
      }
      sc.close();
   }

}
