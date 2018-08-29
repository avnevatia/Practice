package hackerRank;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TimeConversion {

   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);

      System.out.println(LocalTime.parse(in.nextLine(), DateTimeFormatter.ofPattern("hh:mm:ssa"))
            .format(DateTimeFormatter.ofPattern("HH:mm:ss")));
      in.close();
   }

}
