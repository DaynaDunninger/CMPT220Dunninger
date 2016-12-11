/**
 * file: BMIClass10_2.java
 * author: Dayna Dunninger
 * course: CMPT 220
 * assignment: Lab 7
 * due date: October 27, 2016
 * version: 1.0
 * 
 * This program contains the code to add a constructor to the BMI class code
 * that is already provided to us in the textbook in chaoter 10.
 */
 
public class BMIClass10_2 {
  
  /**In this prgram I add in a constructor in order to determine the BMI of a
   * person given the name, age, weight and height in feet and inches. This 
   * constructor takes will turn the height into all inches and then calculate
   * the BMI as it normally would in the code.
   */
  
  public static void main(String[] args) {
    BMI bmi1 = new BMI("Kim Yang", 18, 145, 70);
    System.out.println("The BMI for " + bmi1.getName() + " is " + bmi1.getBMI() + " "
    + bmi1.getStatus());
    
    BMI bmi2 = new BMI("Susan King", 215, 70);
    System.out.println("The BMI for " + bmi2.getName() + " is " + bmi2.getBMI() + " "
    + bmi2.getStatus());
  }
  
  public static class BMI {
    private String name;
    private int age;
    private double weight;
    private double height;
    public static final double KILOGRAMS_PER_POUND = 0.45359237;
    public static final double METERS_PER_INCH = 0.0254;
    
    public BMI(String name, int age, double weight, double height) {
      this.name = name;
      this.age = age;
      this.weight = weight;
      this.height = height;
    }
    
    public BMI(String name, double weight, double height) {
      this(name, 20, weight, height);
    }
    //This constructor is the one created for this lab in order to determine the BMI given hight in feet and inches.
    public BMI(String name, int age, double weight, double feet, double inches) {
      this(name, age, weight, inches + (feet * 12));
    }
    
    public double getBMI() {
      double bmi = weight * KILOGRAMS_PER_POUND / ((height * METERS_PER_INCH) 
        * (height * METERS_PER_INCH));
      return Math.round(bmi * 100) / 100.0;  
    }
    
    public String getStatus() {
      double bmi = getBMI();
      if(bmi < 18.5) {
        return "Underweight";
      } else if (bmi < 25) {
        return "Normal";
      } else if (bmi < 30) {
        return "Overweight";
      } else 
        return "Obese";
      
    }
    
    public String getName() { 
      return name;  
    }
    
    public int getAge() {
      return age;
    }
    
    public double getWeight() {
      return weight;
    }
    
    public double getHeight() {
      return height;
    }
  }
}