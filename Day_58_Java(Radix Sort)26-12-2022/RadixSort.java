// Radix sort Java implementation
import java.io.*;
import java.util.*;

class RadixSort {
	static int getMax(int arr[], int n)
	{
		int mx = arr[0];
		for (int i = 1; i < n; i++)
			if (arr[i] > mx)
				mx = arr[i];
		return mx;
	}

	// A function to do counting sort of arr[] according to the digit represented by exp.
	static void countSort(int arr[], int n, int exp)
	{
		int output[] = new int[n]; // output array
		int i;
		int count[] = new int[10];
		Arrays.fill(count, 0);

		for (i = 0; i < n; i++)
			count[(arr[i] / exp) % 10]++;

		for (i = 1; i < 10; i++)
			count[i] += count[i - 1];

		for (i = n - 1; i >= 0; i--) {
			output[count[(arr[i] / exp) % 10] - 1] = arr[i];
			count[(arr[i] / exp) % 10]--;
		}

	
		for (i = 0; i < n; i++)
			arr[i] = output[i];
	}

	static void radixsort(int arr[], int n)
	{
		int m = getMax(arr, n);
		for (int exp = 1; m / exp > 0; exp *= 10)
			countSort(arr, n, exp);
	}
	static void print(int arr[], int n)
	{
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
	}

	public static void main(String[] args)
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
        System.out.println("Sorted array-");
		radixsort(a, n);
		print(a, n);
	}
}
// Enter number of elements in array-
// 7
// Enter elements in array-
// 221
// 432
// 534
// 765 
// 343
// 676
// 987
// Sorted array-
// 221 343 432 534 676 765 987