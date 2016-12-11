/**
 * file: RemoveDuplicates11_13.java
 * author: Dayna Dunninger
 * course: CMPT 220
 * assignment: Lab 8
 * due date: November 3, 2016
 * version: 1.0
 * 
 * This program contains the code to remove the duplicates in a set of ten
 * integers given by the user.
 */ 
 
import java.util.Scanner;
import java.util.ArrayList;

public class RemoveDuplicates11_13 {
 
  /**In this program I first prompt the user to enter ten integers of his or her
   * choice. After that I use for loops and if statements to compare the numbers
   * in the array and remove the ones that are duplicates. The method is then
   * invoked in the main code and the numbers that remain are printed to the screen.
   */
   
  public static void main(String[] args) {
    ArrayList<Integer> arrayList = new ArrayList<>();
    //This creates a scanner in the code.
    Scanner input = new Scanner(System.in);
    //This prompts the user to enter ten integers
    System.out.print("Please enter 10 integers: ");
    
    for(int i = 0; i < 10; i++) {
      arrayList.add(input.nextInt());
    }
    //This invokes the method I created later in the code which removes duplicates.
    removeDuplicate(arrayList);
    //This prints the new list of numbers, without duplicates to the screen.
    System.out.println("The list without any duplicates is: ");
    System.out.println(arrayList);
    
  }
  //This is the method created in order to remove the duplicates
  public static void removeDuplicate(ArrayList<Integer> list) {
    for (int i = 0; i < list.size() - 1; i++) {
      for(int j = i + 1; j < list.size(); j++) {
        if(list.get(i) == list.get(j)) {
          list.remove(j);
        }
      }
    }
  }
}