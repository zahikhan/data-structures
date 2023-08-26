package com.zahid.datastructure.demo;

import java.util.*;

import com.zahid.datastructure.demo.algorithms.AlgorithmUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BubbleSortTest {
  @Test
  void testBubbleSortIsWorking_shouldPass() {
    List<Integer> original = Arrays.asList(5, 4, 3, 2, 1);
    List<Integer> expected = original.stream().sorted().toList();

    AlgorithmUtils.binarySort(original);

    Assertions.assertEquals(original, expected);
  }
}
