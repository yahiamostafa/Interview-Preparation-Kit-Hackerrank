// https://www.hackerrank.com/challenges/ctci-making-anagrams Link




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
     * Complete the 'makeAnagram' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. STRING a
     *  2. STRING b
     */

    public static int makeAnagram(String a, String b) {
    // Write your code here
        int [] freq1 = new int [26];
        int [] freq2 = new int [26];
        
        for (int i = 0 ; i < a.length() ; i++)
            freq1[a.charAt(i) - 'a']++;
            
        for (int i = 0 ; i < b.length() ; i++)
            freq2[b.charAt(i) - 'a']++;
            
        int common = 0;
        
        for (int i = 0 ; i < 26 ; i++)
            common += Math.min(freq1[i] , freq2[i]);
        
        return a.length() + b.length() - common * 2;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String a = bufferedReader.readLine();

        String b = bufferedReader.readLine();

        int res = Result.makeAnagram(a, b);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
