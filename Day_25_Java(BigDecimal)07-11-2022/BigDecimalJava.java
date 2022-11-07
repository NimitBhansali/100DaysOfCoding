// Given an array,s , of n real number strings, sort them in descending order — but wait,
//  there's more! Each number must be printed in the exact same format as it was read from stdin,meaning that .1 is printed as .1,
// and 0.1 is printed as 0.1. If two numbers represent numerically equivalent values (e.g., .1≡0.1 ), then they must be listed in the same order as they were received as input).
// Complete the code in the unlocked section of the editor below. You must rearrange array s's elements according to the instructions above.
// Input Format-
//    The first line consists of a single integer,n , denoting the number of integer strings.
//    Each line i of the n subsequent lines contains a real number denoting the value of si.
// Constraints-    1<=n<=200 and Each si has at most 300 digits.
// Output Format-
//    Locked stub code in the editor will print the contents of array s to stdout. You are only responsible for reordering the array's elements.
import java.math.BigDecimal;
import java.util.*;
class BigDecimalJava{

    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();                    //size of array taken             
        String []s=new String[n+2];            //String array created with extra 2 string then array
        for(int i=0;i<n;i++){                    
            s[i]=sc.next();                       //taking input for string array 
        }
      	sc.close();
        for(int j = n-1; j>0;j--) {                 //startng the outer loop from last of array
            for (int i = 0; i < j; i++) {           //inner loop starts with 0 to till j value
              BigDecimal curr = new BigDecimal(s[i]);       //curr object points at i th index element of string array 
              BigDecimal currNext = new BigDecimal(s[i+1]);  //currNext object points at next element of string array where 
                if (curr.compareTo(currNext) < 0) {     //value will  be negative if curr is smaller then currNext 
                     String temp = s[i];                //swapping of the currnext value with curr
                     s[i] = s[i+1];
                     s[i+1] = temp;
                }
            }
        }               
        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);         //printing the sorted array          
        }
    }
}
//Sample Input-
  // 9
  // -100
  // 50
  // 0
  // 56.6
  // 90
  // 0.12
  // .12
  // 02.34
  // 000.000

//Sample Output-
  // 90
  // 56.6
  // 50
  // 02.34
  // 0.12
  // .12
  // 0
  // 000.000
  // -100