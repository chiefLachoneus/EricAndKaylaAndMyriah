package assignment04;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class SortUtil {
  /**
   * This generic method sorts the input array using an insertion sort and the
   * input Comparator object.
   * 
   * @param item
   * @param comparator
   */
  public static <T> void insertionSort(ArrayList<T> myArrayList, Comparator<? super T> comparator) {
    T index;
    for (int i = 1; i < myArrayList.size(); i++) {
      index = myArrayList.get(i);
      int j = i;
      while (j > 0 && comparator.compare(myArrayList.get(j - 1), index) > 0) {
        myArrayList.add(j, myArrayList.get(j - 1));
        j--;
      }
      myArrayList.add(j, index);
    }
<<<<<<< HEAD
    
=======
>>>>>>> c0ffd584d27aad188c9f9239d61706738771ee29
  }
  
  /**
   * This method performs a mergesort on the generic ArrayList given as input. For
   * the mergesort algorithm, see the class notes and/or the textbook. Your
   * mergesort implementation must switch over to insertion sort when the size of
   * the sublist to be sorted meets a certain threshold (i.e., becomes small
   * enough). Make this threshold value a private static variable that you can
   * easily change. You will perform experiments to determine which threshold
   * value works best (see the Analysis Document). Don't forget to include the
   * insertion sort in the program files you submit.
   * 
   * @param myArrayList
   * @param comparator
   */
  public static <T> void mergesort(ArrayList<T> myArrayList, Comparator<? super T> comparator) {
    // need to call insertionSort() method somewhere in here, may have to
    // reconfigure the code a bit
    /*
     * FROM HIS SLIDES, pseudocode void MergeSort(int[] arr, int start, int end) {
     * // arrays of size 1 are already sortedif(start >= end) { return; } int mid =
     * (start + end) /2; MergeSort(arr, start, mid); // left halfMergeSort(arr,
     * mid+1, end); // right halfMerge(arr, start, mid, end); //merge halves}
     * 
     * ///NEXT METHOD void Merge(int[] arr, int[] temp, int start, int mid, int
     * end){ int i1 = 0, i2 = mid;while(i1 < mid && i2 < end){ put smaller of
     * arr[i1], arr[i2] in to temp increment appropriate i} copy anything left over
     * from larger half to tempcopy temp from (start to end) back int to arr (from
     * start to end) }
     */
  }
  
  /**
   * This method performs a quicksort on the generic ArrayList given as input.
   * 
   * For the quicksort algorithm, see the class notes and/or the textbook. You
   * must implement three different strategies for determining the pivot. Your
   * quicksort implementation should be able to easily switch among these
   * strategies. (Consider using a few private helper methods for your different
   * pivot selection strategies.) You will perform experiments to determine which
   * pivot strategy works best (see the Analysis Document). Your quicksort may
   * also switch to insertion sort on some small threshold if you wish.
   * 
   * In designing a strategy for choosing a pivot, keep in mind that its running
   * time affects the overall running time of the quicksort.
   * 
   * Note: The above two methods are intended to be driver methods. You will need
   * to write recursive methods that contain the full implementations of the
   * sorts. See the lecture on recursion for more info on driver methods.
   * 
   * @param myArrayList
   * @param comparator
   */
  public static <T> void quicksort(ArrayList<T> myArrayList, Comparator<? super T> comparator) {
    
  }
  
  public static ArrayList<Integer> generateBestCase(int size) {
    // This method generates and returns an ArrayList of integers 1 to size in
    // ascending order.
    
    ArrayList<Integer> myArrayList = new ArrayList<>();
    
    for (int i = 1; i <= size; i++) {
      
      myArrayList.add(i);
      
    }
    
    return myArrayList;
    
  }
  
  /**
   * This method generates and returns an ArrayList of integers 1 to size in
   * permuted order (i,e., randomly ordered). I will show you in class how to
   * permute a list.
   * 
   * @param size
   * @return
   */
  public static ArrayList<Integer> generateAverageCase(int size) {
    
    // This method generates and returns an ArrayList of integers 1 to size in
    // permuted order (i,e., randomly ordered). I will show you in class how to
    // permute a list.
    
    Random rand = new Random(17);
    ArrayList<Integer> myArrayList = new ArrayList<>();
    
    for (int i = 1; i <= size; i++) {
      
      myArrayList.add(i);
      
    }
    
    for (int i = 0; i < size; i++)
      swap(myArrayList, i, rand.nextInt(size));
    
    return myArrayList;
    
  }
  
  public static void swap(ArrayList<Integer> myArrayList, int i, int randNum) {
    
    int temp;
    
    temp = myArrayList.get(i);
    myArrayList.set(i, myArrayList.get(randNum));
    myArrayList.set(randNum, temp);
    
  }
  
  /**
   * This method generates and returns an ArrayList of integers 1 to size in
   * descending order.
   * 
   * @param size
   * @return
   */
  public static ArrayList<Integer> generateWorstCase(int size) {
    
    // This method generates and returns an ArrayList of integers 1 to size in
    // descending order.
    
    ArrayList<Integer> myArrayList = new ArrayList<>();
    
    for (int i = size; i >= 1; i--) {
      
      myArrayList.add(i);
      
    }
    
    return myArrayList;
    
  }
  
}