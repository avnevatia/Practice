package hackerRank;

import java.util.Scanner;

public class PlusMinus {

   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int temp = 0;
      float zero = 0, plus = 0, minus = 0;

      for (int i = 0; i < n; i++) {
         temp = in.nextInt();
         if (temp < 0)
            minus++;
         else if (temp > 0)
            plus++;
         else if (temp == 0)
            zero++;
      }

      System.out.printf("%.6f\n", plus / n);
      System.out.printf("%.6f\n", minus / n);
      System.out.printf("%.6f\n", zero / n);
      in.close();
   }

}
