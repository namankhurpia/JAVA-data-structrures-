/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data_structures.map;
import java.util.*;
import java.util.Map.*;
        /*
 *
 * @author Naman Khurpia
 */
public class hashmap_remove {
    public static void main(String[] args) {
        
        Scanner kb=new Scanner(System.in);
        LinkedHashMap<String,Integer> map=new LinkedHashMap<String,Integer>();
        map.put("a", 1);
        map.put("b", 6);
        map.put("c", 4);
        map.put("d", 7);
        map.put("e", 8);
        map.put("f", 0);
        
      
        String arr[]=new String[]{"a","b","c"};
        /*for(Map.Entry m: map.entrySet())
        {
            if(i<3)
            {
                map.remove(arr[i]);
                i=i+1;
                
            }
            
            //System.out.println(m.getKey()+ " = "+m.getValue());
        }*/
        
        for(int i=0;i<arr.length;i++)
        {
            map.remove(arr[i].toString());
        }
        
        System.out.println(map);
        
    }
    
}
