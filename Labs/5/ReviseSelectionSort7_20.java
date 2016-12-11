/**
 * file: ReviseSelectionSort7_20.java
 * author: Dayna Dunninger
 * course: CMPT 220
 * assignment: Lab 5
 * due date: October 6, 2016
 * version: 1.0
 * 
 * This file contains the code to sort through a collection of numbers given by
 * the user. This way it takes the largest number and moves it to the last
 * until all of the numbers are sorted from smallest to largest.
 */
 
import java.util.Scanner;

public class ReviseSelectionSort7_20 {

/**In order to sort through the numbers accurately to get them in order from
 * smallest to largest, we have to create a method to reference to in order to
 * use it to do the selection sort. In the method created I use for loops with 
 * if statements in order to detect the largest value and swap it with the last.
 * In the main method of the function I use for loops with the use of the method
 * to print the list of numbers to the screen.
 */

  public static void main(String[] args) {
    //This allows the user to enter in 10 integers.
    Scanner input = new Scanner(System.in);
    double[] userInput = new double[10];
    System.out.println("Enter ten numbers: ");
    
    //This for loop goes through each of the numbers 
    for (int i = 0; i < userInput.length; i++) {
      userInput[i] = input.nextDouble();
    }
    
    System.out.println("The numbers after being sorted are: ");
    
    //Goes through the method created that is selectionSort of the numbers.
    selectionSort(userInput);
    
    //This goes through each of the numbers and prints them to the screen.
    for (int i = 0; i < userInput.length; i++) {
      System.out.print(userInput[i] + " ");
    }
  }  
    
  public static void selectionSort(double[] list) {
    //This method takes nested for loops and if statements.
    //The for loops and if statements takes the largest values and switches it with the last.
    
      for (int i = list.length - 1; i > 0; i--) {
        double max = list[i];
        int index = i;
      
        for (int j = 0; j < i; j++) {
          if (max < list[j]) {
            max = list[j];
            index = j;
          }
        }
      
        if (index != i) {
          list[index] = list[i];
          list[i] = max;
        }
      }
  }
  
}