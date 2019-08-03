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
public class sort_hashmap_by_value {
    
    public static Map<String,Integer> sortByValue(HashMap<String,Integer> hm)
    {
        List<Map.Entry<String,Integer>> list = new LinkedList<Map.Entry<String,Integer>>(hm.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String,Integer>>()
        {
          public int compare(Map.Entry<String,Integer> obj1, Map.Entry<String,Integer> obj2)
          {
              return (obj1.getValue().compareTo(obj2.getValue()));
          }
        });
        
        HashMap<String,Integer> newmap=new LinkedHashMap<String,Integer>();
        for(Map.Entry m:list)
        {
            newmap.put(m.getKey().toString(),Integer.parseInt(m.getValue().toString()));
        }
        return newmap;
            
    }
    
    public static void main(String[] args) {
        
        HashMap<String,Integer> hm=new HashMap<String,Integer>();
        hm.put("Math", 98); 
        hm.put("Data Structure", 85); 
        hm.put("Database", 91); 
        hm.put("Java", 95); 
        hm.put("Operating System", 79); 
        hm.put("Networking", 80); 
        
        Map<String, Integer> hm1 = sortByValue(hm);
        
        System.out.println(hm1);
        
        
    }
    
}
