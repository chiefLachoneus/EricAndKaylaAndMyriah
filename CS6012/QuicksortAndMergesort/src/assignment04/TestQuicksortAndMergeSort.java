package assignment04;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.*;

public class TestQuicksortAndMergeSort {
  ArrayList<String> testWords = new ArrayList<String>();
  ArrayList<String> sortedWords = new ArrayList<String>();
  
  ArrayList<Integer> testNumbers = new ArrayList<Integer>();
  ArrayList<Integer> sortedNumbers = new ArrayList<Integer>();
  
  private ArrayList<Integer> arrayListOfInts = new ArrayList<>();
  private ArrayList<Integer> sortedArrayListOfInts = new ArrayList<>();
  private ArrayList<Integer> arrayWithOneInt = new ArrayList<>(); 
  private ArrayList<Integer> bigIntArray = new ArrayList<>(); 
  private ArrayList<Integer> sortedBigIntArray = new ArrayList<>(); 
  
  
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
    
    arrayListOfInts.add(10);
    arrayListOfInts.add(8);
    arrayListOfInts.add(7);
    arrayListOfInts.add(3);
    arrayListOfInts.add(5);
    arrayListOfInts.add(6);
    arrayListOfInts.add(1);
    arrayListOfInts.add(2);
    arrayListOfInts.add(4);
    arrayListOfInts.add(9);
    arrayListOfInts.add(11);
    
    sortedArrayListOfInts.add(1); 
    sortedArrayListOfInts.add(2); 
    sortedArrayListOfInts.add(3); 
    sortedArrayListOfInts.add(4); 
    sortedArrayListOfInts.add(5); 
    sortedArrayListOfInts.add(6); 
    sortedArrayListOfInts.add(7); 
    sortedArrayListOfInts.add(8); 
    sortedArrayListOfInts.add(9); 
    sortedArrayListOfInts.add(10); 
    sortedArrayListOfInts.add(11); 
    
    bigIntArray.add(2147483647);
    bigIntArray.add(2147483500); 
    bigIntArray.add(2147483540); 
    bigIntArray.add(2147483550);
    bigIntArray.add(2147483600); 
    
    sortedBigIntArray.add(2147483500);
    sortedBigIntArray.add(2147483540);
    sortedBigIntArray.add(2147483550);
    sortedBigIntArray.add(2147483600);
    sortedBigIntArray.add(2147483647);
  }
  
  @Test
  public void testMergeSortStrings() {
    SortUtil.mergesort(testWords, new WordComparator(), 10);
    
    for(int i = 0; i < testWords.size(); i++) {
      System.out.println(testWords.get(i));
      assertTrue(testWords.get(i).equals(sortedWords.get(i)));
    }
  }
  
  @Test
  public void testMergeSortNumbers() {
    SortUtil.mergesort(testNumbers, new NumberComparator(), 10);
    
    for(int i = 0; i < testNumbers.size(); i++) {
      System.out.println(testNumbers.get(i));
      assertTrue(testNumbers.get(i).equals(sortedNumbers.get(i)));
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
  
  @Test
  public void testMergesort() {    
    SortUtil.mergesort(arrayListOfInts, new NumberComparator(), 10);
    
    for(int i = 0; i < arrayListOfInts.size(); i++) {
      System.out.println(arrayListOfInts.get(i));
      assertTrue(arrayListOfInts.get(i).equals(sortedArrayListOfInts.get(i)));
    }  
  }
  
  @Test
  public void testOneInt() {
    arrayWithOneInt.add(5); 
    
    SortUtil.mergesort(arrayWithOneInt, new NumberComparator(), 10);
    
    for(int i = 0; i < arrayWithOneInt.size(); i++) {
      assertTrue(arrayWithOneInt.get(i).equals(arrayWithOneInt.get(i)));
    }
  }
  
  @Test
  public void testBigInt() {
    SortUtil.mergesort(bigIntArray, new NumberComparator(), 10);
    
    for(int i = 0; i < bigIntArray.size(); i++) {
      assertTrue(bigIntArray.get(i).equals(sortedBigIntArray.get(i)));
    }
  }
  
}
