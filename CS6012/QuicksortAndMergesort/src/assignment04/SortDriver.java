package assignment04;

import java.util.ArrayList;
import java.util.Random;

public class SortDriver {
  
  public static void main(String[] args) {
    long startTime, midpointTime, stopTime, totalTime;
    
    // First, spin computing stuff until one second has gone by.
    // This allows this thread to stabilize.
    //int wordCount = 3000;
    // String[] testInput = generateRandomString(11, wordCount);
    
    for(int inputSize = 100; inputSize < 1000; inputSize+=100){
      
      ArrayList<Integer> originalArray = SortUtil.generateWorstCase(inputSize);
      
      
      
      System.out.println("Input");
      System.out.println(inputSize);
      
      
      
      
      startTime = System.nanoTime();
      while (System.nanoTime() - startTime < 1000000000) {
      }
      
      // Now, run the test.
      
      long timesToLoop = 10;
      
      
      totalTime = 0;
      
      for (long i = 0; i < timesToLoop; i++) {
        ArrayList<Integer> copiedArray = new ArrayList<Integer>();
        for(int j = 0; j < originalArray.size(); j++){
          copiedArray.add(originalArray.get(j));
          
        }
        startTime = System.nanoTime();
        SortUtil.quicksort(copiedArray, new NumberComparator());
        //SortUtil.mergesort(copiedArray, new NumberComparator(), 15);
        stopTime = System.nanoTime();
        totalTime += stopTime - startTime;
        
        // Place CODE HERE
      }
      
      double averageTime = (double)totalTime / timesToLoop;
      //System.out.println("Threshold");
      //System.out.println(threshold);
      System.out.println(averageTime);
      
      
      System.out.println();
    }
  }
  
}
