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
public class anmol_quest1 {
    public static void main(String[] args) {
        
        Scanner kb=new Scanner(System.in);
        String str=kb.next();
        char arr[]=str.toCharArray();
        char newarr[]=new char[str.length()];
        
        
        for(int i=0;i<arr.length;i++)
        {
            
            if(arr[i]=='?')
            {
                newarr[i]=getRandomNumberInRange();
                
                /*int val1=arr[i-1];
                int val2= arr[i+1];
                char c=getval(val1,val2);
                newarr[i]=c; */              
            }
            else
            {
                newarr[i]=arr[i];
            }
            
        }
        
        for(char c:newarr)
        {
            System.out.print(c+" ");
        }
        
    }

    
    	private static char getRandomNumberInRange() {

		int min = 97;
                int max = 122;

		Random r = new Random();
		int temp= r.nextInt((max - min) + 1) + min;
                char ret=(char)temp;
                return ret;
	}
        
        
        
        
        
        
        
        
        private static char getval(int val1, int val2) {
        
        int finalval =0;
        if(val1+1!=val2)
        {
            finalval = val1+1;
        }
        else
        {
            if(val1>3)
            {
                finalval=val1-2;
            }
            
        }
        char ret=(char)finalval;
        return ret;
        
    }
    
    
    
}
