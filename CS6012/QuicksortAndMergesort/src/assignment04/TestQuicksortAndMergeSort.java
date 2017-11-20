package assignment04;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.*;

public class TestQuicksortAndMergeSort {
  ArrayList<String> testWords = new ArrayList<String>();
  ArrayList<String> sortedWords = new ArrayList<String>();
  
  ArrayList<Integer> testNumbers = new ArrayList<Integer>();
  ArrayList<Integer> sortedNumbers = new ArrayList<Integer>();
  
  @Before
  public  void setUp() throws Exception{
    testWords.add("Magic");
    testWords.add("Wizzard");
    testWords.add("Staff");
    testWords.add("Pass");
    
    sortedWords.add("Magic");
    sortedWords.add("Pass");
    sortedWords.add("Staff");
    sortedWords.add("Wizzard");
    
    testNumbers.add(12);
    testNumbers.add(-12);
    testNumbers.add(35);
    testNumbers.add(0);
    testNumbers.add(-35);
    
    sortedNumbers.add(-35);
    sortedNumbers.add(-12);
    sortedNumbers.add(0);
    sortedNumbers.add(12);
    sortedNumbers.add(35);
    
    
  }
  
  @Test
  public void testMergeSortStrings() {
    SortUtil.mergesort(testWords, new WordComparator());
    
    for(int i = 0; i < testWords.size(); i++) {
      System.out.println(testWords.get(i));
      assertTrue(testWords.get(i).equals(sortedWords.get(i)));
    }
  }
  
  @Test
  public void testQuickSortStrings() {
    SortUtil.quicksort(testWords, new WordComparator());
    
    for(int i = 0; i < testWords.size(); i++) {
      System.out.println(testWords.get(i));
      assertTrue(testWords.get(i).equals(sortedWords.get(i)));
    }
  }
  
  @Test
  public void testQuickSortNumbers() {
    SortUtil.quicksort(testNumbers, new NumberComparator());
    
    for(int i = 0; i < testNumbers.size(); i++) {
      System.out.println(testNumbers.get(i));
      assertTrue(testNumbers.get(i).equals(sortedNumbers.get(i)));
    }
  }
  
}
