/**
 * file: FinalGradeLetter.java
 * author: Dayna Dunninger
 * course: CMPT 220
 * assignment: Lab 2
 * due date: September 14, 2016
 * version: 1.0
 * 
 * This file contains the code to calculate a final grade for a course and assign
 * a letter grade accordingly.
 */

import java.util.Scanner;

public class FinalGradeLetter {
	
  /**For this code, the user is prompted to enter all grades for the semester,
   * including the midterm, final exam, projects, and homeworks and labs. The
   * average of all of those grades is then computed. After that through the 
   * use of if statements, a letter grade is assigned to the number final grade
   * computed prior. This result is then printed to the screen for the user to see.
   */
  
  public static void main(String[] args) {
		//This creates a scanner.
    Scanner input = new Scanner(System.in);
		
    //This prompts the user to enter his/her midterm grade.
		System.out.print("Enter your midterm grade: ");
		double midtermGrade = input.nextDouble();
		
    //This prompts the user to enter his/her final exam grade.
		System.out.print("Enter your final exam grade: ");
		double finalExamGrade = input.nextDouble();
		
    //This prompts the user to enter his/her projects grade.
		System.out.print("Enter your projects grade: ");
		double projectsGrade = input.nextDouble();
		
    //This prompts the user to enter his/her homework and labs grade.
		System.out.print("Enter homework and labs Grade: ");
		double hwAndLabsGrade = input.nextDouble();
		
    //This computes the final grade.
		double finalGrade = (midtermGrade + finalExamGrade + projectsGrade + hwAndLabsGrade)/4;
    
    //This nested if statements assigns a letter grade to the number grade.
    if (finalGrade >= 95)
      System.out.println("Your final grade is an A.");
    else if (finalGrade >= 90)
      System.out.println("Your final grade is an A-.");
    else if (finalGrade >= 87)
      System.out.println("Your final grade is a B+.");
    else if (finalGrade >= 83)
      System.out.println("Your final grade is a B.");
    else if (finalGrade >= 80)
      System.out.println("Your final grade is a B-.");
    else if (finalGrade >= 77)
      System.out.println("Your final grade is a C+.");
    else if (finalGrade >= 73)
      System.out.println("Your final grade is a C.");
    else if (finalGrade >= 70)
      System.out.println("Your final grade is a C-.");
    else if (finalGrade >= 65)
      System.out.println("Your final grade is a D.");
    else 
      System.out.println("Your final grade is an F.");
    
	}
}