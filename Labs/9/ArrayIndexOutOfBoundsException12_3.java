/**
 * file: ArrayIndexOutOfBoundsException12_3.java
 * author: Dayna Dunninger
 * course: CMPT 220
 * assignment: Lab 9
 * due date: November 10, 2016
 * version: 1.0
 * 
 * This program contains the code to tell the user to 
 */ 
 
import java.util.Scanner;

public class ArrayIndexOutOfBoundsException12_3 {
  
  
  public static void main(String[] args) {
    //This generates a random array full of integers
    int[] randomArray = new int[100];
    for (int i = 0; i < 100; i++) {
      randomArray[i] = (int) ((Math.random() * 100) + 1);
    }
    //This creates a scanner and prompts the user to input an index for the array
    Scanner input = new Scanner(System.in);
    System.out.println("Enter an index in the array: ");
    //This prints the randomly generated number to the screen
    try {
      System.out.println("The element at index " + input.nextInt() + " is " +
        randomArray[input.nextInt()] + ".");
      //This returns that the index is out of bounds if the index is not within the range.  
    } catch (ArrayIndexOutOfBoundsException ex) {
      System.out.println("That index is out of bounds.");
    }
  }
}