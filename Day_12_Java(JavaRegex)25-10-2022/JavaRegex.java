//Program- Write a class called MyRegex which will contain a string pattern. You need to write a regular expression and assign it to the pattern such that it can be used to validate an IP address. Use the following definition of an IP address:
//IP address is a string in the form "A.B.C.D", where the value of A, B, C, and D may range from 0 to 255.
//  - Leading zeros are allowed. The length of A, B, C, or D can't be greater than 3.
// its simple program from hacker rank --- LETS SOLVE IT

//Input Format  
    // In this problem you will be provided strings containing any combination of ASCII characters. 
    // -You have to write a regular expression to find the valid IPs.
//Constraints- 
 //Invalid IPs-
    //000.12.234.23.23
    //666.666.23.23
    //.213.123.23.32
    //23.45.22.32.
    //I.Am.not.an.ip

//output Explanation-
    //For each test case, print True if the syntax of the given IP is correct. Otherwise, print False.
//NO test Cases as it will take a string value and can be integer.

import java.util.regex.Matcher; 
import java.util.regex.Pattern;
import java.util.Scanner;

class JavaRegex{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);            
        while(in.hasNext()){                     //loop goes on until input is entered
            String IP = in.next();                            
            System.out.println(IP.matches(new MyRegex().pattern));      // String IP is matched with obj made(with pattern)
        }
    }
}
class MyRegex{       
    String reg= "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])"; //string pattern format is given to reg variable.
    String pattern = reg+ "\\."+reg+ "\\."+reg+ "\\."+reg;  //pattern is given exact syntax of IP with dots.
    Pattern p = Pattern.compile(reg);                       //compile function is called with reg which gives output in true and false.
}
//Sample input 1
  // 000.12.12.034
  // 121.234.12.12
  // 23.45.12.56
  // 00.12.123.123123.123
  // 122.23
  // Hello.IP
//Sample output 1
// true
// true
// true
// false
// false
// false
