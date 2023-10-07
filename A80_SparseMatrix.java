package Thecodeworld;

import java.util.Scanner;

public class A80_SparseMatrix {
	
	static void sparse(int a[][],int row,int col) {
		int count=0;
		int rows=a.length;
		int cols=a[0].length;
		int size=rows*cols;
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				if(a[i][j]==0)
					count++;
					
			}
		}
		if(count>(size/2))
			System.out.println("Given matrix is an sparse matrix");
		else
			System.out.println("Given matrix is not an sparse matrix");

		
	}

	
	static void sparse1(int a[][],int row,int col) {
		int count=0;
		int rows=a.length;
		int cols=a[0].length;
		int size=rows*cols;
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				if(a[i][j]!=0)
					count++;
					
			}
		}
		if(count<(size/2))
			System.out.println("Given matrix is an sparse matrix");
		else
			System.out.println("Given matrix is not an sparse matrix");

		
	}

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		System.out.println("enter the size of the matrix:");
		int size=in.nextInt();
		System.out.println("enter  the matrix B:");
		int matrix[][]=new int[size][size];
				
		
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				matrix[i][j]=in.nextInt();	
			}
			System.out.println();
		}
		System.out.println("the matrix:");


        sparse1(matrix,size,size);






}
}
