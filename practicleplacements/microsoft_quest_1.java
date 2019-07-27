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
public class microsoft_quest_1 {
    public static void main(String[] args) {
        
        Scanner kb=new Scanner(System.in);
        int n=kb.nextInt();
        int size= (n*2)+2;
        ArrayList<Integer> arr=new ArrayList<Integer>();
        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
        
        for(int i=0;i<size;i++)
        {
            arr.add(kb.nextInt());
        }
        
        for(int i=0;i<size;i++)
        {
            if(hm.containsKey(arr.get(i)))
            {
                hm.put(arr.get(i), 2);
            }
            else
            {
                hm.put(arr.get(i), 1);
            }
        }
        System.out.println("hash map is"+hm);
        System.out.println("output");
        for(Map.Entry m:hm.entrySet())
        {
            if(m.getValue().equals(1))
            {
                System.out.print(m.getKey());
            }
        }
        
        
    }
    
}
