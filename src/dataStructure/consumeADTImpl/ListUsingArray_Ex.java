package dataStructure.consumeADTImpl;

import dataStructure.abstractDataType.List;
import dataStructure.abstractDataTypeImpl.ListUsingArray;

public class ListUsingArray_Ex {

   public static void main(String[] args) {

      List<Integer> intArrList = new ListUsingArray<Integer>();
      int len = 9;

      for (int i = 0; i < len; i++) {
         intArrList.add(i + 1);
      }

      System.out.println("Size:" + intArrList.size());
      for (int i = 0; i < intArrList.size(); i++) {
         System.out.print(intArrList.get(i) + " ");
      }

      intArrList.remove(3);
      // intArrList.add(3, 20);
      // intArrList.add(4, 20);
      System.out.println("Size:" + intArrList.size());
      for (int i = 0; i < intArrList.size(); i++) {
         System.out.print(intArrList.get(i) + " ");
      }

   }

}
