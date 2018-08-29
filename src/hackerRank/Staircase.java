package hackerRank;

import java.util.Scanner;

public class Staircase {

   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int x = n - 1;

      for (int i = 0; i < n; i++) {
         for (int j = 0; j < n; j++) {
            if (j < x)
               System.out.print(" ");
            else
               System.out.print("#");
         }
         System.out.println("");
         x--;
      }
      in.close();
   }

}
