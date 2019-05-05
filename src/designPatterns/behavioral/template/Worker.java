package designPatterns.behavioral.template;

public abstract class Worker
{
  public void pay() {
    System.out.println(getAmountDue());
  }
  
  abstract protected String getAmountDue();

}
