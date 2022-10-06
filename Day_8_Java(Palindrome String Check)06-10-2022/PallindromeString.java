// Program - Given a string A, print Yes if it is a palindrome, print No otherwise.
// its simple program from hacker rank ---LETS SOLVE IT
//Palindrome-  A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.

// Input Format 
    //The String which contains at most 50 lower case english letters.
//Constraints-
    // Input Should be in lower case
// output Explanation-
  //if the string is palindrome Print Yes otherwise No
// So I have some test casses like
    //if the there is only a letter in the string then tell the user that has string has only one Letter so its palindrome.
    //We can also go for empty string check but compiler does not take empty space or values as input.
    //Converting the string to lower case so that compiler doesnot treat 'A' and 'a' differently.


import java.io.*;
import java.util.*;

public class PallindromeString {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter String to check- ");
        String A=sc.next();            //took string into A
        sc.close();
        
        /* Enter your code here. Print output to STDOUT. */
        String reverse = "";
        if(A.length()==1){             
            System.out.println("As the string has only one Letter so its palindrome");
        }
        else{
           A= A.toLowerCase();                     //converted every letter to lower case 
           for (int i = 0; i < A.length(); i++) {
             char c = A.charAt(i);               //c gets each letter from string with help of loop
             reverse = c + reverse;               // c gets stored with concating reverse string 
           } 
           if(reverse.compareTo(A)==0)            //compareTo function return 0 only when the two strings are equal
             System.out.println("Yes");
           else    
             System.out.println("No");
        }
    }
}

//Sample input 1
//    Hello
//Sample output 1
//    No

//Sample input 2
//    Madam
//Sample output 2
//    Yes


//Sample input 3
//    a
//Sample output 3
//    As string has only one Letter so its palindrome

//Sample input 4
//    AAA
//Sample output 4
//    Yes
