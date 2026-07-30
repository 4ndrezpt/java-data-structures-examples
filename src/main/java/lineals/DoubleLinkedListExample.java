/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lineals;

/**
 *
 * @author andresz
 */
public class DoubleLinkedListExample {
    private DoubleNode first;
    private DoubleNode last;
    
    public DoubleLinkedListExample(){
        first = null;
        last = null;
    }
    public void insertHead(String data){
        DoubleNode newNode = new DoubleNode(data);
        if(first==null){
            first = last = newNode;
        }else{
            newNode.next = first;
            first.prev = newNode; 
            first = newNode;
        }     
    }
    public void insertTail(String data){
        DoubleNode newNode = new DoubleNode(data);
        if(last == null){
            first = last = newNode;            
        }else{
            last.next = newNode;
            newNode.prev = last;
            last = newNode;
        }
    }
    public void displayForward(){
        DoubleNode current = first;
        while(current != null){
            System.out.println(current.data + " ");
            current = current.next;
        }
        System.out.println();        
    }
    public void displayBackward(){
        DoubleNode current = last;
        while(current != null){
            System.out.println(current.data+" ");
            current  = current.prev;
        }
        System.out.println();        
    }
    public void deleteNode(String value){
        DoubleNode current = first;        
        while(current != null && current.data != value){
            //empty list
            if(current != null){ 
                System.out.println("Can't delete Value becasue the list is empty");
                //case 1: Only 1 node
            }else if(current == first && current == last){                
                first = last = null; //as in the beginning
                //case 2: Delete head
            }else if(current == first){
                first = current.prev;
                last.prev = null;
                //case 3: Delete the tail
            }else if(current == last){
                last = current.prev;
                last.prev = null;
                // case 4: Delete a middle Node
            }else{
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }            
            System.out.println("Value "+value+" deleted from list");
        }
    }
    
}
