package assignment04;

import java.util.ArrayList;

public class SortDriver {
  
  public static void main(String[] args) {
    long startTime, midpointTime, stopTime, totalTime;
    
    // First, spin computing stuff until one second has gone by.
    // This allows this thread to stabilize.
    ArrayList<Integer> inputSizes = new ArrayList<Integer>();
    
    for (int inputSize = 1000; inputSize <= 100000; inputSize += 1000) {
      
      ArrayList<Integer> originalArray = SortUtil.generateWorstCase(inputSize);
      inputSizes.add(inputSize);
      
      startTime = System.nanoTime();
      while (System.nanoTime() - startTime < 1000000000) {
      }
      
      // Now, run the test.
      long timesToLoop = 10;
      
      totalTime = 0;
      
      for (long i = 0; i < timesToLoop; i++) {
        ArrayList<Integer> copiedArray = new ArrayList<Integer>();
        for (int j = 0; j < originalArray.size(); j++) {
          copiedArray.add(originalArray.get(j));
          
        }
        startTime = System.nanoTime();
//        SortUtil.quicksort(copiedArray, new NumberComparator());
         SortUtil.mergesort(copiedArray, new NumberComparator(), 10);
        stopTime = System.nanoTime();
        totalTime += stopTime - startTime;
      }
      
      double averageTime = (double) totalTime / timesToLoop;
      // System.out.println("Threshold");
      // System.out.println(threshold);
      System.out.println(averageTime);
    }
    for(Integer number: inputSizes) {
      System.out.println(number);
    }
  }
  
}
