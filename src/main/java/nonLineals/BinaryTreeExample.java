/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nonLineals;

/**
 *
 * @author andresz
 */
public class BinaryTreeExample<T extends Comparable<T>> {
    private TreeNode<T> root;
    
    public BinaryTreeExample(){
        this.root = null;
    }
    
    public void insert(T data){
        root = insertRecursive(root, data);
    }    
    
    private TreeNode<T> insertRecursive(TreeNode<T> current, T data){
        if(current == null){
            return new TreeNode<T>(data);
        }
        //compare data to determine the place
        if(data.compareTo(current.data) < 0){
            current.left = insertRecursive(current.left, data);        
        } else if(data.compareTo(current.data) > 0){
            current.right = insertRecursive(current.right, data);
        }
        return current;       
    }
    //public to initiate in order traversal
    public void traverseInOrder(){
        inOrderRecursive(root);
        System.out.println();
    }
    private void inOrderRecursive(TreeNode<T> node){
        if(node != null){
            inOrderRecursive(node.left);
            System.out.println(node.data+" ");
            inOrderRecursive(node.right);             
        }
    }
    public boolean search(T data){
        return searchRecursive(root, data);
    }
    private boolean searchRecursive(TreeNode<T> current, T data){
        if(current == null){
            return false;
        }
        if(data.equals(current.data)){
            return true;
        }
        return data.compareTo(current.data) < 0 ? searchRecursive(current.left, data) : searchRecursive(current.right, data);
    }    
}
