//program for implementation of Selection Sort
import java.util.Scanner;
class SelectionSort
{
	void sort(int arr[])
	{
		int n = arr.length;
		for (int i = 0; i < n-1; i++)
		{
			// Find the minimum element in unsorted array
			int min_idx = i;
			for (int j = i+1; j < n; j++)
				if (arr[j] < arr[min_idx])
					min_idx = j;
			// Swap the founded minimum element with the first index
			int temp = arr[min_idx];
			arr[min_idx] = arr[i];
			arr[i] = temp;
		}
	}

	// Print the array
	void printArray(int arr[])
	{
		int n = arr.length;
		for (int i=0; i<n; ++i)
			System.out.print(arr[i]+" ");
		System.out.println();
	}

	// Driver code to test above
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
		SelectionSort ob = new SelectionSort();
        System.out.println("Before sorting array elements are - ");
        ob.printArray(a);
		ob.sort(a);
		System.out.println("Sorted array-");
		ob.printArray(a);
        sc.close();
	}
}
//Sample Output-
// Enter number of elements in array-
// 4
// Enter elements in array-
// 22
// 1
// 8
// 5
// Before sorting array elements are - 
// 22 1 8 5
// Sorted array-
// 1 5 8 22
