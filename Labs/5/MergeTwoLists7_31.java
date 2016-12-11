/**
 * file: MergeTwoLists7_31.java
 * author: Dayna Dunninger
 * course: CMPT 220
 * assignment: Lab 5
 * due date: October 6, 2016
 * version: 1.0
 * 
 * This file contains the code to merge two lists of numbers together.
 */

import java.util.Scanner;

public class MergeTwoLists7_31 {
 
/**In this code I create a method which merges the to lists through a for loop
 * and if/else statements. Then in the main method I go through each of the lists
 * and then use the merging method I created in order to merge the to lists and
 * finally print out the third list. 
 */
 
 public static void main(String[] args) {
    //Creates a scanner
    Scanner input = new Scanner(System.in);
    //Prompts the user to enter the first list.
    System.out.print("Enter list one: ");
    int[] list1 = new int[input.nextInt()];

    //Goes through the list entered and takes each value.
    for (int i = 0; i < list1.length; i++) {
      list1[i] = input.nextInt();
    }
    
    //prompts the user to enter a second list.
    System.out.print("Enter list two: ");
    int[] list2 = new int[input.nextInt()];
    
    //Goes through the second list and takes each value.
    for (int i = 0; i < list2.length; i++) {
      list2[i] = input.nextInt();      
    }
    
    int[] list3 = merge(list1, list2);
    
    //Prints out the merged list to the screen 
    System.out.print("The two lists, when merged, is: ");
    
    for (int i = 0; i < list3.length; i++) {
      System.out.print(list3[i] + " ");
    }
  }
  
  //This is the method I created in order to merge the two lists.
  public static int[] merge(int[] list1, int[] list2) {
     //Declares an array with the third list.
    int[] list3 = new int[list1.length + list2.length];
    
    //Declares variables.
    int p = 0;
    int q = 0;
    
    //This merges the two lists with for loops and if statements.
    for(int i = 0; i < list3.length; i++) {
      if((q < list2.length) && (list1[p] > list2[q])) {
        list3[i] = list2[q];
        q++;
      } else if (p < list1.length) {
        list3[i] = list1[p];
        p++;
      }
    }
    return list3;
  }
  
}
