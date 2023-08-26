package com.zahid.datastructure.demo.algorithms;

import java.util.List;

public final class AlgorithmUtils {
    //NON INSTANTIABLE UTILITY CLASS
   private AlgorithmUtils(){
       throw new AssertionError("Non instantiable Utility Class");
   }


    public static void insertionSort(List<Integer> original) {
      for (int loop = 0; loop < original.size(); loop++) {
        int currentValue = original.get(loop);
        int iloop = loop - 1;
        for (; iloop >= 0 && original.get(iloop) > currentValue; iloop--) {
          original.set(iloop + 1, original.get(iloop));
        }
        original.set(iloop + 1, currentValue);
      }
    }

    public static void binarySort(List<Integer> list) {
      int size = list.size();
      for (int loop = 0; loop < size - 1; loop++) {
        for (int iloop = 0; iloop < size - loop - 1; iloop++) {
          Integer next = list.get(iloop + 1);
          Integer curret = list.get(iloop);
          if (curret > next) {
            Integer temp = curret;
            list.set(iloop, next);
            list.set(iloop + 1, temp);
          }
        }
      }
    }
}
