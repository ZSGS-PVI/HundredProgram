package Thecodeworld;

import java.util.Scanner;

public class A84_OddEvenFrequency {
	
	public static void findfre(int arr[][],int size) {
		
		int even=0,odd=0;
		
		for(int i=0;i<size;i++) {
			
			for(int j=0;j<size;j++) {
				
				if((arr[i][j]&1) !=1) {
					
					
					even++;
				}
				else {
					odd++;
				}
				
			}
	}
		System.out.println("odd number frequency: "+odd);
		
		System.out.println("Even number frequency: "+even);
	}
	
	public static void findfre1(int arr[][],int size) {
		
		int even=0,odd=0;
		
		for(int i=0;i<size;i++) {
			
			for(int j=0;j<size;j++) 
				
					if(arr[i][j]%2 ==0) {
						
					even++;
				}
				else {
					
					odd++;
				}
				
			}
	
		System.out.println("odd number frequency: "+odd);
		
		System.out.println("Even number frequency: "+even);
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
			findfre1(A,size);	      
		}

	}


