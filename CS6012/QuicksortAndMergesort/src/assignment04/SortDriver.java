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
      while (System.nanoTime() - startTime < 1000000000) { // empty block
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
        //SortUtil.quicksort(copiedArray, new IntComparator());
        SortUtil.mergesort(copiedArray, new IntComparator(), 15);
        stopTime = System.nanoTime();
        totalTime += stopTime - startTime;
        
        // Place CODE HERE
      }
      
      double averageTime = (double)totalTime / timesToLoop;
      //System.out.println("Threshold");
      //System.out.println(threshold);
      System.out.println(averageTime);
      
      
      
      
      //midpointTime = System.nanoTime();
      
      // Run an empty loop to capture the cost of running the loop.
      
     // for (long i = 0; i < timesToLoop; i++) { // empty block
        
      //  for(int j = 0; j < originalArray.size(); j++){
       //   copiedArray.set(j, originalArray.get(j));
          
       // }
        
     // }
      
      
      
      // Compute the time, subtract the cost of running the loop
      // from the cost of running the loop and computing square roots.
      // Average it over the number of runs.
      
      //double averageTime = ((midpointTime - startTime) - (stopTime - midpointTime)) / timesToLoop;
      //System.out.println("Threshold value: " + threshold);
     // System.out.println("It takes exactly " + averageTime + " nanoseconds");
      
    
    System.out.println();
   }
    
  }
  
//  private static final String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
//  
//  private static int getRandomNumber() {
//    int randomInt = 0;
//    Random randomGenerator = new Random();
//    randomInt = randomGenerator.nextInt(alphabet.length());
//    if (randomInt - 1 == -1) {
//      return randomInt;
//    } else {
//      return randomInt - 1;
//    }
//  }
//  
//  public static String[] generateRandomString(int length, int numberOfStrings) {
//    
//    String[] stringArray = new String[numberOfStrings];
//    String strToAdd = null;
//    
//    for (int i = 0; i < numberOfStrings; i++) {
//      for (int j = 0; j < length; j++) {
//        int number = getRandomNumber();
//        strToAdd += alphabet.charAt(number);
//        
//      }
//      stringArray[i] = strToAdd;
//    }
//    return stringArray;
//  }
  
}
