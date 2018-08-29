package geeksForGeek.arraysPrac;

import java.util.Scanner;

/*
 * For a given array of price of items,you have to calculate the sum and average of all prices upto 2 decimal places.
 * 
 * Input:
 * First line of the input contains an integer T which denotes the number of test cases. Then T test cases follow. Each
 * test case contains two lines.
 * The first line of each test case contains N denoting the number of items in the array.
 * The second line contains N space-separated integers - P1, P2, ..., PN denoting prices of items.
 * 
 * Output:
 * For each test case, print space separated sum and average of all the items resepctively.
 * 
 * Constraints:
 * 1<=T<=100
 * 1<=N<=100
 * 1<=Pi<=1000
 * 
 * Example:
 * Input:
 * 2
 * 5
 * 1 2 3 4 5
 * 9
 * 2 55 85 656 52 554 545 5 2
 * Output:
 * 15 3.00
 * 1956 217.33
 */

public class CalcSumAvg {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int testCase = sc.nextInt();
      while (testCase > 0) {
         int n = sc.nextInt();
         int[] inputArr1 = new int[n];
         int len = inputArr1.length;
         int sum = 0;
         for (int i = 0; i < len; i++) {
            inputArr1[i] = sc.nextInt();
            sum += inputArr1[i];
         }

         System.out.println(sum + " " + String.format("%.2f", ((float) sum / len)));

         testCase--;
      }
      sc.close();
   }
}
