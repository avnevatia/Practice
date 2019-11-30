package codeChef;

import java.util.ArrayList;
import java.util.Arrays;

//IMPORT LIBRARY PACKAGES NEEDED BY YOUR PROGRAM
//SOME CLASSES WITHIN A PACKAGE MAY BE RESTRICTED
//DEFINE ANY CLASS AND METHOD NEEDED
//CLASS BEGINS, THIS CLASS IS REQUIRED
public class Temp
{
  
  public static void main(String[] args) {
    ArrayList<Integer> tem = new ArrayList<Integer>();
    
    tem.add( 100 );
    tem.add( 180 );
    tem.add( 40 );
    tem.add( 120 );
    tem.add( 10 );
    
    ArrayList<Integer> tem1 = IDsOfPackages(250,  tem);
    System.out.println( tem1 );
  }
// METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
  public static ArrayList<Integer> IDsOfPackages( int truckSpace, ArrayList<Integer> packagesSpace )
  {
    if( truckSpace < 31 || packagesSpace.size() < 2 )
    { return null; }

    ArrayList<Integer> resultList = new ArrayList<Integer>();
    int avaliableSpace = truckSpace - 30;
    int remainingSpace = 0;

    for( int i = 0; i < packagesSpace.size(); i++ )
    {
      remainingSpace = avaliableSpace - packagesSpace.get( i );
      if( remainingSpace > 0 )
      {
        for( int j = i + 1; j < packagesSpace.size(); j++ )
        {
          if( packagesSpace.get( j ) >= 0 && ((remainingSpace - packagesSpace.get( j )) == 0) )
          {
            if(resultList.size() == 2) {
              resultList.set( 0, i );
              resultList.set( 1, j );
            } else {
              resultList.add( 0, i );
              resultList.add( 1, j );
            }
          }
        }
      }
    }

    return resultList;
  }
// METHOD SIGNATURE ENDS
}