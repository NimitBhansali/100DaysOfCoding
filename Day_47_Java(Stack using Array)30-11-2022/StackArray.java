//program- to implement stack using array.
import java.util.Scanner;
public class StackArray{
    int arr[];
    int top;
    int size;

    StackArray(int n){
        arr=new int[n];
        size=n;
        top=-1;
    }
    void push(int a){
        if (top==size-1) {
            System.out.println("Overflow");
            return;
        }
        arr[++top]=a;
        System.out.println(a+" Inserted at top");
    }
    void pop(){
        if(top==-1){
            System.out.println("Underflow");
            return;
        }
        System.out.println(arr[top]+" Deleted from top");
        arr[top--]=0;
    }
    void traverse(){
        if (top==-1) {
            System.out.println("Underflow");
            return;
        }
        System.out.println("Elements in stack-");
        for (int i = top; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of the stack-");
        int n=sc.nextInt();
        StackArray s=new StackArray(n);
        int flag=0;
            while(flag==0){
                System.out.println("1.Push");
                System.out.println("2.Pop");
                System.out.println("3.Traverse");
                System.out.println("4.Exit");
                int ch=sc.nextInt();
                switch (ch) {
                    case 1:
                        System.out.println("Enter the element to be inserted-");
                        s.push(sc.nextInt());
                        break;
                    case 2:
                        s.pop();
                        break;
                    case 3:
                        s.traverse();
                        break;
                    case 4:
                        flag=1;
                        break;
                    default:System.out.println("Wrong Input!!");
                        break;
                } 
            }  
    }
}