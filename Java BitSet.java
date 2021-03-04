import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt(); // length of integers
        int M = scan.nextInt(); // number of operations
        BitSet bits1 = new BitSet(N);
        BitSet bits2 = new BitSet(N);
        //System.out.println(bits1.cardinality( ));
        
        for(int i=0;i<M;i++){
            String operations = scan.next();
            int x = scan.nextInt();
            int y = scan.nextInt();
            
            switch (operations){
                case "AND":
                    if(x==1){bits1.and(bits2);}else{bits2.and(bits1);}
                    break; // break is optional
                    
                case "OR":
                    if(x==1){bits1.or(bits2);}else{bits2.or(bits1);}
                    break; // break is optional
                    
                case "XOR":
                    if(x==1){bits1.xor(bits2);}else{bits2.xor(bits1);}
                    break;
                    
                case "FLIP":
                    if(x==1){bits1.flip(y);}else{bits2.flip(y);}
                    break; // break is optional
                    
                case "SET":
                    if(x==1){bits1.set(y);}else{bits2.set(y);}
                    break; // break is optional   
            }
            System.out.println(bits1.cardinality()+" "+bits2.cardinality());

        }     
    }
}
