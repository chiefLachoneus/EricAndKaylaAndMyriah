package assignment04;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Comparator;

import org.junit.Test;

public class SortUtilTest<T> {
  private ArrayList<Integer> arrayListOfInts; 
  private Comparator<? super T> comparator; 
  
  @Test
  public void setup() {
    arrayListOfInts.add(8);
    arrayListOfInts.add(10);
    arrayListOfInts.add(7);
    arrayListOfInts.add(3);
    arrayListOfInts.add(5);
    arrayListOfInts.add(6);
    arrayListOfInts.add(1);
    arrayListOfInts.add(2);
    arrayListOfInts.add(4);
    arrayListOfInts.add(9);
    
    comparator = (Comparator<? super T>) new WordComparator(); 
    
  }
  
  
  @Test
  public void test() {
  }
  
  
  @Test
  public void testMergesort() {
 // public static <T> void mergesort(ArrayList<T> myArrayList, Comparator<? super T> comparator)
    
    
  }
  
}
