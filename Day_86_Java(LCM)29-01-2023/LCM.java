//Program:- To find LCM of given number
import java.util.*;
class LCM
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int i,p=1;
        System.out.println("LCM");
        for(i=2;n>1;i++)
        {
            while((n%i)==0)
            {
                p*=i;
                n/=i;
                System.out.println(" "+i);
            }
        }
    }
}

// INPUT :
// Enter a number
// 72

// OUTPUT:
// LCM
// 2
// 2
// 2
// 3
// 3
