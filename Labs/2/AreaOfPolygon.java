/**
 * file: AreaOfPolygon.java
 * author: Dayna Dunninger
 * course: CMPT 220
 * assignment: Lab 2
 * due date: September 14, 2016
 * version: 1.0
 * 
 * This file contains the code to determine the area of a polygon given the number 
 * of sides and the length of the side determined by the user.
 */

 import java.util.Scanner;
 
public class AreaOfPolygon {
   
  /**This program first asks the user to input a certain number of sides for the
   * polygon and then asks for the desired length of those sides. After that the 
   * the area is computed and printed out to the screen using the values given by
   * the user.
   */
   
  public static void main(String[] args) {
    
    //This allows the user to input a certain number of sides for the polygon.    
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the number of sides: ");
    int n = input.nextInt();
    
    //This allows the user to input a desired length for each side.
    System.out.println("Enter the length of a side: ");
    double s = input.nextDouble();
    
    //This calculates the area of the polygon.
    double area = (n * Math.pow(s,2)) / (4 * Math.tan(Math.PI / n));
    
    //This prints the area to the screen.
    System.out.println("The area of the polygon is " + area);
  }
}