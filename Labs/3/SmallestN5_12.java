/**
 * file: SmallestN5_12.java
 * author: Dayna Dunninger
 * course: CMPT 220
 * assignment: Lab 3
 * due date: September 22, 2016
 * version: 1.0
 * 
 * This file contains the code to find the smallest integer that, when squared,
 * is greater than 12,000.
 */

public class SmallestN5_12 {
  
/**In this code, I use a while statement to go through the squares of integers n,
 * and then after the code breaks the highest n, along with its square is printed.
 */  
  
  public static void main(String[] args) {
 
    //This declares an integer n
    int n = 0;
    
    //This creates a limit for the square of n to reach.
    while (Math.pow(n, 2) <= 12000) {
      n++;
    }
    
    //This prints the n and n^2 to the screen.
    System.out.println("n is " + n);
    System.out.println("n squared is " + Math.pow(n, 2));
 
  }
 
}