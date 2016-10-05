/**
 * file: driver_proj1.java
 * author: Dayna Dunninger
 * course: CMPT 220
 * assignment: Project 1
 * due date: October 4, 2016
 * version: 1.0
 * 
 * This file contains the code to calculate and execute the convolution of vectors.
 */

import java.util.Scanner;

public class driver_proj1 {
  
/**In this code a scanner is created in order to bring in text files to use and
 * execute the program created. Next I created arrays for each of the two vectors
 * and have each of the vectors retrieve the values from the file through for loops.
 * Next I created a method where it calculates and executes the convolution equation
 * through for loops and an if statement. The method is then called in the main
 * method and printed to the screen.
 */  
  
  public static void main(String[] args) {
   
    //This creates a scanner to read the values that are brought in through a file or input.
    Scanner scanFile = new Scanner(System.in);
    int vFirstSize = scanFile.nextInt();
    int vSecondSize = scanFile.nextInt();
    
    //These create arrays of the vectors that are entered.
    double[] vFirst = new double[vFirstSize];
    double[] vSecond = new double[vSecondSize];
    
    //This goes through each of the values in the two vectors
    for (int i = 0; i < vFirstSize; i++) {
      vFirst[i] = scanFile.nextInt(); 
    }
    
    for (int i = 0; i < vSecondSize; i++) {
      vSecond[i] = scanFile.nextInt();
    }
    
    //This calls the method established later in the code.
    double[] convolved = convolveVectors(vFirst, vSecond);
    
    //This prints it out the screen.
    for (double c : convolved) {
      System.out.print(Math.round(c) + " ");
    }
  }

  //This is the method created in order to use the function for convolution.
  public static double[] convolveVectors(double[] vFirst, double[] vSecond) {
    double[] vResult = new double[(vFirst.length + vSecond.length) - 1];

    //This whole thing sets criteria and executes the formula with the information provided.
    for (int idx = 0; idx < vResult.length; idx++) {
      vResult[idx] = 0;
      for (int shift = 0; shift < vSecond.length; shift++) {
        if ((idx - shift) >= 0 && (idx - shift) < vFirst.length ) {
          vResult[idx] += vFirst[idx - shift] * vSecond[shift];
        }
      }
    }
    return vResult;  
  }

}