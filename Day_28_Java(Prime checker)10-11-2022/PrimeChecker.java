//Program- You are given a class Solution and its main method in the editor. Your task is to create a class Prime. 
//         The class Prime should contain a single method checkPrime.
// 		   The locked code in the editor will call the checkPrime method with one or more integer arguments. 
//         You should write the checkPrime method in such a way that the code prints only the prime numbers.

//Note: You may get a compile time error in this problem due to the statement below:
//      C br=new BufferedReader(new InputStreamReader(in));
//Input Format-
//   There are only five lines of input, each containing one integer.

// Output Format-
//   There will be only four lines of output. Each line contains only prime numbers depending upon the parameters passed to checkPrime method.
//   In case there is no prime number, then a blank line should be printed.
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;
import java.io.InputStream;
import static java.lang.System.in;										//imported System.in for BufferedReader object
class Prime{															//class Prime declared 
   public void checkPrime(int ... args){								//checkPrime method created with(int ... ) as parameter
        for(int arg: args){												//used if with int arg variable to take parameters value one by one
            BigInteger i = BigInteger.valueOf(arg);						//i declared as big int so that big level of numbers can printed
            if(i.isProbablePrime(1)){						//tell if this BigInteger is probably prime or not
                System.out.printf("%s ",i);						//printing the prime integers upto that number args
            }
        }
        System.out.println();
    }
}
public class PrimeChecker {

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
// Sample Input-
   // 2
   // 1
   // 3
   // 4
   // 5

// Sample Output-
   // 2 
   // 2 
   // 2 3 
   // 2 3 5 
