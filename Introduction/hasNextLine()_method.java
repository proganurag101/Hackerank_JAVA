Problem: Take input  and "return" the number of lines and print them.


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       String s1;
       Scanner sc = new Scanner(System.in); //it takes the entire string as input.
       int i=1; //counter
       while(sc.hasNextLine()){  //The hasNextLine() method returns true if and only if this scanner has another line of input.
           s1 = sc.nextLine();
           System.out.println(i+" "+s1);
           i++;
       }
    
        
        
        
    }
}
