//Program- Given a list, L, of N integers, perform Q queries on the list. Once all queries are completed, 
//         print the modified list as a single line of space-separated integers.

//Input Format-
//   The first line contains an integer, N(the initial number of elements in L ).
//   The second line contains N space-separated integers describing L.
//   The third line contains an integer, Q (the number of queries).
//   The 2Q subsequent lines describe the queries, and each query is described over two lines:
  // --If the first line of a query contains the String Insert, then the second line contains two space separated integers x y, and the value y must be inserted into L at index x.
  // --If the first line of a query contains the String Delete, then the second line contains index x, whose element must be deleted from L.

//Constraints-:   1<=N<=4000 && 1<=Q<=4000 && Each element in is a 32-bit integer.

//Output Format-
//   Print the updated list  as a single line of space-separated integers.

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ListHackerRank {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        ArrayList<Integer> arr = new ArrayList<>();         //array list (arr)declared
        for(int i=0;i<n;i++){   
            int ele = sc.nextInt();                         //taken input 
            arr.add(ele);                                   //added the input to array list
        }
        int q=sc.nextInt();                                 //how many functional input to take
        for(int i=0;i<q;i++){
            String input = sc.next();                      //taking insert and delete as string
            input=input.toLowerCase();
            if(input.equals("Insert")){          //checking if insert is writen into input variable
                int index=sc.nextInt();                    //index to insert at
                int ele=sc.nextInt();                      //value to insert at 
                arr.add(index,ele);                       //added to specific index
            }

            if (input.equals("Delete")){        //checking if delete is writen into input variable
                int index=sc.nextInt();                   //index to delete at
                arr.remove(index);                       //removed the element 
            }
        }
        sc.close();
        for(Integer a:arr){
            System.out.print(a + " ");                      //printed the array list elements
        }
     
    }
}

// Sample Input-
  // 5
  // 12 0 1 78 12
  // 2
  // Insert
  // 5 23
  // Delete
  // 0

// Sample Output-
  // 0 1 78 12 23
    
