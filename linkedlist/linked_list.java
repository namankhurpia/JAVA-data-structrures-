/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;
import java.util.*;

/**
 *
 * @author Naman Khurpia
 */


public class linked_list {
    
    Node n;
    class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data =d;
            next = null;
        }
        
    }
    
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int num=kb.nextInt();
        int k=kb.nextInt();
        
        LinkedList<Integer> ll=new LinkedList<Integer>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        ll.add(2,8);
        System.out.println(ll);
        
        
    }
    
}
