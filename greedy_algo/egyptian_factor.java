/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greedy_algo;
import java.util.Scanner;
/**
 *
 * @author Naman Khurpia
 */
public class egyptian_factor {
    public  void findfactor(int num,int den)
    {
        if(num ==0 || den ==0)
        {
            
        }
        if(num%den ==0)
        {
            return;
        }
        
        
        
    }
    public static void main(String[] args) {
        
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter numerator");
        int num = kb.nextInt();
        System.out.println("Enter denominator");
        int den = kb.nextInt();
        
        egyptian_factor obj=new egyptian_factor();
        obj.findfactor(num,den);
        
        
    }
    
}
