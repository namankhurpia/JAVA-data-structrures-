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
public class PracticlePlacements {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter the number of elements in array");
        int n=kb.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the number");
            arr[i]=kb.nextInt();
    
        }
        
        System.out.println("Enter the amount of rotation");
        int rotation= kb.nextInt();
        for(int i=rotation;i<n;i++)
        {
            System.out.println(arr[i]);
        }
        for(int i=0;i<rotation;i++)
        {
            System.out.println(arr[i]);
        }
        
        
        
        
    }
    
}
