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
    // TODO Auto-generated method stub
    return false;
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


}
