/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linked_list;

/**
 *
 * @author Naman Khurpia
 */
public class basic {
	Node head;
	class Node
	{
		int data;
		Node next;
		Node(int new_data)
		{
			data = new_data;
			next = null;
		}
	}
	
	public void push_on_top(int data)
	{
            Node new_node = new Node(data);
            new_node.next = head;
            head = new_node;
	}
        
        public void push_at_back(int data)
        {
            Node new_node = new Node(data);
            if(head==null)
            {
                System.out.println("cannot ");
                return;
            }
            new_node.next = null;
            Node last = head;
            while(last.next!=null)
            {
                last= last.next;
            }
            last.next = new_node;
            return;
        }
        
        public void insert_between(int data , Node given_node)
        {
            if(given_node==null)
            {
                System.out.println("cannot");
                return;
            }
            Node new_node = new Node(data);
            new_node.next = given_node.next;
            given_node.next = new_node;
        }
        
        public void printlist() 
        {
            Node temp  = head;
            while(temp!=null)
            {
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
        }
        
        
        
        
        

	public static void main(String []args)
	{
		
		basic ll = new basic();
                System.out.println("insert at front");
		ll.push_on_top(34);
		ll.push_on_top(1);
		ll.push_on_top(2);
		ll.printlist();
                System.out.println("");
                System.out.println("insert at end");
                ll.push_at_back(8900);
                ll.push_at_back(23);
                ll.printlist();
                System.out.println("");
                System.out.println("insert between");
                ll.insert_between(6969, ll.head);
                ll.insert_between(898989, ll.head.next.next.next);
                ll.printlist();
	}
}		
		