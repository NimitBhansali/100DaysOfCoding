//Program- Given an array of n integers, find and print its number of negative subarrays on a new line.
//         A subarray of an n-element array is an array composed from a contiguous block of the original array's elements. For example, if array=[1,2,3] ,
//         then the subarrays are [1],[2],[3] ,[1,2] ,[2,3] and[1,2,3]. 
//         Something like [1,3] would not be a subarray as it's not a contiguous subsection of the original array.
//         The sum of an array is the total sum of its elements.
//         1. An array's sum is negative if the total sum of its elements is negative.
//         2. An array's sum is positive if the total sum of its elements is positive.   
//Input format-
//  The first line contains a single integer,n , denoting the length of array A=[a0,a1,a2...an-1].
//  The second line contains n space-separated integers describing each respective element,ai, in array A .
//Constraints-  1<=n<=100  and  (-10^4)<=ai<=(10^4)
//Output Format
//  Print the number of subarrays of A having negative sums.
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SubArray {
    public static void main(String[] args) {
        /* Enter your codeA here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();                    //taken size of array in n variable
        int arr[]=new int[n];                    //array arr[] is created with size n
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();                //given value of array elements
        }
        sc.close();
        int sum=0,count=0;                                      
        for(int i=0;i<n;i++){                       
            for(int j=i;j<n;j++){
                sum=sum+arr[j];                     //sum of all elements from j to less than n
                if(sum<0){                          //counter of negative subarray is incremented
                    count++;
                }
            }
        sum=0;                                  //sum made zero cause we have to use it again in next sub array
        }
        System.out.println(count);
    }
}
// Sample Input
   // 5
   // 1 -2 4 -5 1

// Sample Output
   // 9