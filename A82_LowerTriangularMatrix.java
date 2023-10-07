package Thecodeworld;

import java.util.Scanner;

public class A82_LowerTriangularMatrix {
	//method 1
	public static void lowerTriangleMat(int A[][]) {
		int row=A.length;
		int col=A.length;
		if(row!=col) {
			System.out.println("Matrix should be a square matrix:");
		}
		
else {   
    for(int i = 0; i < row; i++){    
        for(int j = 0; j < col; j++){    
          if(j > i)    
            System.out.print("0 ");    
          else    
            System.out.print(A[i][j] + " ");    
      }    
      System.out.println();    
  } 
}
	}
  // method 2
		public static void lowerTriangleMat1(int A[][]) {
			
			int row=A.length;
			int col=A.length;
			if(row!=col) {
				System.out.println("Matrix should be a square matrix:");
			}
		
		else {
			for(int i=0;i<row;i++) {
				for(int j=0;j<col;j++) {
					if(i<j) {
						A[i][j]=0;
					}
				}
			}
			System.out.println("Lower Triangular Matrix is;");
			for(int i=0;i<row;i++)
			{
				for(int j=0;j<col;j++) {
				
					System.out.print(A[i][j]+" ");
				
			}
			System.out.println();
		}
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
		lowerTriangleMat(A);
	}
}
		

	



