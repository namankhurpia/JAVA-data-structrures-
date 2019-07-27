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
public class rahulgeek {
    public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
                int kb =sc.nextInt();
                int count=0;
                while(kb!=0)
                {
                    kb=kb &(kb<<1);
                    count++;
                }
                System.out.println(count);
                

    }
}
