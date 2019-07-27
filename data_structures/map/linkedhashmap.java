/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data_structures.map;
import java.util.*;
import java.util.Map.*;
/**
 *
 * @author Naman Khurpia
 */
public class linkedhashmap {
    public static void main(String[] args) {
        //same as hashmap just maintains insertion order
        LinkedHashMap<String,String> lhm=new LinkedHashMap<String,String>();
        lhm.put("afvd fvd","namann");
        lhm.put("zxcvs kjcxnb","aasjcn");
        lhm.put("zfsd vsdz","asdfcn");
        lhm.put("asca scc","sckfn");
        lhm.put("c","dfvn");
        lhm.put("f","sdv");
        lhm.put("c","naman");
        //hm.put("c","hellow2");
        System.out.println("HashMap is "+lhm);
        
        //preserves insertion order
        
        //now sorting
        TreeMap<String,String> tree=new TreeMap<String,String>(lhm);
        Set<Entry<String,String>> mapping=tree.entrySet();
        System.out.println("after sorting the linked hashmap");
        for(Map.Entry m:mapping)
        {
            System.out.println(m.getKey()+" == "+m.getValue());
        }
        
        
        
        
        
        
        //now doing with nunmbers ---- it maintains insertion order
        System.out.println("\n\n\nnow with numbers\n");
        
        LinkedHashMap<Integer,String> lhmn=new LinkedHashMap<Integer,String>();
        lhmn.put(89,"naman1");
        lhmn.put(12,"nhef");
        lhmn.put(-12, "wollah");
        lhmn.put(1,"sdkv");
        lhmn.put(-66, "value");
        System.out.println("linked hashmap with numbers is "+lhmn);
        
        //sorting the linkedhashmap with numbers
        System.out.println("now sorting the linkedhashmap which maintains the insertion order");
        TreeMap<Integer,String> treen=new TreeMap<Integer,String>(lhmn);
        Set<Entry<Integer,String>> mappingn=treen.entrySet();
        for(Map.Entry m:mappingn)
        {
            System.out.println(m.getKey()+" == "+m.getValue());
        }
        
        
        
    }
    
}
