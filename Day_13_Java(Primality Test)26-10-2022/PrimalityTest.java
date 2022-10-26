//Program- Given a large integer,n , use the Java BigInteger class' isProbablePrime method to determine and print whether it's prime or not prime.
//         A prime number is a natural number greater than  whose only positive divisors are  and itself. 
//         -For example, the first six prime numbers are 2 ,3 ,5 ,7 ,11 and 13 .
// its simple program from hacker rank --- LETS SOLVE IT

//Input Format  
    // A single line containing an integer,n (the number to be checked).
    // -You have to write a regular expression to find the valid IPs.

//Constraints-  n contains atmost 100 digits

//output Explanation-
     //If n is a prime number, print prime; otherwise, print not prime.
// test Cases- length of n should be less then 100.
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class PrimalityTest {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));  
        String n = bufferedReader.readLine();
        BigInteger checkprime = new BigInteger(n);      
        if(n.length()<=100 && checkprime.isProbablePrime(1)){ 
        //isProbablePrime----Returns true if this BigInteger is probably prime, false if it's definitely composite. If certainty is ≤ 0, true is returned.
            System.out.println("prime");
         }
        else{
        System.out.println("not prime");
        }
        bufferedReader.close();
    }
}
//Sample input 1
  // 13
//Sample output 1
 //  prime               **The only positive divisors of 13 are 1 and 13, so we print prime. 

//Sample input 2
  // 23545055151570050553051512012441
//Sample output 2
 //  prime               **The only positive divisors of 23545055151570050553051512012441 are 1 and n itself, so we print prime.

//Sample input 3
  // 15
//Sample output 3
 //  not prime               **The positive divisors of 15 are 1,3,5 and 15 itself, so we print not prime.
  
