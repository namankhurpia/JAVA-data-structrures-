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
public class printnthlistitem {
    Node head;
    class Node
    {
        Node next;
        int data;
        Node(int newdata)
        {
            data=newdata;
            next = null;
        }
    }
    public void push(int data)
    {
        Node obj=new Node(data);
        obj.next = head;
        head = obj;
    }
    public void print_n_th (int pos)
    {
        int len=0;
        Node temp = head;
        while(temp!=null)
        {
            temp=temp.next;
            len=len+1;
        }
        
        temp=head;
        for(int i=0;i<len-pos;i++)
        {
            temp =temp.next;
        }
        System.out.println(temp.data);
        
    }
    public static void main(String[] args) {
        
        printnthlistitem list=new printnthlistitem();
        list.push(45);
        list.push(4);
        list.push(12);
        list.push(8);
        
        list.print_n_th(2);
        
        
        
    }
    
}
