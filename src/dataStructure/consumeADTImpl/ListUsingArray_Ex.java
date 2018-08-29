package dataStructure.consumeADTImpl;

import dataStructure.abstractDataType.List;
import dataStructure.abstractDataTypeImpl.ListUsingArray;

public class ListUsingArray_Ex
{

  public static void main( String[] args )
  {

    List<Integer> intArrList = new ListUsingArray<Integer>();
    List<String> stringArrList = new ListUsingArray<String>();
    int len = 9;

    for( int i = 0; i < len; i++ )
    {
      intArrList.add( i + 1 );
      stringArrList.add( i + 1 + "" );
    }

    System.out.println( "Int Size:" + intArrList.size() );
    System.out.println( "String Size:" + stringArrList.size() );
    for( int i = 0; i < intArrList.size(); i++ )
    {
      System.out.print( intArrList.get( i ) + " " );
    }
    System.out.println( "" );
    for( int i = 0; i < stringArrList.size(); i++ )
    {
      System.out.println( stringArrList.get( i ) + " " );
    }

    intArrList.remove( 3 );
    intArrList.add( 3, 20 );
    intArrList.add( 4, 20 );
    System.out.println( "Int Size:" + intArrList.size() );
    System.out.println( "String Size:" + stringArrList.size() );
    for( int i = 0; i < intArrList.size(); i++ )
    {
      System.out.print( intArrList.get( i ) + " " );
    }
    System.out.println( "" );
    for( int i = 0; i < stringArrList.size(); i++ )
    {
      System.out.println( stringArrList.get( i ) + " " );
    }

    System.out.println( "Index is " + stringArrList.indexOf( "3" ) + " " );
    stringArrList.remove( "3" );
    System.out.println( "contains " + stringArrList.contains( "3" ) + " " );

  }

}
