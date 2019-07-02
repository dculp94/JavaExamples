import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];

    // Reading the array in via Scanner
        for(int i=0; i < 6; i++)
        {
            for(int j=0; j < 6; j++)
            {
                arr[i][j] = in.nextInt();
            }
        }
        Calls the sum method to determine what the sum of the hourglass
        Sum(arr);
        }

        
    
    private static void Sum(int arr[][]) 
    {
        // Large negative sum for test cases
        int sum = -100;
        for (int i =0; i < 4; i++)
        {
            for (int j=0; j<4; j++)
            {
                int top = arr[i][j]+arr[i][j+1]+arr[i][j+2];
                int mid = arr[i+1][j+1];
                int bot = arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
                // Checks every hourglass position to see if largest sum of previous.
                if (top+mid+bot>sum)
                {
                    sum = top+mid+bot;
                }
            }
        }
        System.out.println(sum);
    }
}
