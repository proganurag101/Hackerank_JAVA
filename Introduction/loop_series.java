





a=5
b=3
n=5
i.e a+2^j*b
5+1*3=8
5+1*3+2*3=14
5+1*3+2*3+4*3=26

  





import java.util.*;
import java.io.*;
class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            for(int j=0;j<n;j++){
                a += b*Math.pow(2,j);
                System.out.print(a+" ");
            }
            System.out.println();
        }
        
        in.close();
        
            
        }
        
        
    }

