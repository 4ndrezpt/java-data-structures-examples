/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lineals;

/**
 *
 * @author andresz
 */
public class Node {
    String data;
    Node ref;    
    
    public Node(String newData){
        this.data = newData;
    }
    public String getData(){
        return this.data;
    }
    public void setRef(Node reference){
        this.ref = reference;
    }
    public Node getRef(){
        return this.ref;
    }    
}
