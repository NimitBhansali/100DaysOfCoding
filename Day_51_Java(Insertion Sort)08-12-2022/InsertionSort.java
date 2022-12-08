//Program- To implement Insertion Sort 
import java.util.Scanner;
public class InsertionSort{
	//Method of insertion sort
	void insertSort(int arr[],int n)
	{
		for (int i = 1; i < n; i++) {
			int key = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
	}

	//-------------- to print array of size n-----------
	static void printArray(int arr[],int n)
	{
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");

		System.out.println();
	}
	public static void main(String args[])
	{
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Size of array-");
        int n=sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter elements in array-");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }     
		InsertionSort is = new InsertionSort();
        System.out.println("Array Before sorting-");
        printArray(a,n);
		is.insertSort(a,n);  //sending array in method
        System.out.println("Array After sorting-");
		printArray(a,n);  
        sc.close();
	}
}
//Sample Output--

// Enter Size of array-
// 5
// Enter elements in array-
// 11
// 9
// 2
// 5
// 66
// Array Before sorting-
// 11 9 2 5 66 
// Array After sorting-
// 2 5 9 11 66 