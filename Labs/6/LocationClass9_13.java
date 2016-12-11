/**
 * file: LocationClass9_13.java
 * author: Dayna Dunninger
 * course: CMPT 220
 * assignment: Lab 6
 * due date: October 20, 2016
 * version: 1.0
 * 
 * This program contains the code to create a class that locates the largest 
 * number in a two dimensional array.
 */
 
import java.util.Scanner;
 
public class LocationClass9_13 {
   
  /**In this program I first ask for user input for the size of the array I want
   * as well as for the elements in the array. I then implement the location class 
   * that I created in order to determine the exact location of the largest element
   * by the row and column. The value of the largest element and where it is
   * located is then printed to the screen.
   */
   
  public static void main(String[] args) { 
    //This creates a scanner that allows the user to input information.
    Scanner input = new Scanner(System.in);
    //This prompts the user to input the number of rows in the matrix.
    System.out.println("Enter the number of rows in the matrix: ");
    int r = input.nextInt();
    //This prompts the user to input the number of columns in the matrix.
    System.out.println("Enter the number of columns in the matrix: ");
    int c = input.nextInt();
    //This creates the array used to locate the largest element in the array.
    double[][] userArray = new double[r][c];
    //This for loop goes through to prompt the user to input the elements in the array.
    System.out.println("Enter the elements of the array:");
   
    for(int i = 0; i < userArray.length; i++) {
      for(int j = 0; j < userArray[i].length; j++) {
        userArray[i][j] = input.nextDouble();
      }
    }
    //This calls the location class that I created as well as the method in order to determine the locaiton.
    Location element = locateLargest(userArray);
    //This prints the largest element with its location in the array to the screen.
    System.out.println("The largest element is " + element.maxValue + " located at (" + 
      (element.row + 1) + ", " + (element.column + 1) + ").");
  }
  //This is a method created to call the Location class for the main code above.
  public static Location locateLargest(double[][] a){
    return new Location(a);
  }
  //This is the location class which determines the location of the largest element.
  public static class Location {
    int row;
    int column;
    double maxValue;
    //This sets a default location for the elements
    Location(double[][] a) {
      row = 0;
      column = 0;
      maxValue = a[0][0];
      //Goes through each element in the matrix and finds the largest value and its location.
      for(int i = 0; i < a.length; i++) { 
        for(int j = 0; j < a[i].length; j++) {
          if(a[i][j] > maxValue) {
            maxValue = a[i][j];
            row = i;
            column = j;
          }
        }
      }
    }
  }
  
}