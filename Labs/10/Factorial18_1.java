/**
 * file: Factorial18_1.java
 * author: Dayna Dunninger
 * course: CMPT 220
 * assignment: Lab 10
 * due date: November 17, 2016
 * version: 1.0
 * 
 * This program contains the code to compute factorials using recursion.
 */ 
 
 import java.util.Scanner;
 import java.math.*;
 
public class Factorial18_1 {

  /**This code contains a method I created which uses recursion to find the 
   * factorial of a number given by the user. In the main portion of the code
   * the user is prompted to enter an integer. The method I created is then 
   * invoked and the result is printed to the screen.
   */   

  public static void main(String[] args) {
    //This creates a scanner
    Scanner input = new Scanner(System.in);
    //Prompts the user to enter a number to find the factorial of.
    System.out.println("Enter a positive integer: ");
    int n = input.nextInt();
    //This converts n to a BigInteger from an int.
    BigInteger result = new BigInteger(n + "");
    //This prints the number and its factorial to the screen.
    System.out.println("The factorial of " + n + " is " + factorial(result)); 
  } 
  //This is the method created for finding the factorial.
  public static BigInteger factorial(BigInteger m) {
    //This gives a base case where if the value is zero then 1 is the factorial.
    if(m == BigInteger.ZERO) {
      return BigInteger.ONE;
      //This says that if it isn't the base case then multiply n(n-1)! to find the factorial.
    } else {
      return m.multiply(factorial(m.subtract(BigInteger.ONE)));
    }
    
  }
 }