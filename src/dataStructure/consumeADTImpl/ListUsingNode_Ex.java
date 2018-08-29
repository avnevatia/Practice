package dataStructure.consumeADTImpl;

import dataStructure.abstractDataType.List;
import dataStructure.abstractDataTypeImpl.ListUsingNode;

public class ListUsingNode_Ex
{

  public static void main( String[] args )
  {

    List<Integer> intLinkedList = new ListUsingNode<Integer>();
    List<String> stringLinkedList = new ListUsingNode<String>();
    int len = 9;

    for( int i = 0; i < len; i++ )
    {
      intLinkedList.add( i + 1 );
      stringLinkedList.add( i + 1 + "" );
    }

    System.out.println( "Int Size:" + intLinkedList.size() );
    System.out.println( "String Size:" + stringLinkedList.size() );
    for( int i = 0; i < intLinkedList.size(); i++ )
    {
      System.out.print( intLinkedList.get( i ) + " " );
    }
    System.out.println( "" );
    for( int i = 0; i < stringLinkedList.size(); i++ )
    {
      System.out.println( stringLinkedList.get( i ) + " " );
    }

    intLinkedList.remove( 3 );
    intLinkedList.add( 3, 20 );
    intLinkedList.add( 4, 20 );
    System.out.println( "Int Size:" + intLinkedList.size() );
    System.out.println( "String Size:" + stringLinkedList.size() );
    for( int i = 0; i < intLinkedList.size(); i++ )
    {
      System.out.print( intLinkedList.get( i ) + " " );
    }
    System.out.println( "" );
    for( int i = 0; i < stringLinkedList.size(); i++ )
    {
      System.out.println( stringLinkedList.get( i ) + " " );
    }

    System.out.println( "Index is " + stringLinkedList.indexOf( "3" ) + " " );
    stringLinkedList.remove( "3" );
    System.out.println( "contains " + stringLinkedList.contains( "3" ) + " " );

  }

}
