// Program- Using Regex, we can easily match or search for patterns in a text. Before searching for a pattern, we have to specify one using some well-defined syntax.
//          In this problem, you are given a pattern. You have to check whether the syntax of the given pattern is valid.

// its simple program from hacker rank --- LETS SOLVE IT

//Input Format  
    // The first line of input contains an integer N,
    // denoting the number of test cases. The next N lines contain a string of any printable characters representing the pattern of a regex.
//Constraints- 
    // There should be some kind of pattern incorrection for the Invalid output and vice versa.

//output Explanation-
    //For each test case, print Valid if the syntax of the given pattern is correct. Otherwise, print Invalid. Do not print the quotes.
//So I have some test casses like-
    // That num value will be more than 0 for loop to work.
    // Also some cases may have right pattern then try block helps.
import java.util.Scanner;
import java.util.regex.*;                     //importing regex class to use Pattern..

public class PatternCheck{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int num = Integer.parseInt(in.nextLine());        //taking input for number of patterns to check
		while(num>0){                                      // loop will only execute til num not = 0
			String pattern = in.nextLine();                    // taking string(pattern) as input 
          	//Write your code
              try{                                                              
                  Pattern check = Pattern.compile(pattern);     // checking if line has any errors or not
                  System.out.println("Valid");                  // only runs if upper line has no error
               }
               catch(Exception e){                              
                  System.out.println("Invalid");                // if exception is throwed from try block catch block catches it
               }           
              num--;
		}
        in.close();
	}
}
//Sample input 1
// num= 3
// ([A-Z])(.+)
// [AZ[a-z](a-z)
// batcatpat(nat

//Sample output 1
//   Valid
//   Invalid
//   Invalid 

//Sample input 2
// num = 3
// [[oj]kkj{:jdj}]
// lo[ss]
// {{[ddf}

//Sample output 2
//   Valid
//   Valid
//   Invalid
