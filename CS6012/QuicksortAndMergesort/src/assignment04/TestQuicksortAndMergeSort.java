package assignment04;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.*;

public class TestQuicksortAndMergeSort {
  ArrayList<String> testWords = new ArrayList<String>();
  ArrayList<String> sortedWords = new ArrayList<String>();
  
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
    
  }
  
  @Test
  public void testMergeSortStrings() {
    SortUtil.mergesort(testWords, new WordComparator());
    
    for(int i = 0; i < testWords.size(); i++) {
      System.out.println(testWords.get(i));
      assertTrue(testWords.get(i).equals(sortedWords.get(i)));
    }
  }
  
}
