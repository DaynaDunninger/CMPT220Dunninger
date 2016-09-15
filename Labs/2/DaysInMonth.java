/**
 * file: DaysInMonth.java
 * author: Dayna Dunninger
 * course: CMPT 220
 * assignment: Lab 2
 * due date: September 14, 2016
 * version: 1.0
 * 
 * This file contains the code to display the number of days in the month according
 * to the month and year given by the user. 
 */

import java.util.Scanner;
 
public class DaysInMonth{

  /**
  * This program allows the user to enter a month and year of their choice.
  * The program then proceeds to use a switch statement in order to determine
  * how many days the month has, leap year taken into account as well.
  */
  
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    //Allows the user to input a month and year.
    System.out.println("Enter a month by number (1-12): ");
    int monthNum = input.nextInt();
    
    System.out.println("Enter a year: ");
    int year = input.nextInt();
    
    //this creates a boolean variable for determining which years are leap years.
    boolean leapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    
    //This is a vswitch statement which takes all of the month and assigns them the appropriate number of days.
    switch(monthNum) {
      case 1: System.out.print("January " + year);
        System.out.println(" has 31 days."); 
        break;
      case 2: System.out.print("February " + year);
        if (leapYear == true) {
          System.out.println(" has 29 days.");
        }  
        else{
          System.out.println(" has 28 days.");
        }
        break;
      case 3: System.out.print("March " + year);
        System.out.println(" has 31 days.");
        break;
      case 4: System.out.print("April " + year);
        System.out.print(" has 30 days.");
        break;
      case 5: System.out.print("May " + year);
        System.out.println(" has 31 days.");
        break;
      case 6: System.out.print("June " + year);
        System.out.println(" has 30 days.");
        break;
      case 7: System.out.print("July " + year);
        System.out.println(" has 31 days.");
        break;
      case 8: System.out.print("August " + year);
        System.out.println(" has 31 days.");
        break;
      case 9: System.out.print("September " + year);
        System.out.println(" has 30 days.");
        break;
      case 10: System.out.print("October " + year);
        System.out.println(" has 31 days.");
        break;
      case 11: System.out.print("November " + year);
        System.out.println(" has 30 days.");
        break;
      case 12: System.out.print("December " + year);
        System.out.println(" has 31 days.");
        break; 
    }
  }
}