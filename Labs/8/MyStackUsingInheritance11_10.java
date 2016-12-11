/**
 * file: MyStackUsingInheritance11_10.java
 * author: Dayna Dunninger
 * course: CMPT 220
 * assignment: Lab 8
 * due date: November 3, 2016
 * version: 1.0
 * 
 * This program contains the code to take a list of strings given by the user
 * and return it to the user backwards in this case.
 */ 
 
import java.util.Scanner;
import java.util.ArrayList;

public class MyStackUsingInheritance11_10 {
  
  /**In this program I first prompt the user to input a list of five different  
   * strings of his/her choice. After that the class is then implemented in order
   * to display the strings in the reversed order in which they came into the stack.
   */
  
  public static void main(String[] args) {
    //This creates a scanner
    Scanner input = new Scanner(System.in);
    //Implements the stack created below
    MyStack stack = new MyStack();
    //This prompts the user to input five strings of his or her choice.
    System.out.println("Enter any five strings: ");
    for(int i = 0; i < 5; i++) {
      stack.push(input.next());
    }
    //This prints the strings back to the usser in the reverse order in which they came in.
    do {
      System.out.println(stack.pop());
    } while (stack.size() > 0);
  }
  
  public static class MyStack extends ArrayList<Object> {
    private ArrayList<Object> list = new ArrayList<>();
    
    public boolean isEmpty() {
      return list.isEmpty();
    }
    
    public int getSize() {
      return list.size();
    }
    
    public Object peek() {
      return list.get(getSize() - 1);
    }
    
    public Object pop() {
      Object o = list.get(getSize() - 1);
      list.remove(getSize() - 1);
      return o;
    }
    
    public void push(Object o) {
      list.add(o);
    }
    //This returns the strings in the reversed order.
    @Override
    public String toString() {
      return "Stack: " + super.toString();
    }
  }
} 