package Thecodeworld;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class A81_SameMatrix {
	
	
	public static void printMatrix(int M[][],int rowSize,int colSize) {
		for(int i=0;i<rowSize;i++) {
			for(int j=0;j<colSize;j++) 
				System.out.print(M[i][j]+" ");
				System.out.println();
			
	}
	}
	

	public static int areSame(int A[][],int B[][]){
		for(int i=0;i<A.length;i++) {
			for(int j=0;j<B.length;j++) 
				if(A[i][j]!=B[i][j])
					return 0;
				return 1;
			
		}
		return 0;
	}
		
	

	public static void areSame1(int A[][],int B[][]){
		
				if(Arrays.deepEquals(A, B))  
					System.out.println("Matrices are equal:");
				
				else 
					System.out.println("Matrices are  not equal:");
				
	
		
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
			System.out.println("Matrix A");
			printMatrix(A,size,size);
			
			System.out.println("Matrix B");
			printMatrix(B,size,size);
			//areSame(A,B);
			
			if(areSame(A,B)==1)
				System.out.println("Matrices are equal:");
			else
				System.out.println("Matrices are not equal:");
				
		
			
			
		
			}

		}


