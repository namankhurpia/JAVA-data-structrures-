
package practicleplacements;
import java.util.*;

public class microsoft_quest_2 {
    
    Node head;
    class Node
    {    
        int data;
        Node next;
        public Node(int d)
        {
            data=d;
            next = null;
        }
    }
    
    public void push(int data)
    {
        Node new_node=new Node(data);
        new_node.next = head;
        head = new_node;
    }
    
    public void printlist()
    {
        Node tempnode=head;
        while(tempnode!=null)
        {
            System.out.print(tempnode.data+" ");
            tempnode = tempnode.next;
        }
    }
    
    public void printlistreverse()
    {
        Node tempnode=head;
        while(tempnode!=null)
        {
            System.out.print(tempnode.data+" ");
            tempnode = tempnode.next;
        }
    }
    
    public static void main(String[] args) 
    {
        
        Scanner kb=new Scanner(System.in);
        int num=kb.nextInt();
        int k=kb.nextInt();
        microsoft_quest_2 ll=new microsoft_quest_2();
        
        for(int z=0;z<num;z++)
        {            
            ll.push(kb.nextInt());
        }
        ll.printlistreverse();
        
        
        
        
            
    }
        
   
            
}
