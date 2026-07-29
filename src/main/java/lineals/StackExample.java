/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lineals;

/**
 *
 * @author andresz
 */
import java.util.ArrayDeque;
import java.util.Queue;

public class StackExample {
    Queue<String> fifoQueue = new ArrayDeque<>();
    
    public void PrintExample(){
        fifoQueue.add("For Whom the bell tolls");
        fifoQueue.add("The old man and the sea");
        fifoQueue.add("Moby Dick");
        
        System.out.println("Front element: "+fifoQueue.peek());
        for(String item : fifoQueue){
            System.out.println("Stack FIFO element: "+item);
        }
    }
    
}
