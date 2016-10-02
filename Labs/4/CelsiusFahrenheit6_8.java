/**
 * file: CelsiusFahrenheit6_8.java
 * author: Dayna Dunninger
 * course: CMPT 220
 * assignment: Lab 4
 * due date: September 29, 2016
 * version: 1.0
 * 
 * This file contains the code to create a table with the celsius and fahrenheit
 * values side by side when converted.
 */

public class CelsiusFahrenheit6_8 {
 
/**In this lab I created a table using System.out.format in order to display the 
 * values for celsius and fahrenheit respectively. I also created two methods which
 * contain the formulas for converting celsius to fahrenheit and fahrenheit to celsius.
 */
 
  public static void main(String[] args) {
    //Creates variables for celsius and fahrenheit.
    double celsius;
    double fahrenheit;
    
    //Prints out the table in which the numbers are going to be displayed.
    System.out.format("Celsius   Fahrenheit | Fahrenheit   Celsius\n");
    for (celsius = 40.0, fahrenheit = 120; celsius > 30.0; celsius -= 1, fahrenheit -=10) {
      double[] myList = new double[100];
      System.out.format("%5.1f %10.1f     |  %5.1f  %10.1f \n", celsius, celsiusToFahrenheit(celsius), fahrenheit, fahrenheitToCelsius(fahrenheit));
    }  
  }
  
  //Method which contains the formula to convert celsius to fahrenheit.
  public static double celsiusToFahrenheit(double celsius) {
    return (9.0/5.0) * (celsius + 32);
  }
  
  //Method which contains the formula to convert fahrenheit to celsius.
  public static double fahrenheitToCelsius(double fahrenheit) {
    return (5.0/9.0) * (fahrenheit - 32);
  }
}