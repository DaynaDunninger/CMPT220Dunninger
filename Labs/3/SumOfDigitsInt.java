/**
 * file: SumOfDigitsInt6_2.java
 * author: Dayna Dunninger
 * course: CMPT 220
 * assignment: Lab 3
 * due date: September 22, 2016
 * version: 1.0
 * 
 * The code to this program takes an integer that the user inputs and adds up the
 * digits in 
 */
 
import java.util.Scanner;
 
public class SumOfDigitsInt6_2 {

/**This program uses a while loop to add the digits of the integer enters together.
 */
 
  public static void main(String[] args) {
    
    //This has the user enter in an integer for the program to analyze.
    Scanner input = new Scanner(System.in);
    System.out.print("Enter an integer: ");
    long i = input.nextLong();
      
    //Prints the sum calculated to the screen.  
    System.out.println("The sum equals " + sumOfDigits(i));
  }
 
  public static int sumOfDigits(long i) {
 
    //Introduces integer sum.
    int sum = 0;
    
    //While loop that goes through each digit to add.
    while ((n = n / 10) != 0) {
      sum = n + (n % 10);
    }
    
    //Returns the sum.
    return sum;
 
  }
 
}