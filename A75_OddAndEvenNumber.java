package Thecodeworld;

import java.util.Scanner;

public class A75_OddAndEvenNumber {
	//method 1
	public static void evenandodd(int arr[],int n) {
		System.out.println("Even numbers:");
		for(int i=0;i<n;i++) {
			if((arr[i]&1) !=1)
				System.out.print(arr[i]+" ");
		}
		System.out.println("\nOdd numbers:");
		for(int i=0;i<n;i++) {
			if((arr[i]&1) ==1)
				System.out.print(arr[i]+" ");
		
	}
	}
		//method 2
	public static void evenandodd1(int arr[],int n) {
		System.out.println("Even numbers:");
		for(int i=0;i<n;i++) {
			if(arr[i]%2==0)
				System.out.print(arr[i]+" ");
			
		}
		System.out.println("\nOdd numbers:");
		for(int i=0;i<n;i++) {
		
			if(arr[i]%2!=0)
				System.out.print(arr[i]+" ");
		}
	}
	

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		System.out.println("How many elements do you enter?");
		int n=in.nextInt();
		System.out.println("Enter the Elements:");
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=in.nextInt();
		}
		evenandodd1(a,n);
		

	}

}
