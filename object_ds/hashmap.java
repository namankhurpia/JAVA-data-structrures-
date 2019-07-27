/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object_ds;
import java.util.*;
import java.util.Map.*;

/**
 *
 * @author Naman Khurpia
 */
class car implements Comparable<car> 
    {
        int len,wid;
        car(int len, int wid)
        {
            this.len = len;
            this.wid = wid;
        }
        public String toString()
        {
            return len+","+wid;
        }
        
	public int compareTo(car o) {
                if(o.len > this.wid )
                {
                    return  o.len + this.wid;
                }
                else
                {
                    return  o.len - this.wid;
                }
		
	}
        
    }
public class hashmap {
    
    public static void main(String[] args) {
        
        car car1=new car(12,56);
        car car2=new car(21,2);
        
        LinkedHashMap<car,String> lhm=new LinkedHashMap<car,String>();
        lhm.put(car1, "naman's");
        lhm.put(car2, "anu's");
        
        for(Map.Entry m:lhm.entrySet())
        {
            System.out.println(m.getKey()+"="+m.getValue());
        }
        
        
        //now sorting a hashmap
        TreeMap<car,String> tree=new TreeMap<car,String>(lhm);
        Set<Entry<car,String>> mappings=tree.entrySet();
        for(Map.Entry m:mappings)
        {
            System.out.println(m.getKey()+" == "+m.getValue());
        }
        
        
        
    }
    
}
