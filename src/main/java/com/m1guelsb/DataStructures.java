package com.m1guelsb;

import java.util.*;

public class DataStructures {

  public void stack() {
    /*
     * Stack is a data structure that follows the LIFO (Last In First Out)
     * principle.
     * Uses:
     * - Undo/Redo: when you perform an action, it is added to a stack.
     * - Back/Forward: when you visit a page, it is added to a stack.
     * - Call stack: when a method is called, it is added to the top of the call
     */
    Stack<String> stack = new Stack<String>();
    stack.push("Mid night 3");
    stack.push("Minecraft");
    // System.out.println(stack.peek());
    System.out.println(stack.pop());
  }

  public void queue() {
    /*
     * Queue is a data structure that follows the FIFO (First In First Out)
     * principle.
     * Uses:
     * - When you send a message, it is added to a queue.
     * - When you print a document, it is added to a queue.
     * - When you download something, it is added to a queue.
     */
    Queue<String> queue = new LinkedList<String>();
    queue.offer("Veia 1");
    queue.offer("Veia 2");
    queue.offer("Veia 3");
    // System.out.println(queue.peek());
    System.out.println(queue.poll());
  }

  public void priorityQueue() {
    /*
     * PriorityQueue is a data structure that stores elements in a queue and sorts
     * them based on their priority.
     * Uses:
     * - When you print a document, it is added to a priority queue.
     * - When you download something, it is added to a priority queue.
     */
    Queue<String> priorityQueue = new PriorityQueue<String>(Collections.reverseOrder());
    priorityQueue.offer("0.5");
    priorityQueue.offer("2.3");
    priorityQueue.offer("1.2");

    while (!priorityQueue.isEmpty()) {
      System.out.println(priorityQueue.poll());
    }
  }

  public void linkedList() {
    /*
     * LinkedList is a data structure that stores elements in a list and links them
     * to each other. It has two parts (data + address)
     * Advantages:
     * - Can be treated as a stack or a queue. (Has a lot of methods)
     * - Easy to add and remove elements. O(1)
     * - No/Low memory waste.
     * Disadvantages:
     * - Greater memory usage. (additional address for each element)
     * - No random access of elements (no index [i])
     * - Accessing/searching is more time consuming. O(n)
     * Uses:
     * - When you create a playlist.
     * - Implement stacks/queues
     * - GPS navigation:
     */
    LinkedList<String> linkedList = new LinkedList<String>();
    // stack
    // linkedList.push("A");
    // linkedList.push("B");
    // linkedList.pop()

    // queue
    linkedList.offer("A");
    linkedList.offer("B");
    // System.out.println("poll: " + linkedList.poll());
    // System.out.println(linkedList);

    // Can insert elements at any position
    linkedList.add(1, "C");
    // linkedList.remove("C");
    System.out.println(linkedList);

    // System.out.println(linkedList.contains("A"));
    // System.out.println(linkedList.indexOf("A"));
    // System.out.println(linkedList.size());
    // System.out.println(linkedList.get(0));
    // System.out.println(linkedList.getFirst());
    // System.out.println(linkedList.getLast());
    // System.out.println(linkedList.peekFirst());
    // System.out.println(linkedList.peekLast());
    // and so on we have methods to manipulate freely the elements (head, tail, etc)

  }

  public void dynamicArray() {
    /*
     * Dynamic Array (ArrayList/Vector/Array/List) is a data structure that stores
     * elements in an array and
     * resizes itself when it reaches its capacity.
     * Advantages:
     * - Random access of elements (index [i])
     * - Easy to add and remove elements. O(1)
     * - Less memory usage.
     * Disadvantages:
     * - Resizing is time consuming. O(n)
     * - Shifting elements is time consuming. O(n)
     * - Memory waste. (if the capacity is 10 and you add 1 element, you will have
     * 9 empty spaces)
     * Uses:
     * 
     */

    ArrayList<String> dynamicArray = new ArrayList<String>();
    dynamicArray.add("A");
    dynamicArray.add("B");
    dynamicArray.add("C");
    System.out.println(dynamicArray);

  }

}
