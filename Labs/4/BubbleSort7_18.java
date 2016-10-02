/**
 * file: .java
 * author: Dayna Dunninger
 * course: CMPT 220
 * assignment: Lab 4
 * due date: September 29, 2016
 * version: 1.0
 * 
 * This file contains the code to find the smallest element in a group of numbers
 * input by the user and display it to the screen.
 */
 
import java.util.Scanner;

public class BubbleSort7_18 {
 
/**In this program, I create a scanner that prompts the user to enter in any 10
 * numbers that they wish. Those numbers are then put into an array and references
 * the method bubbleSort. In the bubbleSort method the list of numbers that is
 * given is filtered numerous times until the numbers are put in order of smallest
 * to largest. These numbers are then printed in a new array for the user to see.
 */
 
  public static void main(String[] args) {
    //This prompts the user to input 10 numbers of their choosing.
    Scanner input = new Scanner(System.in);
    System.out.print("Enter any ten numbers: ");
    //This creates an array of the numbers that are given.  
    double[] num = new double[10];
        
    for (int i = 0; i < num.length; i++) {
      num[i] = input.nextDouble();
    }
    //This references the method of bubbleSort and goes through each of the 10 numbers.
    bubbleSort(num);
    
    //This prints out the numbers after they are sorted.
    System.out.print("The array after the numbers are sorted is: ");
    for (int i = 0; i < num.length; i++){
      System.out.println(num[i]);
    }
  }
  
  //This is a method creates to bubble sort until the numbers are shown smallest to largest.
  public static void bubbleSort(double[] list) {
    //Creates a variable i to be used for elements in the array.
    int i;
    //This first for loop repeats how many times the numbers are sorted.
    for (int k = list.length - 1; k != 0; k--) {
      //This for loop goes through each of the elements and compares each element ot the next.
      for (i = 0; i < k; i++) {
        //This switches the variables if the first is greater than the second.
        if(list[i] > list[i + 1]) {
          double temp = list[i];
          list[i] = list[i + 1];
          list[i + 1] = temp;  
        }
      }
    }
  }
}