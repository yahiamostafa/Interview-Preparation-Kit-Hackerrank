import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'isValid' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String isValid(String s) {
    // Write your code here
        int [] freq = new int[26];
        
        int max = 0;
        
        
        for (int i = 0 ; i < s.length() ; i++)
        {
            freq[s.charAt(i) - 'a']++;
            max = Math.max(max , freq[s.charAt(i) - 'a']);
        }
            
        int min = Integer.MAX_VALUE , differentFreq = 0 , maxFreq = 0;
                
        for (int i = 0 ; i < 26 ; i++)
        {
            if (freq[i] == max)
                maxFreq++;
            if (freq[i] != 0 && freq[i] != max){
                differentFreq++;
                min = Math.min(min , freq[i]);
            }
        }
        
      
        return (differentFreq <= 1 && max - min <= 1) || (maxFreq == 1 && max - min <= 1) || (differentFreq == 1 && min == 1) ? "YES" : "NO";
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.isValid(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
