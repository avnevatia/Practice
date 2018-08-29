package hackerRank;

import java.util.Scanner;

public class DiagonalDiff {

   /*
    * public static void main(String[] args) {
    * Scanner in = new Scanner(System.in);
    * int n = in.nextInt();
    * int[] arr = new int[n * n];
    * int diagIdx1 = n + 1, diagIdx2 = n - 1;
    * int sum1 = 0, sum2 = 0;
    * int x = 0, y = 1;
    * 
    * for (int i = 0; i < (n * n); i++) {
    * arr[i] = in.nextInt();
    * }
    * 
    * for (int i = 0; i < n; i++) {
    * sum1 += arr[diagIdx1 * x++];
    * sum2 += arr[diagIdx2 * y++];
    * }
    * 
    * System.out.println(Math.abs(sum1 - sum2));
    * }
    */
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int n;
      int diag1 = 0;
      int diag2 = 0;
      n = Integer.parseInt(in.nextLine());
      for (int i = 0; i < n; i++) {
         String str[] = in.nextLine().split(" ");
         diag1 = diag1 + Integer.parseInt(str[i]);
         diag2 = diag2 + Integer.parseInt(str[n - 1 - i]);
      }

      int diagDiff = Math.abs(diag1 - diag2);
      System.out.println(diagDiff);
      in.close();
   }
}
