/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lineals;

/**
 *
 * @author andresz
 */

public class LinkedListExample {
    protected Node first;
    
    public LinkedListExample(){
        first = null;
    }
    public void addHead(String data){
        Node newNode;
        newNode = new Node(data);
        newNode.ref = first;
        first = newNode;        
    }
    public void displayList(){
        Node current;
        current = first;
        while(current != null){
            System.out.println(current.data);
            current = current.ref;
        }        
    }
    
    public void addTail(String data){
        Node newTail;
        newTail = new Node(data);
        newTail.ref = null; 
        //empty list
        if(first == null){
            first = newTail;
            return;
        }
        Node tmp = first;
        while(tmp.ref != null){
            tmp = tmp.ref;
        }
        tmp.ref = newTail;
    }
    
    
}
