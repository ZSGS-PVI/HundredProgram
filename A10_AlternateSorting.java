package Thecodeworld;

import java.util.Scanner;
import java.util.Arrays;

public class A10_AlternateSorting {
	
	public static void alternateSort(int arr[],int n) {
		
		Arrays.sort(arr);
		
		int i=0,j=n-1;
		
		while(i<j) {
			
			System.out.print(arr[j--]+" ");
			
			System.out.print(arr[i++]+" ");
		}
		
			System.out.print(arr[i]+" ");
	}

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter the length of the string:");
		
		int n=in.nextInt();
		
		System.out.println("Enter the elements:");
		
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++) {
			
			arr[i]=in.nextInt();
		}
		
		alternateSort(arr,n);
		

	}

}
