//Program- Given a positive integer N and a prime p, the task is to print the largest power of prime p that divides N!. 
//         Here N! means the factorial of N = 1 x 2 x 3 . . (N-1) x N.
// Input:
// N = 5 , p = 2
// Output:
// 3
// Explanation:
// 5! = 120. The highest x for which 2x
// divides 120 is 3, as 120%8 = 0.
// So, the Output is 3.
import java.util.*;

public class LargestPowerPrime{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any positive integer ");
        int N=sc.nextInt();
        System.out.println("Enter any prime number- ");
        int P=sc.nextInt();
        int sum=0;
        while(N>0){
            N=N/P;
            sum+=N;
        }
        System.out.println("The largest power of prime number "+P+" is "+sum);
        sc.close();
    }
}
//Sample Output-
// Enter any positive integer 
// 5
// Enter any prime number- 
// 2
// The largest power of prime number 2 is 3