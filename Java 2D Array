import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];
        for (int i = 0; i < 6; i++){
            for (int j = 0;  j < 6; j++)
            {
                arr[i][j] = scanner.nextInt();
            }
        }
        scanner.close();
        System.out.println(maxHourGlass(arr));
    }
    public static int maxHourGlass(int [][] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j ++) {
                int sum = findSum(arr,i ,j);
                max = Math.max(max, sum);
        }
    }
    return max;
}
private static int findSum(int [][] arr, int r, int c){
    int sum = arr[r+0][c+0] + arr[r+0][c+1] + arr[r+0][c+2] 
                            + arr[r+1][c+1] 
            + arr[r+2][c+0] + arr[r+2][c+1] + arr[r+2][c+2];
    return sum;
}
}
