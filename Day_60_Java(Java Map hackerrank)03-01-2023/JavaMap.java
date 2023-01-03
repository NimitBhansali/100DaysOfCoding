//Program: You are given a phone book that consists of people's names and their phone number.
//         After that you will be given some person's name as query. For each query, print the phone number of that person.

// Input Format:
//The first line will have an integer  denoting the number of entries in the phone book. Each entry consists of two lines: a name and the corresponding phone number.
// After these, there will be some queries. Each query will contain a person's name. Read the queries until end-of-file.

// Constraints:
// A person's name consists of only lower-case English letters and it may be in the format 'first-name last-name' or in the format 'first-name'. Each phone number has exactly 8 digits without any leading zeros.

// Output Format
// For each case, print "Not found" if the person has no entry in the phone book. Otherwise, print the person's name and phone number. See sample output for the exact format.
// To make the problem easier, we provided a portion of the code in the editor. You can either complete that code or write completely on your own.

import java.util.*;

class JavaMap{
    public static void main(String []argh) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<String, Integer> hashmaping = new HashMap<>();
        sc.nextLine(); //InputMismatchException error will come because need to tell java about next inputs to be string.
        for(int i=1; i<=n; i++) {
            String name=sc.nextLine();
            int phone=sc.nextInt();
            hashmaping.put(name, phone);
            sc.nextLine();   
        }
        while(sc.hasNext())
        {
            String s = sc.nextLine();
            if(hashmaping.containsKey(s)) {//containskey is used to match with string
                System.out.println(s+"="+hashmaping.get(s)); // get() returns the object that contains the value associated with the key.
            } else {
                System.out.println("Not found");
            }
        }
        sc.close();
        
    }
}
// Sample Input:
// 3
// uncle sam
// 99912222
// tom
// 11122222
// harry
// 12299933
// uncle sam
// uncle tom
// harry

// Sample Output:
// uncle sam=99912222
// Not found
// harry=12299933