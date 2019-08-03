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
public class anmol_quest_3_new {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();
        
        String alpha[] = {"a","b","c"};
        int num[] = {A,B,C};
        
        for(int i=0;i<2;i++){
            int temp=0;
            String temp1 = "";
            for(int j=i+1;j<3;j++){
                if(num[j]>num[i]){
                    temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                    
                    temp1 = alpha[i];
                    alpha[i] = alpha[j];
                    alpha[j] = temp1;
                    
                }
            }
            
        }
        /*for(int i=0;i<3;i++){
            System.out.println(num[i]);
            System.out.println(alpha[i]);
        }*/
        
        String maxstr = alpha[0];
        String medstr = alpha[1];
        String minstr = alpha[2];
        int max = num[0];
        int med = num[1];
        int min = num[2];
        System.out.println("max is "+max +" "+maxstr);
        System.out.println("med is "+med +" "+medstr);
        System.out.println("min is "+min +" "+minstr);
        
        ArrayList<String> array=new ArrayList<String>();
        if(max>med+min+1)
        {
            for(int i=0;i<max;i=i+2)
        {
            array.add(maxstr);
            array.add(maxstr);
            if(med !=0)
            {
                array.add(medstr);
                med = med-1;
            }
            else
            {
                
                if(min !=0)
                {
                        array.add(minstr);
                        min = min-1;
                }
                else
                {
                    break;
                }
            }
             
        }
        
        
        }
        else
        {
        for(int i=max+med+min;i>0;i=i-1)
        {
            if(max!=0)
            {
                array.add(maxstr);
                max = max-1;
                
            }
            if(max!=0)
            {
                array.add(maxstr);
                max = max-1;
                
            }
            
            if(med !=0)
            {
                array.add(medstr);
                med = med-1;
                continue ;
            }
            
                
            if(min !=0)
            {
                array.add(minstr);
                min = min-1;
                continue ;
            }
                
        }
        }
             
        
             
        
        
        System.out.println(array);
        
        
    }
    
    
    /*for(int i=0;i<max; i=i+2)
        {
            array.add(maxstr);
            max = max-1;
            if(max!=0)
            {
                array.add(maxstr);
                max = max-1;
            }
            if(med !=0)
            {
                array.add(medstr);
                med = med-1;
            }
            else
            {
                if(min !=0)
                {
                    array.add(minstr);
                    min= min-1;
                }
            }
            
        }
        
        System.out.println(array);
*/
}
