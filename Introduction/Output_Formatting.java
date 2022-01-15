import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int    x=sc.nextInt();
                //Complete this line
                System.out.printf("%-15s%03d\n",s1,x);
                //%s =string,%d=Integer,%n=nextline
                //% 03 d = always print 3 digits
                //%-15s = -15 is to justify the strings left(-) .
                
                
                
            }
            System.out.println("================================");

    }
}


