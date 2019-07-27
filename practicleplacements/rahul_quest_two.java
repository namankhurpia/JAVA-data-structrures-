package practicleplacements;
import java.util.*;
import java.util.Map.*;
/**
 *
 * @author Naman Khurpia
 */
// find number of trailing 1s
public class rahul_quest_two {
    public static void main(String[] args) 
    {
        
        Scanner kb=new Scanner(System.in);
        String num=kb.next();
        char arr[]=num.toCharArray();
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]);
        }
        Stack s=new Stack();
        
        for(int i=1;i<arr.length-1;i++)
        {
            
            if(arr[i]=='1')
            {
                if(arr[i-1]=='1' || arr[i+1]=='1')
                {
                    s.push(1);
                }
            }
            
        }
        if(arr[0]=='1' && arr[1]=='1')
        {
            s.push(1);
        }
        if( arr[arr.length-2] == '1' && arr[arr.length-1] == '1' )
        {
            s.push(1);
        }
        System.out.println("\n");
        System.out.println("count of 1 is"+s.size());
        System.out.println("stack is "+s);
        
        
    }
    
}
