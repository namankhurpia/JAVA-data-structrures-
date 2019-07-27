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
public class microsoft_quest_3 {
    
    public static void main(String[] args) {
        
        Scanner kb=new Scanner(System.in);
        String str=kb.next();
        int count=1;
        for(int i=0;i<str.length();i++)
        {
            count=1;
            for(int j=i;j<str.length()-1;j++)
            {
                if(str.charAt(j) == str.charAt(j+1))
                {
                    i=i+1;
                    count=count+1;
                }
                else
                {
                    break;
                }
                
            }
            System.out.print(str.charAt(i));
            System.out.print(count);
            
            
        }
        
        
        
    }
    
}
