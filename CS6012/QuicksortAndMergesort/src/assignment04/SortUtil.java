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
  public static <T> void insertionSort(ArrayList<T> myArrayList, Comparator<? super T> comparator, int start, int end) {
    T index;
    for (int i = start; i < end; i++) {
      index = myArrayList.get(i);
      int j = i;
      while (j > start && comparator.compare(myArrayList.get(j - 1), index) > 0) {
        myArrayList.set(j, myArrayList.get(j - 1));
        j--;
      }
      myArrayList.set(j, index);
    }
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
  public static <T> void mergesort(ArrayList<T> myArrayList, Comparator<? super T> comparator, int threshold) {    
    int start = 0;
    int end = myArrayList.size() - 1;
    
    //create temp array and set it to the size of the original array
    ArrayList<T> tempArray = new ArrayList<T>(myArrayList.size());
    
    tempArray.addAll(myArrayList); //prevents index out of bounds
    
    //call the other mergesort method
    mergeSort(myArrayList, comparator, start, end, tempArray, threshold);
    
  }
  
  /**
   * This method is the recursive mergeSort method called in the driver, mergesort above
   * @param myArrayList
   * @param comparator
   * @param start
   * @param end
   * @param tempArray
   * @param threshold
   */
  public static <T> void mergeSort(ArrayList<T> myArrayList, Comparator<? super T> comparator, int start, int end,
      ArrayList<T> tempArray, int threshold) {
    
    int mid = 0;
    
    //base case 1
    //if the end of the array - start of the array is less than the threshold defined, use insertion sort
    if((end - start) < threshold) {
      insertionSort(myArrayList, comparator, start, end);
      return;
    }
    
    //base case 2
    //if the start of the array is greater than or equal to the end, return out of the function
    if (start >= end) {
      return; 
    }
    
    //calculate the middle position of the array
    mid = (start + end) / 2;
    
    //recursive calls
    mergeSort(myArrayList, comparator, start, mid, tempArray, threshold);
    mergeSort(myArrayList, comparator, mid + 1, end, tempArray, threshold);
    
    //call merge after recursive calls are complete
    merge(myArrayList, comparator, start, mid, end, tempArray);
    
  }
  
  /**
   * Method merges all arrays into one array
   * @param myArrayList
   * @param comparator
   * @param start
   * @param mid
   * @param end
   * @param tempArray
   */
  public static <T> void merge(ArrayList<T> myArrayList, Comparator<? super T> comparator, int start, int mid, int end,
      ArrayList<T> tempArray) {
    int k = start;
    int i = start;
    int j = mid + 1;
    
    
    
    while (i <= mid && j <= end) {
      //use comparator to compare i (start) and j (mid + 1), if they are less than zero then value at i < value at j
      if (comparator.compare(myArrayList.get(i), myArrayList.get(j)) < 0) {
        tempArray.set(k, myArrayList.get(i));
        i++;
      } else {
        tempArray.set(k, myArrayList.get(j));
        j++;
      }
      
      k++;
    }
    
    //sets data from the first array (after split)
    while (i <= mid) {
      tempArray.set(k, myArrayList.get(i));
      i++;
      k++;
    }
    
    //sets data from the second array (after split)
    while (j <= end) {
      tempArray.set(k, myArrayList.get(j));
      j++;
      k++;
    }
    
    //set the data in the temporary array
    for (int x = start; x <= end; x++) {
      myArrayList.set(x, tempArray.get(x));
    }
    
  }
  
  /**
   * This method performs a quicksort on the generic ArrayList given as input.
   * 
   * Note: The above two methods are intended to be driver methods. You will need
   * to write recursive methods that contain the full implementations of the
   * sorts. See the lecture on recursion for more info on driver methods.
   * 
   * @param myArrayList
   * @param comparator
   */
  public static <T> void quicksort(ArrayList<T> myArrayList, Comparator<? super T> comparator) {
    quicksort(myArrayList, comparator, 0, myArrayList.size() - 1);
  }
  
  /**
   * method is called by the quicksort driver, sets the pivot index and recurses through quicksort method
   * @param myArrayList
   * @param comparator
   * @param left
   * @param right
   */
  private static <T> void quicksort(ArrayList<T> myArrayList, Comparator<? super T> comparator, int left, int right) {
    // arrays of size 1 already sorted.
    if (left >= right) {
      return;
    }
    
    int pivotIndex = partition(myArrayList, comparator, left, right);
    quicksort(myArrayList, comparator, left, pivotIndex - 1);
    quicksort(myArrayList, comparator, pivotIndex + 1, right);
  }
  
  /**
   * partition finds the pivot, calls comparator and swap
   * @param myArrayList
   * @param comparator
   * @param left
   * @param right
   * @return
   */
  private static <T> int partition(ArrayList<T> myArrayList, Comparator<? super T> comparator, int left, int right) {
    // find pivot and swap with right bound. Could be done in various ways.
    Random rValue = new Random();
    int pivotIndex = rValue.nextInt(right - left) + left;
    
    swap(myArrayList, pivotIndex, right);
    
    pivotIndex = right;
    T pivotValue = myArrayList.get(pivotIndex);
    
    int L = left;
    int R = right - 1;
    
    while (L <= R) {
      if (comparator.compare(myArrayList.get(L), pivotValue) <= 0) {
        L++;
        continue;
      }
      if (comparator.compare(myArrayList.get(R), pivotValue) >= 0) {
        R--;
        continue;
      }
      
      swap(myArrayList, L, R);
      L++;
      R--;
    }
    swap(myArrayList, L, right);
    
    return L;
  }
  
  /**
   * method generates the best case scenario given a size
   * returns and ArrayList of integers 1 to size in ascending order
   * @param size
   * @return
   */
  public static ArrayList<Integer> generateBestCase(int size) {
    
    ArrayList<Integer> myArrayList = new ArrayList<>();
    
    for (int i = 1; i <= size; i++) {
      
      myArrayList.add(i);
      
    }
    
    return myArrayList;
    
  }
  
  /**
   * This method generates and returns an ArrayList of integers 1 to size in
   * permuted order (i,e., randomly ordered). 
   * 
   * @param size
   * @return
   */
  public static ArrayList<Integer> generateAverageCase(int size) {
    Random rand = new Random(17);
    ArrayList<Integer> myArrayList = new ArrayList<>();
    
    for (int i = 1; i <= size; i++) {
      
      myArrayList.add(i);
      
    }
    
    for (int i = 0; i < size; i++)
      swap(myArrayList, i, rand.nextInt(size));
    
    return myArrayList;
    
  }
  
  /**
   * This method swaps the value of the lhs and rhs
   * @param myArrayList
   * @param valueLHS
   * @param valueRHS
   */
  public static <T> void swap(ArrayList<T> myArrayList, int valueLHS, int valueRHS) {
    
    T temp;
    
    temp = myArrayList.get(valueLHS);
    myArrayList.set(valueLHS, myArrayList.get(valueRHS));
    myArrayList.set(valueRHS, temp);
    
  }
  
  /**
   * This method generates and returns an ArrayList of integers 1 to size in
   * descending order.
   * 
   * @param size
   * @return
   */
  public static ArrayList<Integer> generateWorstCase(int size) {
    ArrayList<Integer> myArrayList = new ArrayList<>();
    
    for (int i = size; i >= 1; i--) {
      
      myArrayList.add(i);
      
    }
    
    return myArrayList;
    
  }
  
}