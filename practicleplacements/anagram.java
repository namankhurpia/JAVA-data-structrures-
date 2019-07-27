/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicleplacements;

import java.util.Scanner;

/**
 *
 * @author Naman Khurpia
 */
public class anagram {
    public static void main(String[] args) {
        
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter the string ");
        String input=kb.nextLine();
        

        int mark[]=new int[123];
        
        for(int i=0;i<input.length();i++)
        {
            int temp=input.charAt(i);
            mark[temp]=mark[temp]+1;
        }
        
        for(int j=97;j<123;j++)
        {
            if(mark[j]==0)
            {
                System.out.println("not a pangram");
                System.exit(0);
            }
        }
        
        System.out.println("pangram");
        
        
        for(int i=97;i<123;i++)
        {
            System.out.println( "valueis"+mark[i]);
        }
        
        
        
        
        
    }
    
}
