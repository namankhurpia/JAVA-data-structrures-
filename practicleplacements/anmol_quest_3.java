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

public class anmol_quest_3 {
    public static void main(String[] args) {
        
        Scanner kb=new Scanner(System.in);
        int arr[]=new int[]{6,1,4,6,3,2,7,4};
        
        int k =kb.nextInt();
        int l =kb.nextInt();
        
        if(arr.length<(k+l))
        {
            System.out.println("-1");
        }
        
        ArrayList<Integer> sumk=new ArrayList<Integer>();
        ArrayList<Integer> suml=new ArrayList<Integer>();
        int temp=0;
        int index=0;
        for(int i=0;i<arr.length-2;i++)
        {
            int temp1=arr[i];
            int temp2=arr[i+1];
            int temp3=arr[i+2];
            temp =temp1+temp2+temp3;
            sumk.add(temp);
            if(sumk.get(i)>temp)
            {
                temp=sumk.get(i);
                index = i;
            }
        }
        System.out.println(sumk);
        System.out.println("index is "+index);
        
        for(int i=0;i<index-1;i++)
        {
            int temp1=arr[i];
            int temp2=arr[i+1];
            suml.add(temp1+temp2);
        }
        for(int i=index;i<arr.length-1;i++)
        {
            int temp1=arr[i];
            int temp2=arr[i+1];
            suml.add(temp1+temp2);
        }
        
        Collections.sort(suml,Collections.reverseOrder());
        Collections.sort(sumk,Collections.reverseOrder());
        System.out.println(suml);
        System.out.println("max for k is "+sumk.get(0));
        System.out.println("max for l is "+suml.get(0));
        
        
        
        
        
        
    }
    
}
