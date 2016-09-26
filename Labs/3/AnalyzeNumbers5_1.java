/**
 * file: AnalyzeNumbers5_1.java
 * author: Dayna Dunninger
 * course: CMPT 220
 * assignment: Lab 3
 * due date: September 25, 2016
 * version: 1.0
 * 
 * This file contains the code to calculate the number of positive numbers, 
 * negative numbers, the total, and average of a given set of numbers.
 */


import java.util.Scanner;
 
public class AnalyzeNumbers5_1 {

/**This program computes the average and sum of a certain set of numbers given
 * and then prints out those values along with the number of positive numbers 
 * and number of negative numbers in the set. The numbers are analyzed through
 * if statements and do while loops.
 */
 
  public static void main(String[] args) {
  
    Scanner input = new Scanner(System.in);
    System.out.println("Enter integers, one at a time, until 0 is entered (input ends at 0): ");
    
    //Variables for program initialized.
    int n; 
    int negativeCount = 0;
    int positiveCount = 0;
    double total = 0;
    
    //Allows the user to input the first number
    n = input.nextInt();
    
    //Allows the user to input each number while adding the positives/negatives.
    //Also has the sum be computed as the numbers are input.
    do {
      if (n > 0) {
        positiveCount++;
      } else if (n < 0) {
        negativeCount++;
      } 
      total = total + n;
    } while ((n = input.nextInt()) != 0);
  
    //Has the user be prompted if only zero is entered.
    if ((positiveCount + negativeCount) == 0) {
      System.out.println("Only zero is entered.");
      return;
    }
    
    //Computes the average with the total and number of numbers given by user
    double average = (total / (positiveCount + negativeCount));
    
    //Prints each value to the screen.
    System.out.println("There are " + negativeCount + " negative numbers.");
    System.out.println("There are " + positiveCount + " positive numbers.");
    System.out.println("The total is " + total);
    System.out.println("The average is " + average); 
 }
 
}