
//Program- To implement Quick Sort using Java
import java.util.*;

class QuickSort {
    static int partition(int array[], int low, int high) {
        int pivot = array[high];

        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }

        }
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;
        return (i + 1);
    }

    void quickSort(int array[], int low, int high) {
        if (low < high) {
            int pi = partition(array, low, high);
            quickSort(array, low, pi - 1);
            quickSort(array, pi + 1, high);
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        QuickSort ob = new QuickSort();
        System.out.println("Enter number of value in array -");
        int size = s.nextInt();
        int array[] = new int[size];
        System.out.println("Enter elements in array-");
        for (int i = 0; i < size; i++)
            array[i] = s.nextInt();
        s.close();
        ob.quickSort(array, 0, size - 1);
        System.out.println("Sorted array-");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
// Enter number of value in array -
// 5
// Enter elements in array-
// 2
// 31
// 6
// 1
// 55
// Sorted array-
// 1 2 6 31 55