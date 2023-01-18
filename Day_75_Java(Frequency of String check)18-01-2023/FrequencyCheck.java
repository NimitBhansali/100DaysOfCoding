//Program- To Count frequencies of occurance of each letter in String given as input. 
import java.util.*;
public class FrequencyCheck {
     static void check(String a)
    {
        int f=0;
        int le=a.length();
        a.toLowerCase();
        for(char i='a';i<='z';i++)
        {
        for(int j=0;j<le;j++)
        {
            if(i==a.charAt(j))
            f++;
        }
        if(f!=0)
        System.out.println("frequency of "+i+" is:"+f);
        f=0;
    }
}
    String frequency(String a)
    {String rev="";
       for(int i=a.length()-1;i>=0;i--)
       {
        rev+=a.charAt(i);
       } 
       if(rev.compareTo(a)==0)
       return a;
       else
       return "";
    }

    static void printPermutn(String str, String ans)
    {
        permutations_GAME ob=new permutations_GAME();
        String st=" ";
        // If string is empty
        if (str.length() == 0) {
            
            st=ob.frequency(ans);
            if(st!="")
            System.out.println(st+ " ");
            return;
        }
 
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            String ros = str.substring(0, i) +
                        str.substring(i + 1);
            printPermutn(ros, ans + ch);
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String s =sc.nextLine();
        sc.close();
        printPermutn(s, "");
        check(s);
    }
}
//Sample Output-
// Enter a string
// HelloJava

// frequency of a is:2
// frequency of e is:1
// frequency of l is:2
// frequency of o is:1
// frequency of v is:1
