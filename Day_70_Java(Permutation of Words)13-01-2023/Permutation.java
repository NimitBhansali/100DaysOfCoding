//Program- To find all possible combinations of the given string
import java.util.*;

public class Permutation {
    public static String swap(String a, int i, int j) {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }

    static void permute(String str, int l, int r) {
        if (l == r)
            System.out.println(str);
        else {
            for (int i = l; i <= r; i++) {
                str = swap(str, l, i);
                permute(str, l + 1, r);
                str = swap(str, l, i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter word for all possible combinations-");
        String str = sc.next();
        int n = str.length();
        System.out.println("All possible combinations-");
        permute(str, 0, n - 1);
        sc.close();
    }
}
//Sample Output-
// Enter word for all possible combinations-
// java
// All possible combinations-
// java
// jaav
// jvaa
// jvaa
// java
// jaav
// ajva
// ajav
// avja
// avaj
// aavj
// aajv
// vaja
// vaaj
// vjaa
// vjaa
// vaja
// vaaj
// aavj
// aajv
// avaj
// avja
// ajva
// ajav