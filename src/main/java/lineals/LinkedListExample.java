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
    public void deleteNode(String value){
        if(first == null){
            return;
        }
        Node current = first;
        while(current.ref != null){
            if(current.ref.data == value){
                current.ref = current.ref.ref;
            }
            current = current.ref;
        }
    }
    
    public int getSize(){
        int counter = 0;
        Node current = first;
        if(first == null){
            return 0;
        }
        while(current != null){
         counter++;
         current = current.ref;
        }
        return counter;        
    }
    
    public void search(String value){
        Node current = first;
        int counter = 0;
        while(current != null){
            counter ++;
            if(current.data == value){                
                System.out.println("Value: "+ value +" ,founded at position"+ counter);
                return;
            }            
            current = current.ref;
        }
        System.out.println("We couldn't find the value: "+ value);
    }
    
}
