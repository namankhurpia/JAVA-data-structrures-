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
public class lcm {
    
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.print("Enter first number ");
        int a=kb.nextInt();
        System.out.print("Enter second number ");
        int b=kb.nextInt();
        
        System.out.println("LCM is "+lcm(a,b));
        
        
    }

    static int lcm(int a, int b) {
        
        return a*b/gcd(a,b);
    }

    static int gcd(int a, int b) {
        if(a==0)
            return b;
        else
            return gcd(b%a,a);
    }
    
}
