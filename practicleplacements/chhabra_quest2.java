/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicleplacements;
import java.util.*;
/**
 *
 * @author Naman Khurpia
 */
public class chhabra_quest2 {
    public static void main(String[] args) {
        
        Scanner kb=new Scanner(System.in);
        String str= "abcnamaniklp";
        char carr[]=str.toCharArray();
        Stack s = new Stack();
        /*for(int i=0;i<carr.length;i++)
        {
            s.push(carr[i]);
        }*/
        s.push(0);
        for(int i=0;i<carr.length;i++)
        {
            if(s.get(i-1).toString().equals(carr[i]+""))
            {
                System.out.println("found");
            }
            else
            {
                s.push(carr[i]);
            }
            
        }
        
        
        
    }
    
}
