package hackerRank;

import java.util.Scanner;

public class TripletCompare {

   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int a0 = in.nextInt();
      int a1 = in.nextInt();
      int a2 = in.nextInt();
      int b0 = in.nextInt();
      int b1 = in.nextInt();
      int b2 = in.nextInt();
      int[] a = { a0, a1, a2 };
      int[] b = { b0, b1, b2 };
      int alice = 0;
      int bob = 0;

      for (int i = 0; i < 3; i++) {
         if ((a[i] >= 1 || a[i] <= 100) && (b[i] >= 1 || b[i] <= 100)) {
            if (a[i] < b[i])
               bob += 1;
            if (a[i] > b[i])
               alice += 1;
         }

      }
      System.out.println(alice + " " + bob);
      in.close();
   }

}
