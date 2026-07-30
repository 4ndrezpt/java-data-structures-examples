/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lineals;

/**
 *
 * @author andresz
 */
public class CircularLinkedListExample {
      private Node first;
      private Node last;
      
      public CircularLinkedListExample(){
          first = null;
          last = null;
      }
      public void insertHead(String data){
          Node newNode = new Node(data);
          if(first == null){
              first = newNode;
              newNode.ref = first;              
          }else{
              Node current = first;
              while(current.ref != first){
                  current = current.ref;
              }
              newNode.ref = first;
              current.ref = newNode;
              first = newNode;
          }          
      }
      public void insertTail(String data){
          Node newNode = new Node(data);
          if(first == null){
              first = newNode;
          }else{
              
              Node current = first;
              while(current.ref != first){
                  current = current.ref;
              }
              current.ref = newNode;
              newNode.ref = first;
          }
      }
      
      public void delete(String value){
          if(first == null){
              System.out.println("This list is empty");
          }
          Node current = first;
          Node prev = null;
          
          //the node is in the head
          if(first.data == value){
              if(first == last){
                first = null;
                last = null;
              }else{
              first = first.ref;
              last.ref = first;
              }
              System.out.println("Deleted value "+value+" from this list");
          }
          //the node is in the middle          
          do{
            prev = current;
            current = current.ref;
            
            if(current.data == value){
                prev.ref = current.ref;
                if(current == last){
                    last = prev;
                }
            }
            
          }while(current != first);
          System.out.println("Cannot delete this value");
      }
      public void display(){
          if(first == null){
              System.out.println("This list is empty");              
          }
          Node current = first;
          System.out.println("Circular Linked List");
          do{
              System.out.println(current.data + " -> ");
              current = current.ref;
          } while(current != first);
          System.out.println("Back to start");
      }      
}
