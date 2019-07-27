/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data_structures.set;


import java.util.*;

/**
 *
 * @author Naman Khurpia
 */
public class set {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        Set<Integer> set=new HashSet<Integer>();
        set.add(2);
        set.add(9);
        set.add(6789);
        set.add(1);
        set.add(-47);
        
        System.out.println(set);
        
        /*Iterator i=set.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }*/
        
        
        HashSet<Integer> hs=new HashSet<Integer>();
        hs.add(2);
        hs.add(9);
        hs.add(6789);
        hs.add(1);
        hs.add(-47);
        System.out.println(hs);
        
        
        
        
        
     
        
        
        
        
        
        
    }
    
}
