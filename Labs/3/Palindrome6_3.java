/**
 * file: Palindrome6_3.java
 * author: Dayna Dunninger
 * course: CMPT 220
 * assignment: Lab 3
 * due date: September 22, 2016
 * version: 1.0
 * 
 * The code to this program takes an integer that the user inputs and adds up the
 * digits
 */
 
import java.util.Scanner;
 
public class Palindrome6_3 {

/**This lab is designed to take a number that is entered by the user, and use a
 * while loop to check the reverse of the number and determine if the number is 
 * is a palindrome or not and display it to the screen.
 */
 
  public static void main(String[] args) {
 
    //Allows the user to input a value to analyze.
    Scanner input = new Scanner(System.in);
    System.out.print("Enter an integer:");
    int num = input.nextInt();
 
    //Prints whether the number is a palindrome or not to the screen.
    if (isPalindrome(num)) {
      System.out.print(num + " is a palindrome");
    } else {
      System.out.print(num + " is not a palindrome");
    }
 
  }
 
  public static int reverse(int number) {
   
    //Initializes the variables.
    int reverse = 0;
    int digit;
 
    //This while loop is what analyzes the number and determines if it is a palindrome or not.
    while (num != 0) {
      digit = num % 10;
      reverse = reverse * 10 + digit;
      num /= 10;
    } 
 
    //Returns the reverse.
    return reverse;
  }
 
  public static boolean isPalindrome(int num) {
 
    //Returns the number.
    return (num == reverse(num));
  }
 
}