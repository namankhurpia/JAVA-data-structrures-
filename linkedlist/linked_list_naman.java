/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

/**
 *
 * @author Naman Khurpia
 */
public class linked_list_naman {
    
    Node head;
    class Node
    {
        int data;
        Node next;
        Node( int d)
        {
            next = null;
            data = d;
        }
        
    }
    
    public void push(int data)
    {
        Node new_node=new Node(data);
        new_node.next = head;
        head = new_node;
        
    }

    public static void main(String[] args) {
        
        linked_list_naman ll=new linked_list_naman();
        ll.push(5);
        
        
        
    }
    
}
