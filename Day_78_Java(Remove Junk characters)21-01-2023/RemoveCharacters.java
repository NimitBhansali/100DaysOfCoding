//Program- To enter a String and remove all the junk/special characters in that String.
import java.util.*;
public class RemoveCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = sc.nextLine();
        sc.close();
        s = s.replaceAll("[^a-zA-Z0-9 /s]","");
        System.out.println("New String After Removing : \n"+s);
    }
}
//Sample Output-
// Enter a String: 
// how @are u
// New String After Removing : 
// how are u

