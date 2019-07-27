/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data_structures.map;
import java.util.*;
/**
 *
 * @author Naman Khurpia
 */
public class treemap {
    public static void main(String[] args) {
        
        //always ordered by the keys
        
       TreeMap <String,String> tree=new TreeMap<String,String>();
       tree.put("a","fgbn");
       tree.put("z","hj");
       tree.put("j","dfknv");
       tree.put("m","sdjv");
       tree.put("l","dv");
       
        System.out.println("TREE MAP IS SORTED "+tree);
        
        
        System.out.println("\n\nnow with numbers\n");
        
        TreeMap <Integer,String> tre=new TreeMap<Integer,String>();
       tre.put(10009,"fgbn");
       tre.put(49,"hj");
       tre.put(1,"dfknv");
       tre.put(-6,"sdjv");
       tre.put(12,"dv");
       System.out.println("TREE MAP IS SORTED "+tre);
       
    }
    
}
