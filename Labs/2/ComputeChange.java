/**
 * file: ComputeChange.java
 * author: Dayna Dunninger
 * course: CMPT 220
 * assignment: Lab 2
 * due date: September 14, 2016
 * version: 1.0
 * 
 * This file contains the code to figure out how much of each monetary unit,
 * given a certain price from the user, there is in dollars, quarters, dimes
 * nickels, and pennies.
 */

import java.util.Scanner;
 
public class ComputeChange {
  
/**The code in this program begins with the user being prompted to enter a price
 * amount in double form. Then the number is changed to an integer in order to 
 * dicover the amount of dollars and cents, and then we break down each amount from quarters
 * to pennies and output how many there are of each.
 */
  
  public static void main(String[] args) {   
    //This creates a scanner
    Scanner input = new Scanner(System.in);
 
    // Prompts the user to enter a price amount of their choice.
    System.out.print("Enter an amount (for example, 11.56): ");
    String amount = input.next();
    
    //This is the part that increases accuracy in the program.
    int numberOfDollars = Integer.parseInt(amount.substring(0, amount.indexOf('.')));
    int numberOfCents = Integer.parseInt(amount.substring( amount.indexOf('.')+1));
  
    // This determines how many quarters are in the cents.
    int quarters = numberOfCents / 25;
    numberOfCents = numberOfCents % 25;
 
    // This determines how many dimes are in the cents.
    int dimes = numberOfCents / 10;
    numberOfCents = numberOfCents % 10;
 
    // This determines how many nickels are in the cents.
    int nickels = numberOfCents / 5;
    numberOfCents = numberOfCents % 5;
 
    // This determines how many pennies are in the cents.
    int pennies = numberOfCents;
 
    // This prints out what the amount consists of.
    System.out.println("The amount " + amount + " contains " + numberOfDollars + " dollars, "
     + quarters + " quarters, " + dimes + " dimes, " + nickels + " nickels, and " + pennies + " pennies.");
  }
}