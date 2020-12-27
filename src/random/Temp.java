package random;

import java.util.LinkedHashMap;
import java.util.Set;

public class Temp
{
  public static void main(String...strings ) {
//    int i = 32;
//    
//    System.out.println( i << 1 );
//    System.out.println( i >> 1 );
//    System.out.println( i >>> 1 );
//    System.out.println( i ^ 20 );
    System.out.println( 31 ^ 14 );
//    
//    int[] arr = {1, 2, 5, 4, 6, 8, 9, 2, 1, 4, 5, 8, 9, 1, 2};
//    int result=0;
//    
//    for (int i=0; i<arr.length; ++i) {
//      result ^= arr[i];
//    }
//    System.out.println( result );
    Temp t1 = new Temp();
    
    t1.sum( 1.0f, 1.0f );
    t1.sum( 1, 1 );
  }
  
  public final void sum(int a, int b) {
    System.out.println( "test" );
  }
  public void sum(float a, float b) {
    System.out.println( "test1" );
  }
}
