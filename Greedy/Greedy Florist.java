import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the getMinimumCost function below.
    static int getMinimumCost(int k, int[] c) {
        
        
        // Sort the array
        Arrays.sort(c);
        
        // in Desc Order
        reverse(c);
        
        int cost = 0;
        
        for (int i = 0 ; i < c.length ; i++)
        {
            cost += (c[i] * (i / k + 1)); 
        }
        
        return cost;
        

    }
    
    public static void reverse(int [] arr)
    {
        int start = 0 , end = arr.length - 1;
        
        while (start < end)
        {
            int temp = arr[start];
            arr[start ++ ] = arr[end];
            arr[end --] = temp;
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[] c = new int[n];

        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        int minimumCost = getMinimumCost(k, c);

        bufferedWriter.write(String.valueOf(minimumCost));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
