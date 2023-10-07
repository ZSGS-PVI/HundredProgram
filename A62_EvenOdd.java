package Thecodeworld;

import java.util.Scanner;

//print the elements in add and even position

public class A62_EvenOdd {
	
	public static void EvenandOdd(int a[],int n) {
		
		System.out.print("Even position:");
		
		for(int i=0;i<n;i++) {
			
			if(i%2==0) {
				
				System.out.print(a[i]+" ");
			}
		}
		
System.out.print("\nOdd position:");
		
		for(int i=0;i<n;i++) {
			
			if(i%2!=0) {
				
				System.out.print(a[i]+" ");
			}
		}
	}
	
	public static void EvenandOdd1(int a[],int n) {
		
		System.out.println("Even position:");
		
		for(int i=1;i<n;i=i+2) {
			System.out.print(a[i]);
			
		}

			System.out.println("\nOdd position:");
			for(int i=0;i<n;i=i+2) {
				System.out.print(a[i]);
				
			}
		}


	public static void main(String[] args) {

		Scanner in=new Scanner(System.in);
		
		System.out.println("How many number do you enter?");
		
		int n=in.nextInt();
		
		int arr[]=new int[n];
		
		System.out.println("Enter the Element:");
		
		for(int i=0;i<n;i++) {
			
			arr[i]=in.nextInt();

		}
		
		EvenandOdd(arr,n);
		
		

	}

}
