/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data_structures.map;

import java.util.*;
import java.util.Map.Entry;

/**
 *
 * @author Naman Khurpia
 */
public class hashmap {
    public static void main(String[] args) {
        
        HashMap<String,String> hm=new HashMap<String,String>();
        hm.put("afvd fvd","namann");
        hm.put("zxcvs kjcxnb","aasjcn");
        hm.put("zfsd vsdz","asdfcn");
        hm.put("asca scc","sckfn");
        hm.put("dsvd fvj","dfvn");
        //hm.put("c","hellow2");
        System.out.println("HashMap is "+hm);
        for(Map.Entry m:hm.entrySet())
        {
            System.out.println(m.getKey() + " ==> "+m.getValue());
        }
        
        //now sorting
        TreeMap<String,String> tree=new TreeMap<String,String>(hm);
        Set<Entry<String,String>> mappings=tree.entrySet();
        System.out.println("\nafter sorting by key values");
        for(Map.Entry m:mappings)
        {
            System.out.println(m.getKey()+" ==> "+m.getValue());
        }
        
        //sorting done
        
        
        
        
        
        //get only keys in a set or only values in a set
        System.out.println("KEY SET IS "+hm.keySet());
        System.out.println("VALUES SET IS"+hm.values());
        
        
        
        
        
        
        
        
        
        
        
        
        
        System.out.println("\n\n\nNOW WITH NUMBERS\n");
        
        
        //doing with numbers
        HashMap<Integer,String> hmn=new HashMap<Integer,String>();
        hmn.put(12,"namann");
        hmn.put(6,"aasjcn");
        hmn.put(-5,"asdfcn");
        hmn.put(1,"sckfn");
        hmn.put(49,"dfvn");
        //hm.put("c","hellow2");
        System.out.println("HashMap is "+hmn);
        for(Map.Entry m:hmn.entrySet())
        {
            System.out.println(m.getKey() + " ==> "+m.getValue());
        }
        
        //now sorting
        TreeMap<Integer,String> treen=new TreeMap<Integer,String>(hmn);
        Set<Entry<Integer,String>> mappingsn=treen.entrySet();
        System.out.println("\nafter sorting by key values");
        for(Map.Entry m:mappingsn)
        {
            System.out.println(m.getKey()+" ==> "+m.getValue());
        }
        
        //sorting done
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
