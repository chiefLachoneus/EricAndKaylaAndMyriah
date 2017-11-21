package assignment04;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner; 


public class TimingDriver {
  
  public static ArrayList<String> scanFile(String filename) {
    ArrayList<String> words = new ArrayList<String>(); 
    
    Scanner scanner;
    try {
      scanner = new Scanner(new File(filename));
      
      while(scanner.hasNext()) {
        String word = scanner.next(); 
        words.add(word);
      }
      scanner.close(); 
    } catch (FileNotFoundException e) {
      System.out.println("FILE NOT FOUND");
      e.printStackTrace();
    } 
    
    return words; 
  }
  
  public static void main(String[] args) {
    scanFile("src/assignment04/large_word_list.txt"); 
    
  }
  
}
