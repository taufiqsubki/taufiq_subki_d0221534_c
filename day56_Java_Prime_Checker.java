package rascoding;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;
import static java.lang.System.in;
class Prime{
    public void checkPrime(int... arr){//2 1 3 4 5
        for(int i=0;i<arr.length;i++){
            if(arr[i]<2){
                
            }else if(arr[i]==2){
                System.out.print(arr[i]+" ");//2
            }
            else{
                int logic = 1;
                for(int j=2;j<arr[i];j++){
                    if(arr[i]%j==0){
                        logic = 0;
                        break;
                    }
                }
                if(logic==1){
                    System.out.print(arr[i]+" ");//3 5
                }
            }
        }
        System.out.println();
    }
}

public class day56_Java_Prime_Checker {

	public static void main(String[] args) {
		try{
		BufferedReader br=new BufferedReader(new InputStreamReader(in));
		int n1=Integer.parseInt(br.readLine());
		int n2=Integer.parseInt(br.readLine());
		int n3=Integer.parseInt(br.readLine());
		int n4=Integer.parseInt(br.readLine());
		int n5=Integer.parseInt(br.readLine());
		Prime ob=new Prime();
		ob.checkPrime(n1);
		ob.checkPrime(n1,n2);
		ob.checkPrime(n1,n2,n3);
		ob.checkPrime(n1,n2,n3,n4,n5);	
		Method[] methods=Prime.class.getDeclaredMethods();
		Set<String> set=new HashSet<>();
		boolean overload=false;
		for(int i=0;i<methods.length;i++)
		{
			if(set.contains(methods[i].getName()))
			{
				overload=true;
				break;
			}
			set.add(methods[i].getName());
			
		}
		if(overload)
		{
			throw new Exception("Overloading not allowed");
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
}

