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

public class ArrayListExample {
      ArrayList<String> fruits= new ArrayList<>();
      
      public void PrintExample(){
          fruits.add("Apple");
          fruits.add("Banana");
          fruits.add("Strawberry");
          fruits.add("Oranges");
          System.out.println("Original list"+fruits);
          
          String firstFruit = fruits.get(0);
          System.out.println("First fruit"+ firstFruit);
          
          fruits.set(1, "Mango");
          System.out.println("Current Size"+ firstFruit);
          fruits.remove(fruits.size()-1);
          for (String fruit: fruits){
             System.out.println("fruit ="+fruit);
          }
          
      }      
}
