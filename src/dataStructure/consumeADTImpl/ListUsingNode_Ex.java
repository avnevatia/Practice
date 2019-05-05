package dataStructure.consumeADTImpl;

import dataStructure.abstractDataTypeImpl.ListUsingNode;

public class ListUsingNode_Ex
{

  public static void main( String[] args )
  {

    ListUsingNode<Integer> intLinkedList = new ListUsingNode<Integer>();
    ListUsingNode<String> stringLinkedList = new ListUsingNode<String>();
    int len = 9;

    for( int i = 0; i < len; i++ )
    {
      intLinkedList.add( i + 1 );
      stringLinkedList.add( i + 1 + "" );
    }

    System.out.println( "Int Size:" + intLinkedList.size() );
//    System.out.println( "String Size:" + stringLinkedList.size() );
    
    intLinkedList.printList();
    
    System.out.println( "" );

//    stringLinkedList.printList();

//    intLinkedList.remove( 3 );
    intLinkedList.add( 0, 0 );
    intLinkedList.add( 5, 0 );
    intLinkedList.add( intLinkedList.size(), 10 );
//    intLinkedList.add( 4, 20 );
    
    System.out.println( "Int Size:" + intLinkedList.size() );
    
    intLinkedList.printList();
    
//    System.out.println( "Index is " + stringLinkedList.indexOf( "3" ) + " " );
//    stringLinkedList.remove( "3" );
//    System.out.println( "contains " + stringLinkedList.contains( "3" ) + " " );

  }

}
