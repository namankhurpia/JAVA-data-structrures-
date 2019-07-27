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
public class sorted_set {
    public static void main(String[] args) {
        
        SortedSet<Integer> set=new TreeSet<Integer>();
        set.add(12);
        set.add(1);
        set.add(68);
        set.add(-25);
        set.add(-1);
        
        System.out.println(set);
        
        
        
        Set<Integer> hts=new TreeSet<Integer>();
        hts.add(2);
        hts.add(9);
        hts.add(6789);
        hts.add(1);
        hts.add(-47);
        System.out.println(hts);
        //reverse order set printing
        
        Iterator i=hts.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
        List list = new ArrayList(hts);
        Collections.sort(list, Collections.reverseOrder());
        Set resultSet = new LinkedHashSet(list);
        System.out.println("reverse order set printing "+resultSet);
        
        
        
        Set<String> ss=new TreeSet<String>();
        ss.add("naman1");
        ss.add("naman2");
        ss.add("naman12"); //beware
        ss.add("siod");
        ss.add("naman1");
        ss.add("zzz");
        ss.add("hellow");
        System.out.println(ss);
        
        
        
        
        
        
    }
    
}
