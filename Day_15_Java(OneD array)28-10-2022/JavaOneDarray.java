// Program- The code in your editor does the following:
        //Reads an integer from stdin and saves it to a variable, n, denoting some number of integers.
        //Reads n  integers corresponding to a0,a1,a2...an-1 from stdin and saves each integer ai to a variable, val.
        //Attempts to print each element of an array of integers named a.

// its simple program from hacker rank --- LETS SOLVE IT

//Input Format  
  //   The first line contains a single integer,n , denoting the size of the array.    
  //   Each line i of the n subsequent lines contains a single integer denoting the value of element ai.
//Constraints-  A and B are non-negative integers and can have maximum  digits.

//output Explanation-
    // You are not responsible for printing any output to stdout. Locked code in the editor loops through array a and prints each sequential element on a new line.
// test Cases- value of val should be integer as the array is of integer type.

import java.util.*;
public class JavaOneDarray {

    public static void main(String[] args) {
	   
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();                            //takes n for size of array
        int a[]=new int[n];                                //declare the array a of n size
        for(int val=0; val<n;val++){            
            a[val]=scan.nextInt();                         // assigning values of a[0],a[1],...a[n-1] through user input val variable
        }
        scan.close();

        // Prints each sequential element in array a
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);                      // printing values of a[0],a[1],...a[n-1] through i variable.
        }
    }
}
//Sample input 1
  // 5                 **value of n
  // 10
  // 20
  // 30
  // 40
  // 50
//Sample output 1
  // 10
  // 20
  // 30
  // 40
  // 50
//Sample input 2
  // 3                  **value of n
  // 21
  // 22
//Sample output 2
  // 21
  // 22  
