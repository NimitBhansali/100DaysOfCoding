//Program- You are given n lines. In each line there are zero or more integers. 
//         You need to answer a few queries where you need to tell the number located in yth position of xth line.
//         Take your input from System.in.
// Input Format-
//      The first line has an integer n. In each of the next n lines there will be an integer d denoting number of integers on that line and then there will be d space-separated integers.
//      In the next line there will be an integer q denoting number of queries. Each query will consist of two integers x and y.
//Constraint-
//      1<=n<=20000 and 0<=d<=50000 and 1<=q<=1000 and 1<=x<=n  
//      Each number will fit in signed integer. Total number of integers in n lines will not cross 10^5.
// Output Format-
//      In each line, output the number located in yth position of xth line. If there is no such position, just print "ERROR!"
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ArrayListJava {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner sc =new Scanner(System.in);      
        int n=sc.nextInt();
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();                 //arraylist created with name list
        for(int i=0;i<n;i++)
        {
            int x=sc.nextInt();                                               //number of element in 1 st list of main list
            ArrayList<Integer> sublist=new ArrayList<>();
            for(int j=0;j<x;j++)                           
            {
                sublist.add(sc.nextInt());                          //taking input for inner list 
            }
            list.add(sublist);                                       //adding inner list to outer list
        }
        int query=sc.nextInt();                                     // taking number of queries to ask
        for(int i=0;i<query;i++)
        {
            int query1=sc.nextInt();                                   //it stores line number of list
            int query2=sc.nextInt();                                   //it stores index of list on q1 line
            if(query1>n || query2>list.get(query1-1).size()){          //condition for error
                System.out.println("ERROR!");
            }else{
                System.out.println(list.get(query1-1).get(query2-1));  //no error and prints the element at that index
            }
                        
        }
    }
}
// Sample Input-
  // 5
  // 5 41 77 74 22 44
  // 1 12
  // 4 37 34 36 52
  // 0
  // 3 20 22 33
  // 5
  // 1 3
  // 3 4
  // 3 1
  // 4 3
  // 5 5

// Sample Output-
  // 74
  // 52
  // 37
  // ERROR!
  // ERROR!
