/**
 * file: AreaOfPentagon.java
 * author: Dayna Dunninger
 * course: CMPT 220
 * assignment: Lab 2
 * due date: September 14, 2016
 * version: 1.0
 * 
 * This file contains the code to determine the area of a pentagon given the length 
 * from the center to any vertex given by the user.
 */

import java.util.Scanner;

public class AreaOfPentagon {
  
  /**
   * This program allows the user to input a distance of their choice to represent
   * the distance from the center of the hexagon to any vertex. The program then
   * computes the area of the pentagon with the formula given and then displays it
   * to the user.
   */ 
   
  public static void main(String[] args) {
    
    //This allows the user to input a number for the distance from the center to a vertex.
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a length from the center of the pentagon to a vertex: ");
    double r = input.nextDouble();
    
    //This is the equation for any side of the pentagon.
    double s = 2 * r * Math.sin(Math.PI / 5);
    
    //This is the formula for the area of the pentagon given the distance, r, and side, s.
    double area = (5 * Math.pow(s, 2) / (4 * Math.tan(Math.PI / 5)));
    
    //This rounds the area off to two decimal places
    area = Math.round(area * 100) / 100.0;
   
    //This prints the area to the screen.
    System.out.println("The area of the pentagon is " + area);  
  }
} 