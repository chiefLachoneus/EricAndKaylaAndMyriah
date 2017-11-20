package assignment04;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Comparator;

import org.junit.Test;

public class SortUtilTest {
  private ArrayList<Integer> arrayListOfInts = new ArrayList<>();
  
  
  @Test
  public void testMergesort() {
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
 // public static <T> void mergesort(ArrayList<T> myArrayList, Comparator<? super T> comparator)
    
    SortUtil.mergesort(arrayListOfInts, new IntComparator());
    
    
  }
  
}
