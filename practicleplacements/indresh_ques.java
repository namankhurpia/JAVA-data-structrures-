/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicleplacements;
import java.util.*;
/**
 *
 * @author Naman Khurpia
 */
public class indresh_ques {
    public static void main(String[] args) {
        
        Scanner kb=new Scanner(System.in);
        int num=kb.nextInt();
        String arr[]=new String[num];
        
        char temp1;
                char temp2;
                char temp3;
        
        ArrayList<String> list=new ArrayList<String>();
        ArrayList<String> list2=new ArrayList<String>();
        HashMap<String,String> hm=new HashMap<String,String>();
        
        hm.put("2", "abc");
        hm.put("3", "def");
        hm.put("4", "ghi");
        hm.put("5", "jkl");
        hm.put("6", "mno");
        hm.put("7", "pqrs");
        hm.put("8", "tuv");
        hm.put("9", "wxyz");
        
        
        for(int i=0;i<num;i++)
        {
            arr[i]=kb.next();
        }
        
        
        for(int i=0;i<num;i++)
        {
            for(Map.Entry m:hm.entrySet())
            {
                if(arr[i].equals(m.getKey()))
                {
                    list.add(m.getValue().toString());
                }
            }
        }
        
        
        System.out.println(list);
        
            /*for(int j=0;j<3;j++)
            {
                for(int i=0;i<list.size();i++)
                {
                    System.out.print(list.get(i).charAt(j));
                }
                System.out.println();
            }*/
            
            for(int i=0;i<list.size();i++)
            {
                temp1=list.get(i).charAt(0);
                temp2=list.get(i).charAt(1);
                temp3=list.get(i).charAt(2);
                String tem1=Character.toString(temp1);
                list2.add(tem1);
                String tem2=Character.toString(temp2);
                list2.add(tem2);
                String tem3=Character.toString(temp3);
                list2.add(tem3);
                
            }
            
            System.out.println(list2);
        
            
        for(int i=0;i<list2.size();i++)
        {
            for(int k=0+1;k<list2.size()-1;k++)
            {
                for(int j=0;j<num;j++)
                {
                    System.out.print(list2.get(i).charAt(j));
                }
            }
            System.out.println();  
        }
        
        
        
        
    }
    
    
    
}
