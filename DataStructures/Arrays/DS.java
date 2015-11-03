import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
             String a = in.nextLine();
             String s = in.nextLine();
        
        
            String[] parts = s.split(" ");
        
            for (int i =0; i < parts.length; i++)
                System.out.print(parts[parts.length - i - 1] + " ");
        

        
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}