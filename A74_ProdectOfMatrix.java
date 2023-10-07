package Thecodeworld;
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
public class A74_ProdectOfMatrix {
	
	public static void PrintMatrix(int M[][],int rowSize,int colSize) {
		for(int i=0;i<rowSize;i++) {
			for(int j=0;j<colSize;j++) 
			System.out.print(M[i][j]+" ");
			System.out.println();
			
		}
	}
	//method 1
	public static int [][] Protect(int A[][],int B[][],int size){
		int C[][]=new int[size][size];
		for(int i=0;i<size;i++) 
			for(int j=0;j<size;j++) 
				C[i][j]+=A[i][j]*B[i][j];
			return C;
		
	}
	// method 2
	public static int[][] Protect1(int A[][],int B[][]) {
		 int[][] resultMatrix = new int[A.length][A[0].length];
	     for (int i = 0; i < A.length; i++) { 
	        resultMatrix[i] = Arrays.copyOf(A[i], A[i].length);{
	      
			for (int j = 0; j <A[i].length; j++) 
	             resultMatrix[i][j] +=A[i][j]*B[i][j];
	        }
	     }
	     
		return resultMatrix;
		
				
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
		}
		
		System.out.println("enter  the matrix B:");
		int B[][]=new int[size][size];
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				B[i][j]=in.nextInt();	
			}
		}
		System.out.println("Matrix A:");
		PrintMatrix(A,size,size);
		
	System.out.println("Matrix B:");
	PrintMatrix(B,size,size);
	
	int C[][]= Protect(A,B,size);
	System.out.println("\nresultant Matrix:");
	PrintMatrix(C,size,size);
	
		

	}

}
/*e: Program to Multiply Two Matrices
public class MultiplyMatrices {

    public static void main(String[] args) {
        int r1 = 2, c1 = 3;
        int r2 = 3, c2 = 2;
        int[][] firstMatrix = { {3, -2, 5}, {3, 0, 4} };
        int[][] secondMatrix = { {2, 3}, {-9, 0}, {0, 4} };

        // Mutliplying Two matrices
        int[][] product = new int[r1][c2];
        for(int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    product[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
                }
            }
        }

        // Displaying the result
        System.out.println("Multiplication of two matrices is: ");
        for(int[] row : product) {
            for (int column : row) {
                System.out.print(column + "    ");
            }
            System.out.println();
        }
    }
}
 */
