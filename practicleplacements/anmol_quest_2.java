/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicleplacements;
import java.util.*;
import static practicleplacements.rahul_quest_3.sortByValue;
/**
 *
 * @author Naman Khurpia
 */
public class anmol_quest_2 {
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
        int noa = kb.nextInt();
        int nob = kb.nextInt();
        int noc = kb.nextInt();
        
        HashMap<String,Integer> map=new HashMap<String,Integer>();
        map.put("a",noa);
        map.put("b",nob);
        map.put("c",noc);
        Map<String,Integer> maap = sortByValue(map);
        System.out.println(maap);
        
        int max = 0;
        String maxstr = "";
        int min = Integer.MAX_VALUE;
        String minstr = "";
        int mid = 0;
        String midstr = "";
        for(Map.Entry m:maap.entrySet())
        {
            if(Integer.parseInt(m.getValue().toString())>max)
            {
                max = Integer.parseInt(m.getValue().toString());
                maxstr = m.getKey().toString();
            }
        }
        for(Map.Entry m:maap.entrySet())
        {
            if(Integer.parseInt(m.getValue().toString())<min)
            {
                min = Integer.parseInt(m.getValue().toString());
                minstr = m.getKey().toString();
            }
        }
        for(Map.Entry m:maap.entrySet())
        {
            if(Integer.parseInt(m.getValue().toString())>=min && Integer.parseInt(m.getValue().toString())<=max)
            {
                mid = Integer.parseInt(m.getValue().toString());
                midstr = m.getKey().toString();
            }
        }
        
        System.out.println(max);
        System.out.println(mid);
        System.out.println(min);
        
        ArrayList<String> arr=new ArrayList<String>();
        for(int i=0;i<max;i=i+2)
        {
            arr.add(maxstr);
            arr.add(maxstr);
            if(mid !=0)
            {
                arr.add(midstr);
                mid = mid-1;
            }
            else
            {
                
                if(min !=0)
                {
                        arr.add(minstr);
                        min = min-1;
                }
                else
                {
                    break;
                }
            }
             
        }
        
        System.out.println(arr);
        
 
        
    }
    
}
