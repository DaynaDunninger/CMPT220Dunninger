/**
 * file: GuessBirthday.java
 * author: Dayna Dunninger
 * course: CMPT 220
 * assignment: Lab 2
 * due date: September 14, 2016
 * version: 1.0
 * 
 * This file contains the code to allow the user to let the computer know if
 * their birthday is in each of the sets. The program then takes the answers
 * that the user provided and determines the day.
 */
 
import java.util.Scanner;
 
public class GuessBirthday {
   
  /**This code gives the user five sets of numbers, one at a time and has the 
   * user determine if their birthday number is in each of the sets. Depending 
   * on what answers the user gives, the code then outputs the birthday to the window.
   */
   
  public static void main(String[] args) {
     
    String set1 = 
      " 1  3  5  7\n" + 
      " 9 11 13 15\n" +
      "17 19 21 23\n" + 
      "25 27 29 31";
      
    String set2 = 
      " 2  3  6  7\n" + 
      "10 11 14 15\n" + 
      "18 19 22 23\n" + 
      "26 27 30 31";
      
    String set3 = 
      " 4  5  6  7\n" +
      "12 13 14 15\n" +
      "20 21 22 23\n" +
      "28 29 30 31";
      
    String set4 = 
      " 8  9 10 11\n" +
      "12 13 14 15\n" +
      "24 25 26 27\n" +
      "28 29 30 31";
      
    String set5 = 
      "16 17 18 19\n" +
      "20 21 22 23\n" +
      "24 25 26 27\n" +
      "28 29 30 31";
      
    int day = 0;
    
    //This creates a scanner.
    Scanner input = new Scanner(System.in);
    
    //This set of code prompts the user to answer questions relating to set1.
    System.out.println("Is your birthday in Set1?\n");
    System.out.print(set1);
    System.out.print("\nEnter N for No and Y for Yes: ");
    String q = input.nextLine();
    char answer = q.charAt(0);
    
    if (answer == 'Y')
      day += 1;
    
    //This set of code prompts the user to answer questions relating to set2.
    System.out.println("Is your birthday in Set2?\n");
    System.out.print(set2);
    System.out.print("\nEnter N for No and Y for Yes: ");
    q = input.nextLine();
    answer = q.charAt(0);
    
    if (answer == 'Y')
      day += 2;
    
    //This set of code prompts the user to answer questions relating to set3.
    System.out.println("Is your birthday in Set3?\n");
    System.out.print(set3);
    System.out.print("\nEnter N for No and Y for Yes: ");
    q = input.nextLine();
    answer = q.charAt(0);
    
    if (answer == 'Y')
      day += 4;
    
    //This set of code prompts the user to answer questions relating to set4.
    System.out.println("Is your birthday in Set4?\n");
    System.out.print(set4);
    System.out.print("\nEnter N for No and Y for Yes: ");
    q = input.nextLine();
    answer = q.charAt(0);
    
    if (answer == 'Y')
      day += 8;
    
    //This set of code prompts the user to answer questions relating to set5.
    System.out.println("Is your birthday in Set5?\n");
    System.out.print(set5);
    System.out.print("\nEnter N for No and Y for Yes: ");
    q = input.nextLine();
    answer = q.charAt(0);
    
    if (answer == 'Y')
      day += 16;
    
    //Displays the birthday to the screen.
    System.out.println("\nYour birthday is " + day);
  }
}