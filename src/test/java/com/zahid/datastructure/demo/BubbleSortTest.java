package com.zahid.datastructure.demo;

import java.util.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BubbleSortTest {
    @Test
    void testBubbleSortIsWorking_shouldPass(){
        List<Integer> list = Arrays.asList(5, 4, 3, 2, 1);
        List<Integer> list2 = new ArrayList<>(list);
        Collections.sort(list2);
        
        binarySort(list);

        Assertions.assertEquals(list,list2);
  }

    private void binarySort(List<Integer> list) {
        int size = list.size();
        for (int loop = 0; loop< size-1; loop++){
            for (int iloop = 0; iloop< size -loop-1; iloop++){
                Integer next = list.get(iloop + 1);
                Integer curret = list.get(iloop);
                if(curret > next){
                   Integer temp = curret;
                   list.set(iloop,next);
                   list.set(iloop+1, temp);
                }
            }
        }
    }
}
