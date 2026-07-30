/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.zain.datastructures;

/**
 *
 * @author andresz
 */
import lineals.SetExample;
import lineals.ArrayListExample;
import lineals.ListExample;
import lineals.StackExample;
import lineals.LinkedListExample;
import lineals.DoubleLinkedListExample;
import lineals.CircularLinkedListExample;

public class DataStructures {

    public static void main(String[] args) {
        /*
        Linear Data Structures
        */
        //Set Example
         SetExample mySetExample = new SetExample();
         mySetExample.PrintExample();
         //ArrayList example
         ArrayListExample myArrayListExample = new ArrayListExample();
         myArrayListExample.PrintExample();
         //List Example
         ListExample myListExample = new ListExample();
         myListExample.PrintExample();
         //Stack FIFO
         StackExample myStack = new StackExample();
         myStack.PrintExample();
         //LinkedList 
         LinkedListExample myLinkedListExample = new LinkedListExample();
         //adding heads to get a FIFO linkedlist
         myLinkedListExample.addHead("First Element");
         myLinkedListExample.addHead("Second Element");
         myLinkedListExample.addHead("Third Element");
         myLinkedListExample.addHead("Fourth Element");
         //adding tails to get a LIFO linkledLIst
         myLinkedListExample.displayList();
         myLinkedListExample.addTail("final");
         myLinkedListExample.addTail("final-2");
         myLinkedListExample.addTail("final-3");
         myLinkedListExample.displayList();
         myLinkedListExample.search("some Element");
         myLinkedListExample.search("Third Element");
         System.out.println("Deleting on value from list"+ " final-2");
         myLinkedListExample.deleteNode("final-2");
         myLinkedListExample.displayList();
         System.out.println(myLinkedListExample.getSize());
         //DoubleLinkedList
         DoubleLinkedListExample myDoubleLinkedListExample = new DoubleLinkedListExample();
         myDoubleLinkedListExample.insertHead("First Double Element");
         myDoubleLinkedListExample.insertHead("Second Double Element");
         myDoubleLinkedListExample.insertHead("Trird Double Element");
         myDoubleLinkedListExample.insertHead("Fourth Double Element");
         myDoubleLinkedListExample.insertHead("Final Double 1");
         myDoubleLinkedListExample.insertHead("Final Double 2");
         myDoubleLinkedListExample.insertHead("Final Double 3");
         myDoubleLinkedListExample.insertHead("Final Double 4");
         System.out.println("Print DoubleLinkedList Fordward");
         myDoubleLinkedListExample.displayForward();
         System.out.println("Print DoubleLinkedList Backward");
         myDoubleLinkedListExample.displayBackward();       
                 
         //CircularLinkedList
         CircularLinkedListExample myCircularLinkedList = new CircularLinkedListExample();
         myCircularLinkedList.insertHead("First Circular Element");
         myCircularLinkedList.insertHead("Second Circular Element");
         myCircularLinkedList.insertHead("Third Circular Element");
         
         myCircularLinkedList.insertTail("Final Circular 1");
         myCircularLinkedList.insertTail("Final Circular 2");
         myCircularLinkedList.insertTail("Final Circular 3");
         myCircularLinkedList.insertTail("Final Circular 4");         
         myCircularLinkedList.display();
         //delete one element and then displayed again
         myCircularLinkedList.delete("Second Circular Element");
         myCircularLinkedList.display();
         //
    }
}
