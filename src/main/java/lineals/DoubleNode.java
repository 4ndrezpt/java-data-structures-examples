/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lineals;

/**
 *
 * @author andresz
 */
public class DoubleNode {
    String data;
    DoubleNode prev;
    DoubleNode next;
    
    public DoubleNode(String data){
        this.data = data;
        prev = next = null;
    }
    public String getData(){
        return data;
    }
}
