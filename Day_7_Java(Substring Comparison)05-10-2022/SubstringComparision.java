// Program to Given a string,s , and an integer,k , complete the function so that it-
// -finds the lexicographically smallest and largest substrings of length k.
// its simple program from hacker rank ---LETS SOLVE IT

//Function Description
   // getSmallestAndLargest has the following parameters:
   // string s: a string
   // int k: the length of the substrings to find
//  Return statement requirement- 
        // string: the string ' + "\n" + '  where and are the two substrings
// Input Format 
    //The first line contains a string denoting s.
   //The second line contains an integer denoting k.
//Constraints-
    // 1<=s<=1000 and s should have Alphabets only as input
// output Explanation-
  // We then return the first (lexicographically smallest) substring and
  // the last (lexicographically largest) substring as two newline-separated values (i.e., ava\nwel).
// So I have take some test casses like
    // That K value should not be more then String length
    //We can also go for empty string but compiler does not take empty space or values as input


  import java.util.Scanner;

public class SubstringComparision {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        smallest = s.substring(0,k);
        for (int i = 0; i <= s.length() - k; i++) {   //loop is used to compare each time the k number of letters
            if (s.substring(i, i + k).compareTo(largest) >= 0) { //The result is zero if the strings are equal 
                largest = s.substring(i, i + k);
                
            } else if (s.substring(i, i + k).compareTo(smallest) < 0) { //The result is a negative integer if this String object lexicographically precedes the argument string
                smallest = s.substring(i, i + k);
            }
        }   
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
        if(k>s.length()){                       
            System.out.println("Invalid length of the substrings to find ");
        }
        else
           System.out.println(getSmallestAndLargest(s, k));  //passing the values to method
    }
}
//Sample Input 1
    //welcometojava =  s
    //3   =   k
//Sample Output 1
  //ava
  //wel

// Sample Input 2
   // HelloWorld 
   // 2
//Sample Output 2
   // He
   // rl
