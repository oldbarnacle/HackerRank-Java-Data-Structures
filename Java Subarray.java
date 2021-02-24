import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int arrInt = Integer.parseInt(scan.nextLine());
        int[] intArray = new int[arrInt];
        
        // Loop through the array
        for(int i=0; i<intArray.length; i++){
            intArray[i] = scan.nextInt();
            //System.out.println(intArray[a]);
        }
            int count = 0;
             
            for(int j=0; j<intArray.length; j++){
                int sum = 0;
                // Print subarray between current starting
                // and ending points
                for (int k=j; k<intArray.length; k++){
                    sum+=intArray[k];
                    if(sum<0){
                        count++;
                        };
                    }
            }
        System.out.println(count);
    }
}
