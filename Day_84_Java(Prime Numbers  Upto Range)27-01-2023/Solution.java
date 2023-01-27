//Program- To implement a prime number printer upto a specific range N which shows Time Complexity O(n(log(logn))).
import java.util.*;
public class Solution {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        boolean[] b=new boolean[n+1];
        for(int i=0;i<=n;i++){
            b[i]=true;
        }
        for(int i=2; i*i<=n;i++)
            if(b[i]==true)
                for(int j=i*i; j<=n;j=j+i)
                    b[j]=false;
        for(int i=1;i<=n;i++){
            if(b[i]==true)
                System.out.print(i+" ");
        }
    }
}
