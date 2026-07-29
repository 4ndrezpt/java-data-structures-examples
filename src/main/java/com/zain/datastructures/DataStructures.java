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
         
         //DoubleLinkedList
         
         //CIrcularLinkedList
         
         //
    }
}
