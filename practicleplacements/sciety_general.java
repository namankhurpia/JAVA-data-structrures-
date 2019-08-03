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
public class sciety_general {
    public static void main(String[] args) {
        
        Scanner kb=new Scanner(System.in);
        int num=kb.nextInt();
        String np=num+"";
        int co=0,ce=0;
        int temp=0;
        char c='a';
        for(int i=0;i<np.length();i++)
        {
            c=np.charAt(i);
            temp=Integer.parseInt(c+"");
            if(temp%2==0)
            {
                ce=ce+1;
            }
            else
            {
                co=co+1;
            }
            
        }
        System.out.println("even is "+ce);
        System.out.println("odd is " +co);
        
    }
    
}
