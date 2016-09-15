/**
 * file: SortThreeIntegers.java
 * author: Dayna Dunninger
 * course: CMPT 220
 * assignment: Lab 2
 * due date: September 14, 2016
 * version: 1.0
 * 
 * This file contains the code to have a user input three numbers and make it so that the numbers
 * are printed on the screen in increasing order. 
 */

import java.util.Scanner;
 
public class SortThreeIntegers {
   
  /**
  * This program allows the user to enter in three numbers of their choice: num1 num2 and num3. 
  * Then the program proceeds to place the numbers in increasing order through the use of if
  * statements and swapping numbers.
  */
   
  public static void main(String[] args) {
    //This creates a scanner in the code.
    Scanner input = new Scanner(System.in);
     
    //This prompts the user to enter three consecutive numbers as integers.
    System.out.println("Enter the first number as an integer: ");
    int num1 = input.nextInt();
    
    System.out.println("Enter the second number as an integer: ");
    int num2 = input.nextInt(); 
    
    System.out.println("Enter the third number as an integer: ");
    int num3 = input.nextInt();
    
    //Each number is then compared through if statements placing them in increasing order.
    if (num1 > num2) {
      int temp = num1;
      num1 = num2;
      num2 = temp;
    }
    
    if (num2 > num3) {
      int temp = num2;
      num2 = num3;
      num3 = temp;
    }
    
    if (num1 > num2) {
      int temp = num1;
      num1 = num2;
      num2 = temp;
    }
    
    //This prints the numbers in increasing order to the screen.
    System.out.println(num1 + " " + num2 + " " + num3);
  }
}