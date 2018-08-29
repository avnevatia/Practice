package geeksForGeek.arraysPrac;

import java.util.Scanner;

/*
 * Given an unsorted array Arr[] of N integers and a Key which is present in this array. You need to write a program to
 * find the start index( index where the element is first found from left in the array ) and end index( index where the
 * element is first found from right in the array ).
 * 
 * Input:
 * Fisrt line of input contains an integer T which denotes the number of test cases. First line of each test case
 * contains a single integer N which denotes the number of elements in the array. Second line of each test case contains
 * N space separated integers. Third line of each test case contains the key to be searched.
 * 
 * Output:
 * For each test case print two space separated integeres, first is the start index and second is the end index. If the
 * key doesnot exist in the array then print -1 in this case.
 * 
 * Constraints:
 * 1<=T<=100
 * 1<=N<=10^5
 * 1<=Arr[i]<=10^4
 * 
 * Example:
 * Input:
 * 2
 * 6
 * 1 2 3 4 5 5
 * 5
 * 6
 * 6 5 4 3 1 2
 * 4
 * Output:
 * 4 5
 * 2 2
 */

public class FindIndex {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int testCase = sc.nextInt();
      while (testCase > 0) {
         int n = sc.nextInt();
         int[] inputArr1 = new int[n];
         int len = inputArr1.length;
         int first = -1;
         int last = -1;
         for (int i = 0; i < len; i++) {
            inputArr1[i] = sc.nextInt();
         }
         int key = sc.nextInt();

         for (int i = 0; i < inputArr1.length; i++) {
            if (inputArr1[i] == key && first < 0) {
               first = i;
            }
            if (inputArr1[--len] == key && last < 0) {
               last = len;
            }
            if (first >= 0 && last >= 0) {
               break;
            }
         }

         System.out.println(first + " " + last);

         testCase--;
      }
      sc.close();
   }

}
