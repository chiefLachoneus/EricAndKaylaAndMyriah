package assignment04;

import java.util.ArrayList;
import java.util.Comparator;

public class SortUtil {
	
	/**
	 * 
	 * @param stringToSort
	 * @return
	 */
	public static String insertionSort(String stringToSort) {
		// convert the array to characters, must be lowercase for proper comparison
		char[] strArray = stringToSort.toLowerCase().toCharArray();

		// loop through the array and perform insertion sort
		for (int i = 1; i < strArray.length; i++) {
			char index = strArray[i];
			int j = i;

			while (j > 0 && strArray[j - 1] > index) {
				strArray[j] = strArray[j - 1];
				j--;
			}
			strArray[j] = index;
		}
		// convert the array back to a string and return
		return new String(strArray);
	}
	
	public static <T> void mergesort(ArrayList<T> myArrayList, Comparator<? super T> comparator){
		//need to call insertionSort() method somewhere in here, may have to reconfigure the code a bit
	  
	  /*
	   * FROM HIS SLIDES, pseudocode
	   void MergeSort(int[] arr, int start, int end) {
	   // arrays of size 1 are already sortedif(start >= end) {
	    *  return; 
	    *  }
	    *  int mid = (start + end) /2;
	    *  MergeSort(arr, start, mid); 
	    *  // left halfMergeSort(arr, mid+1, end); 
	    *  // right halfMerge(arr, start, mid, end); 
	    *  //merge halves}
	    *  
	    *  ///NEXT METHOD
	    *  void Merge(int[] arr, int[] temp, int start, int mid, int end){
	    *  int i1 = 0, i2 = mid;while(i1 < mid && i2 < end){
	    *  put smaller of arr[i1], arr[i2] in to temp increment appropriate i}
	    *  copy anything left over from larger half to tempcopy temp from (start to end) back int to arr (from start to end) }
	   */
		
	}

	public static <T> void quicksort(ArrayList<T> myArrayList, Comparator<? super T> comparator){

	//This method performs a quicksort on the generic ArrayList given as input.

	//For the quicksort algorithm, see the class notes and/or the textbook. 
	//You must implement three different strategies for determining the pivot. 
	//Your quicksort implementation should be able to easily switch among these strategies. 
	//(Consider using a few private helper methods for your different pivot selection strategies.) 
	//You will perform experiments to determine which pivot strategy works best (see the Analysis Document). 
	//Your quicksort may also switch to insertion sort on some small threshold if you wish.

	//In designing a strategy for choosing a pivot, keep in mind that its running time affects the overall running time of the quicksort.

	//Note: The above two methods are intended to be driver methods. You will need to write recursive methods 
	//that contain the full implementations of the sorts. See the lecture on recursion for more info on driver methods.

	
	}
	public static ArrayList<Integer> generateBestCase(int size){
		//This method generates and returns an ArrayList of integers 1 to size in ascending order.
		
		ArrayList<Integer> myArrayList = new ArrayList<>();
		
		for(int i = 1; i <= size; i++){
			
			myArrayList.add(i);
			
			
		}
		
		
		
		return myArrayList;

	

	
	}
	public static ArrayList<Integer> generateAverageCase(int size){
		
		//This method generates and returns an ArrayList of integers 1 to size in 
		//permuted order (i,e., randomly ordered). I will show you in class how to permute a list.
		
		ArrayList<Integer> myArrayList = new ArrayList<>();

		for(int i = 1; i <= size; i++){

			myArrayList.add(i);


		}



		return myArrayList;

	

	
	}
	public static ArrayList<Integer> generateWorstCase(int size){
		return null;

	//This method generates and returns an ArrayList of integers 1 to size in descending order.
	
	}
	
	
	
	
	
	

}
