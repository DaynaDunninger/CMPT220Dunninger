/**
 * file: QueueClass10_10.java
 * author: Dayna Dunninger
 * course: CMPT 220
 * assignment: Lab 7
 * due date: October 27, 2016
 * version: 1.0
 * 
 * This program contains the code to create a class named Queue which stores
 * integers. This queue retrieves elements in a first-in first-out method and 
 * holds elements.
 */ 
 
public class QueueClass10_10 {
 
/**In this program I used the same layout found in the Stack of Integers case 
 * but instead of the method being last-in first-out, I will change the method
 * to first-in first-out in the Queue class
 */ 
 
  public static void main(String[] args) {
    //This creates a queue object.
    Queue queue = new Queue();
    //This uses a for loop to add the numbers 1-20 into the queue I created.
    for (int i = 1; i < 21; i++) {
      queue.enqueue(i);
    }  
    //This uses a while loop to remove and display the numbers that are in the queue.
    while (!queue.empty()) {
      System.out.print(queue.dequeue() + " ");
    }
  } 
  
  //This is the new Queue class I created. 
  public static class Queue {
    private int[] elements;
    private int size; 
    public static final int DEFAULT_CAPACITY = 8;
    //This is the queue with the default capacity.
    Queue() {
      elements = new int[DEFAULT_CAPACITY];
    }
    //This is the method that adds v into the queue.
    public void enqueue(int v) {
      //This if statement adds the v created into the queue
      if (size >= elements.length) {
        int[] temp = new int[size * 2];
        System.arraycopy(elements, 0, temp, 0, size);
        elements = temp;
      }
      elements[size++] = v;
    }
    //This removes and returns the element from the queue
    public int dequeue() {
      //defines integer v
      int v = elements[0];
      size--;
      //This removes the elements
      for (int i = 0; i < size; i++) {
        elements[i] = elements[i + 1];
      }
      return v;
    }
    //This determines whether the queue is empty and if it is, it returns true.
    public boolean empty() {
      return size == 0;
    }
    //This returns the size of the queue.
    public int getSize() {
      return size;
    }
  }
}