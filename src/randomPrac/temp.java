package randomPrac;

public class temp {

   public static void main(String[] args) throws NullPointerException {
      try {
         throw new NullPointerException("demo");
      } catch (Exception e) {
         System.out.println("catch call");
      } finally {
         System.out.println("final call");
      }
   }

}
