//Program - To implement Merge Sort with java
import java.util.*;
public class MergeSort{
    public static void conquer(int a[],int si, int mid,int ei){
        int merged[]=new int[ei-si+1];
        int index1=si;
        int index2=mid+1;
        int i=0;
        while(index1<=mid && index2<=ei){
            if(a[index1]<=a[index2]){
                merged[i++]=a[index1++];
            }
            else{
                merged[i++]=a[index2++];
            }
        }
        while(index1<=mid){
            merged[i++]=a[index1++];
        }
        while(index2<=ei){
            merged[i++]=a[index2++];
        }
        for(int j=0,k=si;j<merged.length;j++,k++){
            a[k]=merged[j];
        }
    }
    public static void divide(int a[], int si, int ei){
        if(si>=ei){
            return;
        }
        int mid=si+(ei-si)/2;
        divide(a, si, mid);
        divide(a, mid+1, ei);
        conquer(a, si, mid, ei);
    }
    
    public static void printArray(int arr[])
	{
		int n = arr.length;
		for (int i=0; i<n; ++i)
			System.out.print(arr[i]+" ");
		System.out.println();
	}
    public static void main(String args[])
	{
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number of elements in array-");
        int n=sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter elements in array-");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }   
        divide(a, 0, n-1);
        System.out.println("Sorted array-");
        printArray(a);
    }  
}
// Enter number of elements in array-
// 5
// Enter elements in array-
// 2
// 32
// 1
// 4
// 33
//Sorted Array
// 1 2 4 32 33