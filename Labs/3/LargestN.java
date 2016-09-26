/**
 * file: LargestN5_13.java
 * author: Dayna Dunninger
 * course: CMPT 220
 * assignment: Lab 3
 * due date: September 22, 2016
 * version: 1.0
 * 
 * This file contains the code to find the largest integer that, when cubed, 
 * is less than 12,000.
 */
 
public class LargestN5_13 {
 
/**In this program I use a while statement to go through integers up to n, 
 * where n is the largest number that when cubed is less than 12,000.
 */ 
 
  public static void main(String[] args) {
 
    //This declares an integer, n.
    int n = 0;
    
    //This increases n until it reaches 12,000 when cubed.
    while (Math.pow(n, 3) <= 12000) {
      n++;
    }
    
    //This lowers n by one to get the greatest n below 12,000.
    n--;
  
    //Prints out n and n cubed to the screen based off of the answer.
    System.out.println("n is " + n);
    System.out.println("n^3 is " + Math.pow(n, 3));
  }
 
}
