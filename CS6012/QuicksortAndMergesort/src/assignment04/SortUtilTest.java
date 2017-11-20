package assignment04;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class SortUtilTest {
  private ArrayList<Integer> arrayListOfInts = new ArrayList<>();
  private ArrayList<Integer> sortedArrayListOfInts = new ArrayList<>();
  private ArrayList<Integer> nullArrayList = new ArrayList<>(); 
  private ArrayList<Integer> arrayWithOneInt = new ArrayList<>(); 
  private ArrayList<Integer> bigIntArray = new ArrayList(); 
  private ArrayList<Integer> sortedBigIntArray = new ArrayList(); 
  
  
  @Test
  public void testMergesort() {
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
    
    
    
    // public static <T> void mergesort(ArrayList<T> myArrayList, Comparator<? super T> comparator)
    
    SortUtil.mergesort(arrayListOfInts, new IntComparator());
    
    for(int i = 0; i < arrayListOfInts.size(); i++) {
      System.out.println(arrayListOfInts.get(i));
      assertTrue(arrayListOfInts.get(i).equals(sortedArrayListOfInts.get(i)));
    }
    
    
  }
  
//  @Test
//  public void testNullArrayList() {
//    nullArrayList.add(null); 
//    nullArrayList.add(null);
//    
//    for(int i = 0; i < nullArrayList.size(); i++) {
//      assertTrue(nullArrayList.get(i).equals(nullArrayList.get(i)));
//    }
//    
//  }
  
  @Test
  public void testOneInt() {
    arrayWithOneInt.add(5); 
    
    SortUtil.mergesort(arrayWithOneInt, new IntComparator());
    
    for(int i = 0; i < arrayWithOneInt.size(); i++) {
      assertTrue(arrayWithOneInt.get(i).equals(arrayWithOneInt.get(i)));
    }
  }
  
  @Test
  public void testBigInt() {
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
    
    SortUtil.mergesort(bigIntArray, new IntComparator());
    
    for(int i = 0; i < bigIntArray.size(); i++) {
      assertTrue(bigIntArray.get(i).equals(sortedBigIntArray.get(i)));
    }
  }
  
}
