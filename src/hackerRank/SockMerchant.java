package hackerRank;

import java.util.HashMap;
import java.util.Scanner;

public class SockMerchant
{

  private static final Scanner scanner = new Scanner(System.in);
  
  public static void main( String[] args )
  {
    int n = scanner.nextInt();
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

    int[] ar = new int[n];

    String[] arItems = scanner.nextLine().split(" ");
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

    for (int i = 0; i < n; i++) {
        int arItem = Integer.parseInt(arItems[i]);
        ar[i] = arItem;
    }

    System.out.println(sockMerchant(n, ar));

    scanner.close();

  }

  static int sockMerchant(int n, int[] ar) {

    HashMap<Integer, Integer> countMap = new HashMap<>();
    for (int i=0; i<n; i++) {
      if(countMap.containsKey( ar[i] )) {
        int count = countMap.get( ar[i] );
        countMap.put( ar[i], ++count );
      } else {
        countMap.put( ar[i], 1 );
      }
    }
    int match = 0;
    for(Integer key: countMap.keySet()) {
      match += (countMap.get( key ) / 2);
    }
    
    return match;
  }

}
