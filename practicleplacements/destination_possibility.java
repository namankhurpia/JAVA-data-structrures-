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
public class destination_possibility {
    public static void main(String[] args) {
        
        Scanner kb=new Scanner(System.in);
        int num=kb.nextInt();
        int arr[][]=new int[num][num];
        int sx=0,sy=0,dx=0,dy=0;
        for(int i=0;i<num;i++)
        {
            for(int j=0;j<num;j++)
            {
                arr[i][j]=kb.nextInt();
            }
        }
        
        
        
        for(int i=0;i<num;i++)
        {
            for(int j=0;j<num;j++)
            {
                if(arr[i][j]==1)
                {
                    sx=i;
                    sy=j;
                }
                else if(arr[i][j]==2)
                {
                    dx=i;
                    dy=j;
                }
            }
        }
        
        for(int i=sx;i<num;i++)
        {
            for(int j=sy;j<num;j++)
            {
                //findpath(i,j);
            }
        }
        
        
        
        
    }

   /* private static int[] findpath(int sx, int sy) {
            
        if(goleft(sx,sy))
        {
            
        }
    }
    
    public static boolean goleft(int sx,int sy)
    {
        //arr[sx-1][sy]
    }*/
    
}
