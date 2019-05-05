package dataStructure.abstractDataTypeImpl;

import java.util.Iterator;

import dataStructure.abstractDataType.List;
import dataStructure.abstractDataType.Node;

public class ListUsingNode<E> implements List<E>
{
  
  E elem;
  Node<E> first;
  Node<E> last;
  int size;
  
  public ListUsingNode()
  {
  }

  @Override
  public boolean add( E elem )
  {
    size++;
    if(first == null) {
      first = last = new Node<E>( elem );
      return true;
    }
    
    last.setNext( new Node<E>(elem));
    last = last.getNext();
    
    return false;
  }

  @Override
  public boolean add( int index, E elem )
  {
    checkIndex(index);
    Node<E> prev = first;
    Node<E> next = first.getNext();
    int idx = 1;
    
    if(index == 0) {
      return addFirst(elem);
    }
    if(index == size) {
      return addLast(elem);
    }
    
    while(prev.getNext() != null) {
      if(idx == index) {
        prev.setNext( new Node<E>(elem) );
        prev.getNext().setNext( next );
        size++;
        return true;
      }
      prev = next;
      next = next.getNext();
      idx++;
    }
    return false;
  }
  
  public boolean addFirst(E elem) {
    Node<E> temp  = new Node<E>(elem);
    temp.setNext( first );
    first = temp;
    return true;
  }
  
  public boolean addLast(E elem) {
    Node<E> temp  = new Node<E>(elem);
    last.setNext( temp );
    last = temp;
    size++;
    return true;
  }

  @Override
  public E get( int index )
  {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public void set( int index, E elem )
  {
    // TODO Auto-generated method stub
    
  }

  @Override
  public boolean contains( Object o )
  {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public int indexOf( Object o )
  {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public int size()
  {
    return size;
  }

  @Override
  public E remove( int index )
  {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public boolean remove( Object o )
  {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public Iterator<E> iterator()
  {
    // TODO Auto-generated method stub
    return null;
  }
  
  public void printList() {
    Node<E> temp = first;
    System.out.println(temp.getElement());
    while(temp.getNext() != null) {
      temp = temp.getNext();
      System.out.println(temp.getElement());
    }
  }

  private void checkIndex(int index) {
    if(index < 0 || index > size) {
      throw new ArrayIndexOutOfBoundsException();
    }
  }

}
