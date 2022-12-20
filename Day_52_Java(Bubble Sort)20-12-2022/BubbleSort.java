//program for implementation of Bubble Sort
import java.util.Scanner;
public class BubbleSort {  
        static void printing(int a[]) //function to print array elements  
    {  
        int n = a.length;  
        int i;  
        for (i = 0; i < n; i++)  
        {  
            System.out.print(a[i] + " ");  
        }         
    }  
    static void bubbleSort (int a[])    // function to implement bubble sort  
    {  
        int n = a.length;  
        int i, j, temp;  
        for (i = 0; i < n; i++)  
        {  
            for (j = i + 1; j < n; j++)  
            {  
                if (a[j] < a[i])  
                {  
                    temp = a[i];  
                    a[i] = a[j];  
                    a[j] = temp;  
                }  
            }  
        }  
    }  
    public static void main(String[] args) {  
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number of elements in array-");
        int n=sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter elements in array-");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }     
        BubbleSort b1 = new BubbleSort();  
        System.out.println("Before sorting array elements are - ");    
        b1.printing(a);  
        b1.bubbleSort(a);  
        System.out.println();  
        System.out.println("After sorting array elements are - ");    
        b1.printing(a);  
        sc.close();
            
    }    
}  
//Sample Output-
// Enter number of elements in array-
// 5
// Enter elements in array-
// 22
// 1 
// 2
// 55
// 3
// Before sorting array elements are - 
// 22 1 2 55 3
// After sorting array elements are -
// 1 2 3 22 55