/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data_structures;

import java.util.Stack;
import java.util.*;

/**
 *
 * @author Naman Khurpia
 */
public class stacks {
    
    public static void main(String[] args) {
        
        Stack s=new Stack();
        s.push(23);
        s.push(56);
        s.push(11);
        System.out.println(s.pop());
        System.out.println(s);
        System.out.println(s.search(56));
        System.out.println(s.search(23));
        System.out.println(s.peek());
        
        //StackAsLinkedList  sll=new StackAsLinkedList ();
        
    }
    
}
