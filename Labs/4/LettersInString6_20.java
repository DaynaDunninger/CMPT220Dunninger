/**
 * file: LettersInString6_20.java
 * author: Dayna Dunninger
 * course: CMPT 220
 * assignment: Lab 4
 * due date: September 29, 2016
 * version: 1.0
 * 
 * This file contains the code to count the number of letters in a string given
 * by the user.
 */

import java.util.Scanner;

public class LettersInString6_20 {

/**In this problem I first create a prompt for the user to input a string of 
 * any length. I then create two different methods in order to first, go through
 * each character that is entered and then count them. The next method makes sure
 * that the only things that are counted are letters and not spaces or punctuation.
 * The amount of letters that are in the string are then printed to the screen.
 */

  public static void main(String[] args) {
    //This prompts the user to input a string of their choice.
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a string of any length: ");
    String s = input.nextLine();
  
    //This prints the number of letters in the string to the console.
    System.out.println("There are " + countLetters(s) + " letters in the string.");
  }
  
  //This method counts the number of letters in the string depending on which are letters.
  public static int countLetters(String s) {
    //Declares a variable of letter counter.
    int letterCounter = 0;
    
    //This goes through each of the characters and counts them depending if they're letters.
    for(int i = 0; i < s.length(); i++) {
      if (isLetter(s.charAt(i))) {
        letterCounter++;
      }
    }
    return letterCounter;
  }
  
  //This method determines which characters are letters which determines if they should be counted.
  public static boolean isLetter(char c) {
    
    return ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'));
    
  }
}
