/**
 * file: Driver_lab3.java
 * author: Dayna Dunninger
 * course: CMPT 220
 * assignment: Lab 3
 * due date: September 22, 2016
 * version: 1.0
 * 
 * This contains the code to calculate the distance between two points that may
 * not necessarily be a straight line from each other, known as the p-norm.
 */
 
import java.util.Scanner;

public class Driver_lab3 {
 
/**In this code I have the user input all of the variables and then use the
 * p-norm equation to calculate the distance.
 */

  public static void main(String[] args) {
  
    //This has the user input all of the variables.
    double x1, x2, y1, y2, p; 
    Scanner input = new Scanner(System.in);
    
    System.out.println("Please enter an x1 value: ");
    x1 = input.nextDouble();
    System.out.println("Please enter a y1 value: ");
    y1 = input.nextDouble();
    System.out.println("Please enter an x2 value: ");
    x2 = input.nextDouble();
    System.out.println("Please enter a y2 value: ");
    y2 = input.nextDouble();
    System.out.println("Please enter a p value (either 1 or 2): ");
    p = input.nextDouble();
    
    //This is the equation for the distance between the two points.
    double output = 
      (Math.pow(Math.pow((Math.abs(x1 - x2)),p) + (Math.pow((Math.abs(y1 -y2)),p)),(1/p)));
    
    //Prints the output to the screen.
    System.out.println(output);
    
  }
 
}