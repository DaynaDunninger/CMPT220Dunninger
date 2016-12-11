/**
 * file: PartitionOfAList7_32.java
 * author: Dayna Dunninger
 * course: CMPT 220
 * assignment: Lab 5
 * due date: October 6, 2016
 * version: 1.0
 * 
 * This program is designed to take a list of a certain length that the user
 * enters and picks a pivot number. This number is then taken and the rest of
 * the numbers are sorted where the numbers less than the pivot are to the left
 * and the numbers greater than the pivot are to the right.
 */

import java.util.Scanner;

public class PartitionOfAList7_32 {
  
/**In this lab I create a method that partitions a set of numbers given by the user.
 * This is done through the use of for loops and if statements in order to sort
 * through all of the numbers, placing the pivot number in its appropriate location.
 * This method is then applied and the list is printed to the screen.
 */
  
  public static void main(String[] args) {
    //This prompts the user to enter in a list of numbers.
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a list of numbers: ");
    int[] userList = new int[input.nextInt()];
    
    //This reads each of the numbers in the list.
    for (int i = 0; i < userList.length; i++) {
      userList[i] = input.nextInt();
    }
    
    //This applies the method created below to the list entered.
    partition(userList);
    
    //This prints the list to the screen.
    System.out.print("The list, after the partition, is: ");
    
    for (int i = 0; i < userList.length; i++) {
      System.out.print(userList[i] + " ");
    } 
  }
  
  //This is the method created for partitioning a list of numbers.
  public static int partition(int[] list) {
    int pivotPlace = 0;
    int abovePivot = list.length - 1;
    int pivot = list[0];
    
    do {
      
      if (pivot > list[pivotPlace + 1]) {
       int temp = pivot;
       pivot = list[pivotPlace + 1];
       list[pivotPlace + 1] = temp;
       pivotPlace++;
      } else {
        int temp = list[abovePivot];
        list[abovePivot] = list[pivotPlace + 1];
        abovePivot--;
      }
      
    } while(pivotPlace < abovePivot);  
    return pivotPlace; 
  }
}

