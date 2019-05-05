package designPatterns.behavioral.template;

public class Employee extends Worker{

  @Override
  protected String getAmountDue()
  {
    return "Employee" ;    
  }
  
  public void paySalary() {
    System.out.println( "Pay Employee salary" );
  }
  
}
