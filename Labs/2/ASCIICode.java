/**
 * file: ASCIICode.java
 * author: Dayna Dunninger
 * course: CMPT 220
 * assignment: Lab 2
 * due date: September 14, 2016
 * version: 1.0
 * 
 * This file contains the code to displays the character based off of the ASCII
 * code that is entered by the user.
 */

import java.util.Scanner;

public class ASCIICode {
  
  /**
   * This code first has the user input a ASCII code, which is any integer between
   * 1 and 127, and then displays the integer along with the corresponding character.
   */
  
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    //This prompts the user to input an ASCII code (integer 1-127).
    System.out.println("Enter as ASCII code (an integer between 0 and 127): ");
    int ASCII = input.nextInt();
    
    //This changes the ASCII integer to the character it corresponds to.
    char character = (char)ASCII;
    
    //This prints the integer entered along with the corresponding character to the screen
    System.out.println("The character for ASCII code " + ASCII + " is " + character);    
  }
}