/**
 * file: KeyPad.java
 * author: Dayna Dunninger
 * course: CMPT 220
 * assignment: Lab 2
 * due date: September 14, 2016
 * version: 1.0
 * 
 * This file contains the code to have a user input a letter and the output of the 
 * corresponding number will show.
 */

import java.util.Scanner;

public class KeyPad {

/**The code for this problem first prompts the user to input a letter. Depending on
 * how they input the letter, the code then converts the letter to lowercase. Then, 
 * with the use of switch statements, numbers are assigned to certain letters when 
 * entered. Then the code has the number show up on the screen and if anything other 
 * than a letter is entered, it comes back invalid.
 */
 
  public static void main(String[] args){
    
    //prompts the user to enter in a letter of their choice.
    System.out.println("Enter a letter: ");
    Scanner input = new Scanner(System.in);
    String p = input.next();
    
    //This makes sure that the letter entered is in lowercase form.
    char q = p.toLowerCase().charAt(0);
    int n;

    /**This switch statement goes through each of the letters that could be entered and 
     * assigns numbers to it accordingly.
     */
    switch (q) {
      case 'a':
      case 'b':
      case 'c':
        n = 2;
      break;
 
      case 'd':
      case 'e':
      case 'f':
        n = 3;
      break;
 
      case 'g':
      case 'h':
      case 'i':
        n = 4;
      break;
 
      case 'j':
      case 'k':
      case 'l':
        n = 5;
      break;
 
      case 'm':
      case 'n':
      case 'o':
        n = 6;
      break;
     
      case 'p':
      case 'q':
      case 'r':
      case 's':
        n = 7;
      break;
     
      case 't':
      case 'u':
      case 'v':
        n = 8;
      break;
     
      case 'w':
      case 'x':
      case 'y':
      case 'z':
        n = 9; 
      break;
     
      default:
        n = 0;
      break;
    }
    
    //This statement has the number printed to the screen to tell the user the number.    
    if (n != 0) {
      System.out.print("The corresponding number is " + n);
      System.exit(0);
    }
    
    //This prints out invalid if something other than a letter is entered.    
    System.out.print(q + " is an invalid input");
  }
}