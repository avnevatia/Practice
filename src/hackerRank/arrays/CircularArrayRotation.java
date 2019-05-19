package hackerRank.arrays;

import java.util.Scanner;

public class CircularArrayRotation {

   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int k = in.nextInt();
      int q = in.nextInt();
      int temp;
      int[] arr = new int[n];

      if (k > n)
         k %= n;

      for (int i = 0; i < n; i++) {
         temp = in.nextInt();

         if (k == n) {
            k = 0;
         }

         arr[k++] = temp;
      }

      for (int i = 0; i < q; i++) {
         System.out.println(arr[in.nextInt()]);
      }

      in.close();

   }

}
