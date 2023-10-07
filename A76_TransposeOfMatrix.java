package Thecodeworld;

import java.util.Scanner;

public class A76_TransposeOfMatrix {
	
	public static void printMatrix(int M[][],int rowsize,int colsize) {
		for(int i=0;i<rowsize;i++) {
			for(int j=0;j<colsize;j++) 
			System.out.print(M[i][j]+" ");
			System.out.println();
			
		}
	}
	public static int [][] trans(int matrix[][],int size1,int size2){
		   // transpose matrix using Arrays class
        int[][] transpose = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) 
            for (int j = 0; j < matrix[i].length; j++) 
                transpose[j][i] = matrix[i][j];
                
                
		return transpose;
		
	}
	
	public static int [][] trans1(int matrix[][],int size1){
	
		 for (int  i = 0; i < size1; i++) {
	            for ( int j = i+1; j < size1; j++) { 
	                int temp = matrix[i][j];
		            matrix[i][j]= matrix[j][i];
		            matrix[j][i]=temp;
	            }
		 }
	      return matrix;          
		
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
		}
		
		System.out.println("Matrix :");
		printMatrix(matrix,size,size);
		
		int transpose[][]=trans(matrix,size,size);
		trans1(matrix, size);
		System.out.println("\nresultant Matrix:");
	   //printMatrix(matrix,size,size);
		
		printMatrix(transpose,size,size);
		

     


    }
}





