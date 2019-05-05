package designPatterns.behavioral.template;

public class Contractor extends Worker{

  @Override
  protected String getAmountDue()
  {
    return "Contractor" ;    
  }
  public void payInvoice() {
    System.out.println( "Pay Contractor invoice" );
  }
  
}