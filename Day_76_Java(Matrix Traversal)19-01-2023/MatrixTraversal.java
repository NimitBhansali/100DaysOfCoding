// Java program to Print all possible paths from top left to bottom right of a mXn matrix
import java.util.*;
public class MatrixTraversal
{
    private static void printMatrix(int mat[][], int m, int n,
                                    int i, int j, List<Integer> list)
    {
          //return if i or j crosses matrix size
        if(i > m || j > n)
            return;
        list.add(mat[i][j]);
        if(i == m && j == n){
            System.out.println(list);
        }
        printMatrix(mat, m, n, i+1, j, list);
        printMatrix(mat, m, n, i, j+1, list);
        list.remove(list.size()-1);
         
         
    }
     
    // Driver code
    public static void main(String[] args)
    {
        int m = 3;
        int n = 3;
        int mat[][] = { { 1, 2, 3 },
                        { 4, 5, 6 } ,
                        { 7, 8, 9 }};
          List<Integer> list = new ArrayList<>();
          System.out.println("Paths of Matrix ");
        printMatrix(mat, m-1, n-1, 0, 0, list);
    }
}
//Sample Output-
// Paths of Matrix 
// [1, 4, 7, 8, 9]
// [1, 4, 5, 8, 9]
// [1, 4, 5, 6, 9]
// [1, 2, 5, 8, 9]
// [1, 2, 5, 6, 9]
// [1, 2, 3, 6, 9]