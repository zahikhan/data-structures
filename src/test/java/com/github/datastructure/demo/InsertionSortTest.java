package com.github.datastructure.demo;

import com.github.datastructure.demo.algorithms.AlgorithmUtils;

import java.util.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class InsertionSortTest {
  @Test
  void testBubbleSortIsWorking_shouldPass() {
    List<Integer> original = Arrays.asList(5, 4, 3, 2, 1);
    List<Integer> expected = original.stream().sorted().toList();

    AlgorithmUtils.insertionSort(original);

    Assertions.assertEquals(original, expected);
  }

  @Test
  void testBubbleSortIsWorking_shouldPassOnOneElement() {
    List<Integer> original = Arrays.asList(5);
    List<Integer> expected = original.stream().sorted().toList();

    AlgorithmUtils.insertionSort(original);

    Assertions.assertEquals(original, expected);
  }

  @Test
  void testBubbleSortIsWorking_shouldPassOnNoElement() {
    List<Integer> original = Arrays.asList();
    List<Integer> expected = original.stream().sorted().toList();

    AlgorithmUtils.insertionSort(original);

    Assertions.assertEquals(original, expected);
  }

  @Test
  void testBubbleSortIsWorking_shouldPassOnTwoElementUnSorted() {
    List<Integer> original = Arrays.asList(3, 1);
    List<Integer> expected = original.stream().sorted().toList();

    AlgorithmUtils.insertionSort(original);

    Assertions.assertEquals(original, expected);
  }

  @Test
  void testBubbleSortIsWorking_shouldPassOnTwoElementSorted() {
    List<Integer> original = Arrays.asList(1, 3);
    List<Integer> expected = original.stream().sorted().toList();

    AlgorithmUtils.insertionSort(original);

    Assertions.assertEquals(original, expected);
  }
}
