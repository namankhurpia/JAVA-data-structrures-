/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicleplacements;
import java.util.*;

public class micorsoft_quest_4 {
    public static void main(String[] args) {
        
        Scanner kb=new Scanner(System.in);
        int no=kb.nextInt();
        int arr[]=new int[no];
        ArrayList<Integer> list=new ArrayList<Integer>();
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=kb.nextInt();
            list.add(arr[i]);
        }
        
        int max=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        System.out.println("max is"+max);
        System.out.println(list);
        
        /*for(int i=0;i<max;i++)
        {
            if()
        }*/
        
        
    }
    
}
