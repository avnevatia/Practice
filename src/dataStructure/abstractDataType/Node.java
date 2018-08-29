package dataStructure.abstractDataType;

public class Node<T>
{

  private T element;
  private Node<T> next = null;

  public Node( T element )
  {
    this.element = element;
  }

  public Node( T element, Node<T> next )
  {
    this.element = element;
    this.next = next;
  }

  public T getElement()
  {
    return element;
  }

  public void setElement( T element )
  {
    this.element = element;
  }

  public Node<T> getNext()
  {
    return next;
  }

  public void setNext( Node<T> next )
  {
    this.next = next;
  }
}
