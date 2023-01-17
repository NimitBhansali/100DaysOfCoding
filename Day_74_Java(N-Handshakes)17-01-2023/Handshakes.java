//Program- n persons sitting on a round table. Any person can do a handshake with any other person. 
//         In how many ways these n people can make handshakes so that no two handshakes crosses each other.
import java.util.*;
public class Handshakes{
    static int handshake(int n){
        if(n==0)
            return 1;
        if(n==1)
            return 0;
        int ways=0;
        for(int i=2;i<n+1;i++){
            ways += handshake(i-2) * handshake(n-i);
        }
        return ways;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter even number of people sitting - ");
        int n=sc.nextInt();
        sc.close();
        System.out.println(n+" people will handshake "+handshake(n)+" times.");
    }
}
//Sample Output-
// Enter even number of people sitting- 
// 14
// 14 people will handshake 429 times.