/**
 * file: RectangleClass9_1.java
 * author: Dayna Dunninger
 * course: CMPT 220
 * assignment: Lab 6
 * due date: October 20, 2016
 * version: 1.0
 * 
 * This program contains the code to create a class that creates a rectangle in the 
 * main part of the code.
 */
 
public class RectangleClass9_1 {
  
/**In this program I create a class named Rectangle which has a default width and height
 * and also creates new methods to calculate the area and perimeters of the rectangles.
 * This class as well as the methods in the class are then called in the main code, given 
 * a width and height and the areas and perimeters are then printed to the screen.
 */ 
  
  public static void main(String[] args) {
    //This creates a rectangle of width 4 and height 40.
    Rectangle rec1 = new Rectangle(4, 40);
    //This prints the features of the rectangle to the screen.
    System.out.println("Rectangle One:");
    System.out.println("The width for rectangle one is: " + rec1.width);
    System.out.println("The height for rectangle one is: " + rec1.height);
    System.out.println("The area for rectangle one is: " + rec1.getArea());
    System.out.println("The perimeter for rectangle one is: " + rec1.getPerimeter());
    //This creates a rectangle of width 3.5 and height 35.9.
    Rectangle rec2 = new Rectangle(3.5, 35.9);
    //Since this area has a repeating decimal, this rounds the decimal to two places.
    double roundedArea = (double) Math.round(rec2.getArea() * 100)/100;
    //This prints the features of this rectangle to the screen.
    System.out.println("Rectangle Two:");
    System.out.println("The width for rectangle two is: " + rec2.width);
    System.out.println("The height for rectangle two is: " + rec2.height);
    System.out.println("The area for rectangle two is: " + roundedArea);
    System.out.println("The perimeter for rectangle two is: " + rec2.getPerimeter());
        
  }
  //This class defines the rectangles referenced above.
  public static class Rectangle {
    
    double width;
    double height;
    //This is the default rectangle with width 1 and height 1.
    Rectangle() {
      width = 1;
      height = 1;
    }
    //This defines what the rectangle consists of when it is applied in the main method.
    Rectangle(double chosenWidth, double chosenHeight) {
      width = chosenWidth;
      height = chosenHeight;
    }
    //This calculates the area when referenced to.
    double getArea() {
      return (width * height);
    }
    //This calculates the perimeter when referenced to.
    double getPerimeter() {
      return ((2 * width) + (2 * height));
    }
  }
  
}