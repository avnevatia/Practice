package designPatterns.behavioral.template;

public class Test
{

  public static void main( String[] args )
  {
    
    Worker employee = new Employee();
    Worker contractor = new Contractor();

    Employee employee1 = new Employee();
    Contractor contractor1 = new Contractor();
    
    employee.pay();

    contractor.pay();
    
    employee1.pay();
    employee1.paySalary();

    contractor1.pay();
    contractor1.payInvoice();

  }

}
