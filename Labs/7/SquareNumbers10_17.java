/**
 * file: SquareNumbers10_17.java
 * author: Dayna Dunninger
 * course: CMPT 220
 * assignment: Lab 7
 * due date: October 27, 2016
 * version: 1.0
 * 
 * This program contains the code to find the first ten square numbers that
 * are greater than a maximum value and display the results.
 */ 
 
 import java.math.BigInteger;
 
public class SquareNumbers10_17 {
  
  public static void main(String[] args) {
  //This runs through the numbers int the method below and prints them to the screen
    for(int i = 0; i < 10; i++){
      System.out.println(squared(i));
    }
    
  }  
    
  public static BigInteger squared(long n) {
    //This declares the values for the for loop below.
    BigInteger p = new BigInteger.valueOf(Long.MAX_VALUE);
    BigInteger q = p.multiply(p);
    //This goes through and finds the first ten squared numbers after the max value constant
    for(int i = 1; i < 10; i++) {
      p = BigInteger.valueOf((Long.MAX_VALUE + i));
      q = p.multiply(p);
    }
    return q;
  }
   
}