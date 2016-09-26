/**
 * file: FutureTuition5_7.java
 * author: Dayna Dunninger
 * course: CMPT 220
 * assignment: Lab 3
 * due date: September 22, 2016
 * version: 1.0
 * 
 * This file contains the code to determine the future tuition, after ten years
 * with an increase year, as well as a total of four years tuition with the increases.
 */
 
public class FutureTuition5_7 {
 
/**In this problem, I use a for loop with if statements in order to determine the
 * tuition for a student after ten years with a 5% increase each uear and then the 
 * tuition for four years after that with the corresponding increases.
 */ 
 
  public static void main(String[] args) {
  
    //Declares variables for the initial tuition and the total tuition.
    int initialTuition = 10000;
    int totalTuition = 0;
    
    //This goes through each year and adds on the additional 5% increase.
    //This creates a new, higher tuition each year.
    for (int n = 1; n <= 14; n++) {
      initialTuition += (initialTuition * .05);
      //This allows n to stop at ten and give the tuition at the tenth year.
      if (n == 10) {
        System.out.println("At the tenth year, the tuition is $" + initialTuition);
      }
      //This has n continue up until it reaches 14
      //This also computes the total tuition for the four years following the 10th year.
      if (n > 10) {
        totalTuition = totalTuition + initialTuition;
      }
    }
 
    //This prints out the total tuition to the screen from the previous if statement.
    System.out.println("The total cost of four years tuition after the tenth year comes out to be $"
      + totalTuition);
  }
 
}