//Program- Write the following code in your editor below:
//         A class named Arithmetic with a method named add that takes 2 integers as parameters and returns an integer denoting their sum.
//         A class named Adder that inherits from a superclass named Arithmetic.
//Constraints---  Your classes should not be public .
//Input Format
//   You are not responsible for reading any input from stdin;
//   a locked code stub will test your submission by calling the add method on an Adder object and passing it 2 integer parameters.
//Output Format
//   You are not responsible for printing anything to stdout. Your add method must return the sum of its parameters.
         // its simple program from hacker rank --- LETS SOLVE IT
//No test cases just had to build a class named Arithmetic and Adder with some method.

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//Write your code here  
class Arithmetic{   
    int add(int a,int b){                                  //int type method with 2 parameters so that it returns int value 
        return a+b;                                        // adding 2 integer and returning it
    }
}
class Adder extends Arithmetic{    }                       //Adder class created and extends Arithmetic class without any body 
public class InheritanceSecondPart{
    public static void main(String []args){
        // Create a new Adder object
        Adder a = new Adder();                              //Adder Class object(a) created
        
        // Print the name of the superclass on a new line
        System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());	    //using a object to get class name and printing it
        
        // Print the result of 3 calls to Adder's `add(int,int)` method as 3 space-separated integers:
        System.out.print(a.add(10,32) + " " + a.add(10,3) + " " + a.add(10,10) + "\n");    
                                            //using object of adder class to access method of arithmetic class and printing output
     }
}
// Sample Output    
//    My superclass is: Arithmetic
//    42 13 20