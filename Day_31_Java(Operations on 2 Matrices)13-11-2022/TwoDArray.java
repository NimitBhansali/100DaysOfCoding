//Program - To Find Addition , Subtraction and Multiplication of 2 matrices with every input of size and elements with Dynamic inputs
//          and checking if addition, subtraction and multiplication is possible or not.
//Constraints- For addition and subtraction Order of n*m should be equal to n1*m1
//             For Multiplication n*m and n1*m1 should have m equal to n1.

import java.util.*;
public class TwoDArray{           
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i,j;
		System.out.println("Enter 1nd matrix rows- ");
		int n = sc.nextInt();
		System.out.println("Enter 1nd matrix Columns- ");
		int m= sc.nextInt();
		System.out.println("Enter 2nd matrix rows- ");
		int n1 = sc.nextInt();
		System.out.println("Enter 2nd matrix Columns- ");
		int m1= sc.nextInt();
		System.out.println("Enter Elements of First matrix-  ");
		int array[][]= new int[n][m];
		for( i=0;i<n;i++){
			for( j=0;j<m;j++){
				array[i][j] = sc.nextInt(); 
			}
		}
		
		System.out.println("Enter Elements of Second matrix-  ");
		int array1[][]= new int[n1][m1];
		for( i=0;i<n1;i++){
			for( j=0;j<m1;j++){
				array1[i][j] = sc.nextInt(); 
			}
		}
		System.out.println("Elements of the 1st Matrix are: ");   
        for (i = 0; i < n; i++){   
             for (j = 0; j < m; j++)   
                System.out.print(array[i][j] + " ");   
             System.out.println();   
        }  
		System.out.println("Elements of the 2nd Matrix are: ");   
        for (i = 0; i < n1; i++){   
             for (j = 0; j < m1; j++)   
                System.out.print(array1[i][j] + " ");   
             System.out.println();   
        }
		//Addition of two matrix
		if (n==n1 && m==m1){  
		    System.out.println(" After Addition of 2 matrix- ");   
            for (i = 0; i < n; i++){
              for (j = 0; j < m; j++)  
                System.out.print(array[i][j] + array1[i][j] + " ");   
             System.out.println();   
            }   
	    }
		else
			System.out.println("Addition is not possible for different order Matrix- ");
		System.out.println();
		//subtraction of two matrix
		if (n==n1 && m==m1){  
		    System.out.println("After Subtraction of 2 matrix- ");   
            for (i = 0; i < n; i++){
              for (j = 0; j < m; j++)  
                System.out.print(array[i][j] - array1[i][j] + " ");   
             System.out.println();   
            }   
	    }
		else
			System.out.println("Subtraction is not possible for different order Matrix- ");
		System.out.println();
		//Multiplication of two matrix
		if(n1==m){
			System.out.println("After Multiplication of 2 matrix- ");
		    int c[][]=new int[n][m1];  //n rows and m1 columns  
            for( i=0;i<n;i++){    
                for( j=0;j<m1;j++){    
                  c[i][j]=0;      
			      for(int k=0;k<n1;k++){      
					 c[i][j]+=array[i][k]*array1[k][j];      
                  }//end of k loop  
			      System.out.print(c[i][j]+" ");  //printing matrix element  
                }//end of j loop  
                System.out.println();//new line    
            }    
		}
		else
			System.out.println("Multiplication is not possible for columns is not equal to rows - ");
	}
}