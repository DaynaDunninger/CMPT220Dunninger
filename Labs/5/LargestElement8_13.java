/**
 * file: LargestElement8_13.java
 * author: Dayna Dunninger
 * course: CMPT 220
 * assignment: Lab 5
 * due date: October 6, 2016
 * version: 1.0
 * 
 * This file contains the code to locate the largest number in a double array
 * and give the location as a coordinate.
 */

import java.util.Scanner;

public class LargestElement8_13 {
  
/**In this program I create a method in order to retrieve the coordinates of the
 * largest number in a two dimensional array. This is done through nested for loops
 * and if statements. In the main method of the program, it has the user input an 
 * array through a scanner and then uses the method created and displays the coordinate
 * to the screen.
 */ 
  
  public static void main(String[] args) {
    //Prompts the user to enter the size of the two dimensional array.
    Scanner input = new Scanner(System.in);
    System.out.printf("Enter the number of rows and the number of columns: ");
    int r = input.nextInt();
    int c = input.nextInt();
    double[][] userArray = new double[r][c];
    
    //This prompts the user to enter in the elements of the array.
    System.out.println("Enter the elements of the array below: ");
    for (int row = 0; row < r; row++) {
      for (int col = 0; col < c; col++) {
        userArray[r][c] = input.nextDouble();
      }
    }
    
    //This uses the method created and gets the coordinate of the largest number.
    int[] location = locateLargest(userArray);
    
    //This prints the location to the screen.
    System.out.print("The largest element can be found at (" + location[0] + "," + location[1] + ")");
  }

  //The method for locating the largest number.
  public static int[] locateLargest(double[][] p) {
    
    int[] largeLocation = new int[] { 0 , 0 };
    double maxValue = p[0][0];
    
    for (int row = 0; row < p.length; row++) {
      for (int col = 0; col < p[row].length; col++) {
        if (p[row][col] >= maxValue) {
          largeLocation[0] = row;
          largeLocation[1] = col;
          maxValue = p[row][col];
        }
      }
    }
    return largeLocation;
  }
    
}