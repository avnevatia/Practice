package randomPrac;

public class temp {

   public static void main(String[] args) throws NullPointerException {
//      try {
//         throw new NullPointerException("demo");
//      } catch (Exception e) {
//         System.out.println("catch call");
//      } finally {
//         System.out.println("final call");
//      }
     
     Payable[] creditors = new Payable[] {
         new Employee(), new Contractor()
     };
     
     for (Payable creditor: creditors) {
       creditor.pay();
     }
   }

}

interface Payable {
  void pay();
}

class Implementation implements Payable {
  public void pay() {
    System.out.println( "Implentation" );
  }
}

class Employee extends Implementation {
  
}

class Contractor implements Payable {
  public void pay() {
    System.out.println( "Contractor" );
  }
}