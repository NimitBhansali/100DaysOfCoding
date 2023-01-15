//Program- To Print the total count of numbers which are unique between two range of numbers.
import java.util.*;
public class UniqueNumber{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter range of numbers to check into- ");
        int low=sc.nextInt();
        int upper=sc.nextInt();
        sc.close();
        int count=0;
        int temp,t1;
        for(int i=low;i<=upper;i++){
            temp=i/10;
            t1=i%10;
            if(t1==temp){
                continue;
            }
            else{
                count++;
            }
        }
        System.out.println("Total Different digits in the given range of number- "+count);
    }
}
//Sample Output-
// Enter range of numbers to check into- 
// 10
// 15
// Total Different digits in the given range of number- 5