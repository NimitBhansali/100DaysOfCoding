//Program- In this problem, you have to add and multiply huge numbers!
//         These numbers are so big that you can't contain them in any ordinary data types like a long integer.
//         Use the power of Java's BigInteger class and solve this problem
// its simple program from hacker rank --- LETS SOLVE IT

//Input Format  
  //  There will be two lines containing two numbers A and B.
//Constraints-  A and B are non-negative integers and can have maximum  digits.

//output Explanation-
    // Output two lines. The first line should contain A+B, and the second line should contain A*B. Don't print any leading zeros.
// test Cases- length of A and B should be less then 100.
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class bigInteger {

    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    BigInteger A = in.nextBigInteger();   
    BigInteger B = in.nextBigInteger();
    if(A.compareTo(B) <=100 && B.compareTo(A)<=100){
       System.out.println(A.add(B));
       System.out.println(A.multiply(B));
    }
    in.close();
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
//Sample input 1
  // 1234
  // 20
//Sample output 1
 //  1254             **(1234 + 20)
//   24680            **(1234 * 20) 

//Sample input 2
  // 12
  // 2
//Sample output 2
 //  14             **(12 + 2)
//   24            **(12 * 2) 
  