import java.util.Scanner;

public class SmallestElement7_9 {
  
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter any ten numbers: ");
  
    double[] num = new double[10];
      
    for (int i = 0; i < num.length; i++) {
      num[i] = input.nextDouble();
    }
      
    System.out.println("The smallest number entered is: " + min(num));
  }
  
  public static double min(double[] array) {
    double min = array[0];
    for (int i = 1; i < array.length; i++){
      if(array[i] < min) {
        min = array[i];
      }
    }
    return min;
  }
  
}