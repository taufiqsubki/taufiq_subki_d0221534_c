package Taufik;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class day9_Java_End_of_file {
   
    public static void main(String[] args) {
        int k = 1;
       Scanner sc = new Scanner(System.in);
       while(sc.hasNext()){//Deteksi EOF
           String s = sc.nextLine();
           System.out.println(k+" "+s);
           k++;
       }
    } 
}
