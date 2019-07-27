/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicleplacements;

/**
 *
 * @author Naman Khurpia
 */
import java.util.*;
public class tcsquestion {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int num=kb.nextInt();
        int total_en=kb.nextInt();
        
        //input - 4  30  
        //   energy         12 15 19 25  
        //   shots          5  13 25 16  
        //solution-         
        Double arr1[]=new Double[num];
        Double arr2[]=new Double[num];
        Double eff[]=new Double[num];
        for(int i=0;i<num;i++)
        {
            arr1[i]=kb.nextDouble();
        }
        for(int i=0;i<num;i++)
        {
            arr2[i]=kb.nextDouble();
        }
        for(int i=0;i<num;i++)
        {
            eff[i]=arr1[i]/arr2[i];
            System.out.println("Efficiency is "+eff[i]);
        }
        
        Arrays.sort(eff);
        
        
        
        
        
        
        
    }
    
}
