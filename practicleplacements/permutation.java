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
public class permutation {
    public static void main(String[] args) {
        
        Scanner kb=new Scanner (System.in);
        int size=6;
        int arr[]=new int[]{1,2,3,4,5,6};
        //permutation with repeating 
        System.out.println("permutation with repeating ");
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                
                
                    System.out.println("pair"+arr[i]+""+arr[j]);
                
            }
        }
        
        System.out.println("");
        //permustation with same numbers not repeating
        System.out.println("permustation with same numbers not repeating");
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                if(i!=j)
                {
                    System.out.println("pair"+arr[i]+""+arr[j]);
                }
            }
        }
        
        System.out.println("");
        //permuation with one number used only once
        System.out.println("permuation with one number used only once");
        for(int i=0;i<size;i++)
        {
            for(int j=i+1;j<size;j++)
            {
                System.out.println("pair"+arr[i]+arr[j]);
            }
        }
        
        
    }
    
}
