//Program To implement Heap Sort using Java
import java.util.Scanner;

public class HeapSort {
	public void sort(int arr[])
	{
		int size = arr.length;

		// Build heap (rearrange array)
		for (int i = size / 2 - 1; i >= 0; i--)
			heapify(arr, size, i);

		// One by one extract an element from heap
		for (int i = size - 1; i > 0; i--) {
			// Move current root to end
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;
            //new heapify called for new tree
			heapify(arr, i, 0);
		}
	}

	void heapify(int arr[], int N, int i)
	{
		int largest = i; // Initialize largest as root
		int l = 2 * i + 1; // left
		int r = 2 * i + 2; // right

		if (l < N && arr[l] > arr[largest])
			largest = l;

		if (r < N && arr[r] > arr[largest])
			largest = r;

		// If largest is not root
		if (largest != i) {
			int swap = arr[i];
			arr[i] = arr[largest];
			arr[largest] = swap;

			// Recursively heapify the affected sub-tree
			heapify(arr, N, largest);
		}
	}

	/* A utility function to print array of size n */
	static void printArray(int arr[])
	{
		int N = arr.length;

		for (int i = 0; i < N; ++i)
			System.out.print(arr[i] + " ");
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
        sc.close();
		// Function call
		HeapSort ob = new HeapSort();
        System.out.println("Before Sorting array is");
		printArray(a);

		ob.sort(a);

		System.out.println("Sorted array is");
		printArray(a);
	}
}
//Sample Output-
// Enter number of elements in array-
// 5
// Enter elements in array-
// 22
// 1
// 6
// 23
// 9
// Before Sorting array is
// 22 1 6 23 9
// Sorted array is
// 1 6 9 22 23