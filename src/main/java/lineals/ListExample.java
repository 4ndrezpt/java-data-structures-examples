/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lineals;

/**
 *
 * @author andresz
 */
import java.util.ArrayList;
import java.util.List;

public class ListExample {
    List<String> fruits = new ArrayList<>();
    public void PrintExample(){
        fruits.add("Apples");
        fruits.add("Bananas");
        fruits.add("Oranges");
        fruits.add("Pineappples");
        
        fruits.set(2, "Mangoes");
        fruits.remove(1);
        
        System.out.println("List Size: "+ fruits.size());
        
        for(String fruit : fruits){
            System.out.println("Fruit in List: "+fruit);
        }        
    }    
}
