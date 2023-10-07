package Thecodeworld;

import java.util.Scanner;

public class A85_SumOfRowCol {


	//method 1
	
	public static void rowSum(int a[][],int n) {
		
		int sum=0;
		
		//sum of rows
		System.out.println("finding each row:");
		
		for(int i=0;i<n;i++) {
			
			for(int j=0;j<n;j++) {
				
				sum=sum+a[i][j];
			}
			
			System.out.println("sum of the row "+ i+ "="+sum);
			
			sum=0;
		}
		
	}
	
	public static void colSum(int a[][],int n) {
		
		int sum=0;
		
		//sum of cols
		
		System.out.println("finding each col:");
		
		for(int i=0;i<n;i++) {
			
			for(int j=0;j<n;j++) {
				
				sum=sum+a[j][i];
			}
			System.out.println("sum of the col "+ i+ "="+sum);
			
			sum=0;
		}
		
	}
	//method 2;
	static void sumOfRow(int a[][],int n) {
		
		int sum=0;
		
		  for (int i = 0; i < n; ++i) {
			  
	            for (int j = 0; j < n; ++j) {
	            	
	                sum = sum + a[i][j] ;
	            }
	     
	            System.out.print("The Sum of the " + i + " position row is = " + sum + "\n");
	            
	            sum = 0; 
	        }
	}
	
	static void sumOfCol(int a[][],int n) {
		
		int sum=0;
		
		 for (int j = 0; j < n; ++j) {
			 
	            for (int i = 0; i < n; ++i) {
	            	
	                sum = sum + a[i][j];
	            }
	     
	            System.out.print("The Sum of the " + j + " position column is = " + sum + "\n");
	            
	            sum = 0;
	        }
	    }
	
	
	

	public static void main(String[] args) {

		Scanner in=new Scanner(System.in);
		
		System.out.println("enter the size of the matrix:");
		
		int size=in.nextInt();
		
		System.out.println("enter  the matrix A:");
		
		int A[][]=new int[size][size];
		
		for(int i=0;i<size;i++) {
			
			for(int j=0;j<size;j++) {
				
				A[i][j]=in.nextInt();	
			}
			System.out.println();
		}
		
		//rowSum(A,size);
		//colSum(A,size);
		
		sumOfRow(A,size);
		sumOfCol(A,size);
		
		

	}

}
/*public class MatrixSumExample {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        // display original matrix
        System.out.println("Original matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // calculate row and column sums using nested loops
        int[] rowSums = new int[matrix.length];
        int[] colSums = new int[matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                rowSums[i] += matrix[i][j];
                colSums[j] += matrix[i][j];
            }
        }

        // display row sums
        System.out.println("Row sums:");
        for (int i = 0; i < rowSums.length; i++) {
            System.out.print(rowSums[i] + " ");
        }
        System.out.println();

        // display column sums
        System.out.println("Column sums:");
        for (int i = 0; i < colSums.length; i++) {
            System.out.print(colSums[i] + " ");
        }
        System.out.println();
    }
}

 */
