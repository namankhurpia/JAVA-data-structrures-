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
public class chabra_quest1 {
    public static void main(String[] args) {
        
        Scanner kb=new Scanner(System.in);
        System.out.println("enter number of numbers");
        int no = kb.nextInt();

        int arr[]=new int[no];
        for(int i=0;i<no;i++)
        {
            arr[i]=kb.nextInt();
        }
        
        int narr[]=new int[no];
        for(int i=0;i<no;i++)
        {
            narr[i]=0;
        }
        
        int st=0;
        for(int i=0;i<no;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(arr[j]>arr[i])
                {
                    st=st+1;
                }
                
            }
            narr[i]=st;
            st=0;
        }
        
        
        
        
        //printing output
        for(int i=0;i<no;i++)
        {
            System.out.print(narr[i]+" ");
        }
        
    }
    
}
