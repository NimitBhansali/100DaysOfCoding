// Program - Given a string,s, matching the regular expression [A-Za-z !,?._'@]+, split the string into tokens.
//           We define a token to be one or more consecutive English alphabetic letters. Then, print the number of tokens, followed by each token on a new line.

// its simple program from hacker rank --- LETS SOLVE IT

//Input Format  
    //A single string s
//Constraints- 
    // 1 <= Lenght of s <= 4 * 10^5
    // s is composed of any of the following: English alphabetic letters, blank spaces, exclamation points (!), commas (,)-
    // -question marks (?), periods (.), underscores (_), apostrophes ('), and at symbols (@).
//output Explanation-
    //On the first line, print an integer,n , denoting the number of tokens in string s(they do not need to be unique).
    //Next, print each of the n tokens on a new line in the same order as they appear in input string s.
//So I have some test casses like 
    //if the length of string is 0 or less- we have to print 0.
    //in some test cases has leading or trailing space will cause error in array formation
    //We can also go for empty string check but compiler does not take empty space or values as input.

import java.io.*;
import java.util.*;
public class StringToken {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        s.trim();                       //had to trim because of leading and trailing spaces as it will have array made of spaces delimeter
        scan.close();
        if (s.length() > 0) {
            String strarr[] = s.split("[ !,?._'@]+");   //making an array strarr with strings stored in s with predefined delimetres                       
            System.out.println(strarr.length);

            for (int i = 0; i < strarr.length; i++) {
            System.out.println(strarr[i]);        // printing elements of strarr array 
            }
        }
        else {
            System.out.println("0");            
        }
    }
}
//Sample input 1
// s=  He is a very very good boy, isn't he?
//Sample output 1
//     10
//     He
//     is
//     a
//     very
//     very
//     good
//     boy
//     isn
//     t
//     he

//Sample input 2
// s- Hel!o m?y name is .not yours,
//Sample output 2
//   8
//   Hel
//   o
//   m
//   y
//   name
//   is
//   not
//   yours
