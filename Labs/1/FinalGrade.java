import java.util.Scanner;

public class FinalGrade {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your midterm grade: ");
		double midtermGrade = input.nextDouble();
		
		System.out.print("Enter your final exam grade: ");
		double finalExamGrade = input.nextDouble();
		
		System.out.print("Enter your projects grade: ");
		double projectsGrade = input.nextDouble();
		
		System.out.print("Enter homework and labs Grade: ");
		double hwAndLabsGrade = input.nextDouble();
		
		double finalGrade = (midtermGrade + finalExamGrade + projectsGrade + hwAndLabsGrade)/4;
        System.out.println("Your final grade is: " + finalGrade + "%");		
	}
}