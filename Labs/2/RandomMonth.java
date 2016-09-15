/**
 * file: RandomMonth.java
 * author: Dayna Dunninger
 * course: CMPT 220
 * assignment: Lab 2
 * due date: September 14, 2016
 * version: 1.0
 * 
 * This file contains the generating of a random number in which it assigns a month to the
 * corresponding number through separate if statements. 
 */

public class RandomMonth {
  
  /**
  * This program randomly generates a number 1-12 and assigns each of those numbers to a 
  * corresponding month, January-December, which is printed out to the screen.
  */
  
  public static void main(String[] args) {
  
    //This creates a random integer from 1-12 and sets it to the int randNum. 
    int randNum = (int)((Math.random() * 12) + 1);
    
    //Each of these if statements assigns one month to each of the numbers in order, accordingly.
    if (randNum == 1) {
			System.out.println("January");
		}	
		
		if (randNum == 2) {
			System.out.println("February");
		}
		
		if (randNum == 3) {
			System.out.println("March");
		}
		
		if (randNum == 4) {
			System.out.println("April");
		}
		
		if (randNum == 5) {
			System.out.println("May"); 
		}
		
		if (randNum == 6) {
			System.out.println("June");
		}
		
		if (randNum == 7) {
			System.out.println("July");
		}	
    
		if (randNum == 8) {
			System.out.println("August");
    }
    
    if (randNum == 9) {
			System.out.println("September");
    }
    
    if (randNum == 10) {
			System.out.println("October");
    }
    
    if (randNum == 11) {
			System.out.println("November");
    }
    
    if (randNum == 12) {
			System.out.println("December");
    }
	}
}