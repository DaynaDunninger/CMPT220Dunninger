import java.util.Scanner;

public class GratuityRate {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a subtotal: ");
		double subtotal = input.nextDouble();
		
		System.out.print("Enter a gratuity percentage: ");
		double gratuityPercentage = input.nextDouble();
		
		double gratuity = subtotal * .01 * gratuityPercentage;
		double total = subtotal + gratuity;
		System.out.println("The gratuity is $" + gratuity + " and the total is $" + total);
	}
}