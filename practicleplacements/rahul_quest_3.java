/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicleplacements;
import java.util.*;
import java.util.Map.*;
/**
 *
 * @author Naman Khurpia
 */
public class rahul_quest_3 {
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
        
        Scanner kb=new Scanner(System.in);
        
        int num = kb.nextInt();
        LinkedHashMap<String,Integer> map=new LinkedHashMap<String,Integer>();
        
        String temp;
        for(int i=0;i<num;i++)
        {
            temp =kb.next();
            char ar[]=temp.toCharArray();
            map.put(temp, ar.length);
        }
        
        
        
        Map<String,Integer> maap = sortByValue(map);
        System.out.println(maap);
        
    }
    
}
