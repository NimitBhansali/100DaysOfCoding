//Program- To implement family game.
//input 1 as - Number of persons
//input 2 as - lyrics of music (with only x and y as lyrics)
//To do- Eliminate people pass at time with y as lyrics and when x is lyrics pass next. 
import java.util.*;

public class FamilyGame {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of people playing.");
        int N = sc.nextInt();
        System.out.println("Enter lyrics of music(only x and y).");
        String lyrics = sc.next();
        sc.close();
        boolean b[] = new boolean[N];
        for (int k = 0; k < N; k++) {
            b[k] = true;
        }
        int count = 0, x = 0, i = 0;
        while (count < b.length - 1) {
            if (b[x] == true) {
                if (lyrics.charAt(i) == 'y') {
                    b[x] = false;
                    count++;
                }
                i++;
            }
            x++;
            if (i == lyrics.length()) {
                i = 0;
            }
            if (x >= b.length) {
                x = 0;
            }
        }
        for (int a = 0; a < b.length; a++) {
            if (b[a] == true) {
                System.out.println("Winner is person no.= " + (a + 1));
                break;
            }
        }

    }
}
// Sample Output-
// Enter Number of people playing.
// 3
// Enter lyrics of music(only x and y).
// xyx
// Winner is person no.= 1