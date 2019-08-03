/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarytree;

/**
 *
 * @author Naman Khurpia
 */
class Node
{
    int data;
    Node left,right;
    Node(int new_data)
    {
        new_data=data;
        left = right = null;
    }
}
public class binarytree {
   
        
        Node root;
        
        binarytree()
        {
            root=null;
        }
        binarytree(int data)
        {
            root = new Node(data);
        }
        
        
    public static void main(String[] args) {
        
        binarytree tree=new binarytree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        
    }
    
}
