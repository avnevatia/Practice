package codeWars;

/**
 * Write a function, persistence, that takes in a positive parameter num and returns its multiplicative persistence,
 * which is the number of times you must multiply the digits in num until you reach a single digit.
 * 
 * For example: persistence(39) == 3 // because 3*9 = 27, 2*7 = 14, 1*4=4 // and 4 has only one digit
 *
 * persistence(999) == 4 // because 9*9*9 = 729, 7*2*9 = 126, // 1*2*6 = 12, and finally 1*2 = 2
 *
 * persistence(4) == 0 // because 4 is already a one-digit number
 */

public class PersistentBugger {

  public static void main(String[] args) {
    System.out.println(persistence(39));
  }

  public static int persistence(long n) {

    //If given input is below 10 means it is single digit, so return 0.
    if (n < 10) {
      return 0;
    }
    
    long mul = 1;
    int times = 1;

    while (n > 0) {
      //mod operation to fetch last digit and multiply it.
      mul *= (n % 10);
      //division operation to get remainder.
      n /= 10;
      
      //count till we get single digit and reset n with new mul val
      if (n == 0 && mul > 9) {
        ++times;
        n = mul;
        mul = 1;
      }
    }

    return times;
  }
}
