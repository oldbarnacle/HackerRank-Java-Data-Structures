import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    
    Scanner scan = new Scanner(System.in);
    List<Integer> list = new ArrayList<Integer>();
    int N = scan.nextInt(); // length of integers
        for(int i=0; i<N; i++){
            list.add(scan.nextInt()); // List of integers
        }
        int Q = scan.nextInt(); // No. of queries
        for(int j=0; j<Q; j++){
            
            switch (scan.next()){
                case "Insert":
                    int x = scan.nextInt();
                    int y = scan.nextInt();
                    list.add(x,y);
                    break; // break is optional
                
                case "Delete":
                    int z = scan.nextInt();
                    list.remove(z);
                    break; // break is optional
                
                default: 
                    System.out.println("Invalid value"); 
                
            }
            /*if(scan.next().equals("Insert")){
                int x = scan.nextInt();
                //System.out.println(x);
                int y = scan.nextInt();
                list.add(x, y); // 5, 23
            }
            else if(scan.next().equals("Delete")){
                int x = scan.nextInt();
                System.out.println(x);
                list.remove(x); // 0
            }*/
            // print out updated list 
        }
            for (int s : list) {
                System.out.print(s + " ");
            }

    }
    
}

