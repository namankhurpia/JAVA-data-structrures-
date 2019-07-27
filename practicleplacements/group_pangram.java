/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicleplacements;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Naman Khurpia
 */
public class group_pangram {
    
    
    
    public static void main(String[] args) {
        
        Scanner kb=new Scanner(System.in);
        
        String value=getvalue();
        System.out.println("after return"+value);
    }

    public static String getvalue() {
        double value = 200.3456;
        System.out.printf("Value: %.2f", value);
        String result = String.format("%.2f", value);
        
        
        DecimalFormat df = new DecimalFormat("####0.00");
        System.out.println("Value: kjn" + df.format(value));
        return (result);
    }
    
}
