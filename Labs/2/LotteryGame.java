/**
 * file: LotteryGame.java
 * author: Dayna Dunninger
 * course: CMPT 220
 * assignment: Lab 2
 * due date: September 14, 2016
 * version: 1.0
 * 
 * This file contains the code to determine if the three digit number that is entered 
 * qualifies for winning any amount of money with the terms of the game.
 */

import java.util.Scanner; 
 
public class LotteryGame {
   
  /**
  * This program allows the user to enter a three digit number and then through the 
  * switch statements, the program determines what the user would win, whether 
  * it be $1,000, $3,000 or $10,000.
  */
  
  public static void main(String[] args) {
    //This generates a random number which is used to compare to the number the user inputs,
    int lotteryNum = (int)(Math.random() * 1000);
    
    //This allows the user to input their guess of what the lottery number will be.
    Scanner input = new Scanner(System.in);
    System.out.println("Enter your lottery pick (three digits): ");
    int lotPick = input.nextInt();
    
    System.out.println("The lottery number is " + lotteryNum);
    
    //This separates the number the program generates into digits.
    int lotteryDigit1 = lotteryNum / 100;
    int lotteryDigit2 = lotteryNum % 100 / 10;
    int lotteryDigit3 = lotteryNum % 10;
    
    //This separates the number the user enters into digits.
    int lotPickDigit1 = lotPick / 100;
    int lotPickDigit2 = lotPick % 100 / 10;
    int lotPickDigit3 = lotPick % 10;
    
    //Creates a variable for the cases of winning and assigning how much they win
    int matchCase = 0;
    
    /**By using if statements, this gives the conditions in each case of winning and assigns
     * a case number to it.
     */
    if ((lotPickDigit1 == lotteryDigit1) && (lotPickDigit2 == lotteryDigit2) 
      && (lotPickDigit3 == lotteryDigit3))
      matchCase = 0;
    else if ((lotPickDigit1 == lotteryDigit1 && lotPickDigit2 == lotteryDigit3 
      && lotPickDigit3 == lotteryDigit2) || (lotPickDigit1 == lotteryDigit2 
      && lotPickDigit2 == lotteryDigit1 && lotPickDigit3 == lotteryDigit3) 
      || (lotPickDigit1 == lotteryDigit3 && lotPickDigit2 == lotteryDigit1 
      && lotPickDigit3 == lotteryDigit2) || (lotPickDigit1 == lotteryDigit2 
      && lotPickDigit2 == lotteryDigit3 && lotPickDigit3 == lotteryDigit1) 
      || (lotPickDigit1 == lotteryDigit3 && lotPickDigit2 == lotteryDigit2 
      && lotPickDigit3 == lotteryDigit1)) 
      matchCase = 1;
    else if (lotPickDigit1 == lotteryDigit1 || lotPickDigit1 == lotteryDigit2 
      || lotPickDigit1 == lotteryDigit3 || lotPickDigit2 == lotteryDigit1 
      || lotPickDigit2 == lotteryDigit2 || lotPickDigit2 == lotteryDigit3 
      || lotPickDigit3 == lotteryDigit1 || lotPickDigit3 == lotteryDigit2 
      || lotPickDigit3 == lotteryDigit3)
      matchCase = 2;
    else
      matchCase = 3;
    
    //This switch statements assigns a winning value depending on the winning case.
    switch (matchCase) {
      case 0: System.out.println("Exact match: you win $10,000!");
        break;
      case 1: System.out.println("Match all digits: you win $3,000!");
        break;
      case 2: System.out.println("Match one digit: you win $1,000!");
        break;
      case 3: System.out.println("No match, sorry!");
        break;      
    }   
  }
}
 
 