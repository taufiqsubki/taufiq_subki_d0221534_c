import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
package taufiq;


public class day6_java_loops_I {
    public static void main(String[] args) throws IOException {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            int N = Integer.parseInt(bufferedReader.readLine().trim());
            for(int i =1;i<=10;i++){
                int result = N * i;
                System.out.println(N+" x "+i+" = "+result);
                
            }
        }
    }
}
