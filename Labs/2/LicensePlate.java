/**
 * file: LicensePlate.java
 * author: Dayna Dunninger
 * course: CMPT 220
 * assignment: Lab 2
 * due date: September 14, 2016
 * version: 1.0
 * 
 * This file contains the code to generate a license plate with three letters
 * and four numbers.
 */

public class LicensePlate {

/**This code generates random letters through characters. In the code the letters
 * are generated through Math.random and then using the ASCII code to come up with
 * the letters. The numbers are generated next through String.format and then the 
 * letters and numbers are strung together and printed to the screen at the end.
 */
 
  public static void main(String[] args) {
    //The letters are randomly chosen through this block of code with use of ASCII code.
    char let1 = (char) ((int)(Math.random() * 26 + 65));
    char let2 = (char) ((int)(Math.random() * 26 + 65));
    char let3 = (char) ((int)(Math.random() * 26 + 65));
   
    //This generates a number of four digits to follow the letters. 
    int num =  (int)(Math.random() * 9000 + 999);
  
    //The combination is now printed to the screen through this.  
    System.out.println("The plate number is " + let1 + let2 +let3 + num); 
  }
}