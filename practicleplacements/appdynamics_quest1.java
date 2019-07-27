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
public class appdynamics_quest1 {
    
    static boolean check(String str)
    {
        int len=str.length()-1;
        if(str.charAt(0) == 'a' || str.charAt(0) == 'e' || str.charAt(0) == 'i' || str.charAt(0) == 'o' || str.charAt(0) == 'u' )
        {
            if(str.charAt(len) == 'a' || str.charAt(len) == 'e' || str.charAt(len) == 'i' || str.charAt(len) == 'o' || str.charAt(len) == 'u' )
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        else
        {
            return false;
        }
    }
    
    static int dowork(List<String> strArr,int s,int e)
    {
        String temp;
        if(e==0)
        {
            temp=strArr.get(s);
            check(temp);
        }
        else
        {
            for(int i=0;i<strArr.size();i++)
            {

            }
        }
        return strArr<>;
        
    }
    
    static List<Integer> perform(List<String> strArr, List<String> query)
    {
        String qu;
        int s,e;
        char start,end;
        String starts,ends;
        ArrayList<Integer> an=new ArrayList<Integer>();
        for(int i=0;i<query.size();i++)
        {
            qu=query.get(i);
            if(qu.length()>1)
            {
                start = qu.charAt(0);
                end = qu.charAt(2);
                starts = start+"";
                ends=end+"";
                s = Integer.parseInt(starts);
                e=Integer.parseInt(ends);
                //System.out.println(s);
                //System.out.println(e);
                dowork(strArr,s,e);
                
            }
            else
            {
                start = qu.charAt(0);
                starts = start+"";
                s= Integer.parseInt(starts);
                //System.out.println(s);
                dowork(strArr,s,0);
            }
            
            
            
        }
        return an;
    }
    
    public static void main(String[] args) {
        
        ArrayList<String> strArr=new ArrayList<String>();
        strArr.add("aab");
        strArr.add("a");
        strArr.add("ibe");
        strArr.add("bbbbba");
        
        ArrayList<String> query=new ArrayList<String>();
        query.add("2");
        query.add("2-3");
        query.add("1-2");
        
        
        
        System.out.println(perform(strArr,query));
        //System.out.println(check("naman"));
        //System.out.println(check("asdjcbse"));
        //System.out.println(check("a"));
        
        
    }
    
}
