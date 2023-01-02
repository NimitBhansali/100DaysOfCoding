//Program: Let's play a game on an array! You're standing at index 0 of an n-element array named game. 
//From some index i (where 0 <i<n), you can perform one of the following moves:

//  Move Backward:
// If cell - 1 exists and contains a 0, you can walk back to cell i - 1

//  Move Forward:
// If cell i + 1 contains a zero, you can walk to cell i + 1.
// If cell i+leap contains a zero, you can jump to cell i + leap.
// If you're standing in cell n -1 or the value of i + leap >n, you can walk or jump off the end of the array and win the game.
// In other words, you can move from index i to index i + 1, i-1, or i + leap as long as the destination index is a cell containing a 0. If the destination index is greater than n-1, you win the game

// Input Format:
// The first line contains an integer, q, denoting the number of queries (i.e., function calls).

// The 2.q subsequent lines describe each query over two lines:

// 1. The first line contains two space-separated integers describing the respective values of n and leap.

// 2. The second line contains n space-separated binary integers (i.e., zeroes and ones) describing the respective values of gameo, game1,. ..., gamen-1.

// Constraints:
//  1 <q <= 5000
//  2 <= n <= 100 0
//  0 <= leap <= 100
//  It is guaranteed that the value of game [0] is always 0.
import java.util.*;

public class Java1DArray {

   
        public static boolean yes(Set<Integer> target,Integer leap, Integer n){
        for (Integer i : target) {
            if(i+1 >= n || i + leap >= n)
                return true;
        }
        return false;
         }

    public static boolean canWin(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.
        int size = game.length;
        ArrayList<Integer> indices = new ArrayList<>();
        for(int i=0;i<size; i++) {
            if(game[i] == 0 ){
                indices.add(i);
            }
        }

        Set<Integer> source = new HashSet<>();
        Set<Integer> target = new HashSet<>();
        Set<Integer> know = new HashSet<>();
        source.add(0);
        do{
            if(yes(source,leap,size)){
                return true;
            }
            for (Integer i : source) {
                if( !know.contains(i-1) && indices.contains(i-1)){
                    target.add(i-1);
                }
                if( !know.contains(i+1) && indices.contains(i+1)){
                    target.add(i+1);
                }
                if( !know.contains(i+leap) && indices.contains(i+leap)){
                    target.add(i+leap);
                }
                know.add(i);
            }
            if(know.containsAll(target)){
                return false;
            }
            source = new HashSet<>(target);
            
        }while(!yes(target,leap,size));
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}
// Sample Input

// STDIN           Function
// -----           --------
// 4               q = 4 (number of queries)
// 5 3             game[] size n = 5, leap = 3 (first query)
// 0 0 0 0 0       game = [0, 0, 0, 0, 0]
// 6 5             game[] size n = 6, leap = 5 (second query)
// 0 0 0 1 1 1     . . .
// 6 3
// 0 0 1 1 1 0
// 3 1
// 0 1 0

// Sample Output

// YES
// YES
// NO
// NO