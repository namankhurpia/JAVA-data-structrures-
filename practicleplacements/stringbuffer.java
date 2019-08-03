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
public class stringbuffer {
    public static void main(String[] args) {
        
        Scanner kb=new Scanner(System.in);
        String str=kb.nextLine();
        int num=kb.nextInt();
        int len=str.length();
        StringBuffer sb=new StringBuffer(str);
        //System.out.println(sb.reverse());
        StringBuffer s1=new StringBuffer(sb.substring(0, num));
        StringBuffer s2=new StringBuffer(sb.substring(num,len));
        System.out.print(s1.reverse());System.out.print(s2);
        
        
        
        //string is not equal to stringbuffer
        StringBuffer s=new StringBuffer("hello");
        if(s.equals("hello"))
            System.out.println("yea");
        else
            System.out.println("nope");
        
        
        //checking contains-----done using string
        String ss="an";
        String superl="naman";
        if(superl.contains(ss))
            System.out.println("yessss");
        
        
        //cheking replace
        StringBuffer stb= new StringBuffer();
        String noo="56";
        if(noo.contains("5"))
        {
            String newst=noo.replace("5","6");
        }
        
        
    }
    
}
