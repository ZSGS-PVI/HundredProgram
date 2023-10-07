package Thecodeworld;

// Determine whether a given matrix is a identity matrix

import java.util.Scanner;

public class A79_IdentityMatrix {
	
	static void identity(int c[][],int row,int col) {
		
		boolean flag=true;
	   
		if(row!=col) {
			
			System.out.println("Matrix should be a square matrix:");
		}

		else {
			
			for(int i=0;i<row;i++) {
				
				for(int j=0;j<col;j++) {
					
					if(i==j && c[i][j]!=1) {
						
						flag =false;
						
						break;
					}
					/*
					if(i!=j && c[i][j]!=0) {
						flag=false;
						break;
					}
					*/
								
				}
			}
			if(flag)
				System.out.println("Given matrix is an identity matrix:");
			else
				System.out.println("Given matrix is not an identity matrix:");
		
	}
	}
	
	static void identity1(int c[][],int row,int col) {
		
		boolean flag=true;
		   
		if(row!=col) {
			
			System.out.println("Matrix should be a square matrix:");
		}

		else {
			
			for(int i=0;i<row;i++) {
				
				for(int j=0;j<col;j++) {
					
					if(i!=j && c[i][j]!=0) {
						
						flag=false;
						
						break;
					}				
				}
			}
			if(flag)
				System.out.println("Given matrix is an identity matrix:");
			else
				System.out.println("Given matrix is not an identity matrix:");
		
	}
	}
	
	
	public static void main(String[] args) {
	
	boolean flag=true;
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
	
	System.out.println("Matrix :");
	//printMatrix(matrix,size,size);
	
	identity(matrix,size,size);

	
	}
	
		
}

