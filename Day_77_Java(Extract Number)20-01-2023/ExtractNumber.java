//Program- To implement a program to extract numbers from a String.
import java.util.*;

public class ExtractNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string.");
        String str = sc.nextLine();
        int len = str.length();
        int k = 0;
        int temp = 0;
        String a = "";
        sc.close();
        String arr[] = new String[len * (len + 1) / 2];
        for (int i = 0; i < len; i++) {
            a = "";
            if (i == k) {
                for (int j = i; j < len; j++) {
                    if (Character.isDigit(str.charAt(j))) {
                        a += str.charAt(j);
                        k = j;
                    } else {
                        break;
                    }
                }
                k++;
            }
            if (a != "") {
                arr[temp] = a;
                temp++;
            }
        }
        System.out.println("NUMBERS are: ");
        for (int i = 0; i < temp; i++) {
            System.out.println(arr[i]);
        }
    }
}
// Sample Output-
// Enter a string.
// HELLO JAVA 28 885 y74

// NUMBERS are:
// 28
// 885
// 74