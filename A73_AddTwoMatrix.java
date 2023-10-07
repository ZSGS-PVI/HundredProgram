package Thecodeworld;
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
public class A73_AddTwoMatrix {
	
	public static void printMatrix(int M[][],int rowSize,int colSize) {
		for(int i=0;i<rowSize;i++) {
			for(int j=0;j<colSize;j++) 
				System.out.print(M[i][j]+" ");
				System.out.println();
			
	}
	}
	//method 1
	
public static int[][] add(int A[][],int B[][],int size) {
			int C[][]=new int[size][size];
			for(int i=0;i<size;i++) 
				for(int j=0;j<size;j++) 
					C[i][j]=A[i][j]+B[i][j];
			          
			return C;
						
}
// method 2		
public static int[][] add1(int A[][],int B[][]) {
	 int[][] resultMatrix = new int[A.length][A[0].length];
     for (int i = 0; i < A.length; i++) {
         resultMatrix[i] = Arrays.copyOf(A[i], A[i].length);
         for (int j = 0; j <A[i].length; j++) {
             resultMatrix[i][j] +=B[i][j];
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
		printMatrix(A,size,size);
		
	System.out.println("Matrix B:");
	printMatrix(B,size,size);
	
	int C[][]=add1(A,B);
	System.out.println("\n Resultant Matrix:");
	printMatrix(C,size,size);
		}

	}




