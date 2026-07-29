/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lineals;

/**
 *
 * @author andresz
 */
import java.util.HashSet;
import java.util.Set;

public class SetExample {
    Set<String> fruitSet = new HashSet<>();
    public void PrintExample(){
        fruitSet.add("Apple");
        fruitSet.add("Banana");
        fruitSet.add("Pineapple");
        fruitSet.add("Strawberry");
        fruitSet.add("Orange");

        System.out.println("Fruit set: "+fruitSet);
        if(fruitSet.contains("Banana")){
            System.out.println("The set contains Bananas");
        }
        fruitSet.remove("Orange");
        for(String fruit : fruitSet){
            System.out.println("- "+ fruit);
        }
        System.out.println("Remaining fruits: "+ fruitSet.size());
    }
    
}
