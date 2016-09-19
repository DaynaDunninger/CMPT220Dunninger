// == missing header
import java.util.Scanner;

public class SumOfDigits {
  // == using tabs!!!
	public static void main(String[] args) {
		//Create a scanner
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number between 0 and 1000: ");
		int numberBeforeSum = input.nextInt();
		
		int numberInThousands = numberBeforeSum / 1000;
		numberBeforeSum = numberBeforeSum % 1000;
		
		int numberInHundreds = numberBeforeSum / 100;
		numberBeforeSum = numberBeforeSum % 100;
		
		int numberInTens = numberBeforeSum / 10;
		numberBeforeSum = numberBeforeSum % 10;
		
		int numberInOnes = numberBeforeSum;
		
		int sumOfDigits = numberInHundreds + numberInTens + numberInOnes;
		System.out.println("The sum of all of the digits is " + sumOfDigits);
	}
}
