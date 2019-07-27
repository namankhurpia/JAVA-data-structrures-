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
public class rahul_quest {
    public static void main(String[] args) {
        
        Scanner kb=new Scanner(System.in);
        int n=kb.nextInt();
        int arr1[]=new int[n];
        int arr2[]=new int[n];
        ArrayList<Integer> list=new ArrayList<Integer>();
        int largest=0;
        for(int i=0;i<n;i++)
        {
            arr1[i]=kb.nextInt();
            if(arr1[i]>largest)
            {
                largest=arr1[i];
                list.add(largest);
            }
        }
        
        System.out.println(largest);
        
        
    }
}
