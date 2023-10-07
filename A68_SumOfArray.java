package Thecodeworld;

import java.util.*;

public class A68_SumOfArray {
	
	//method 1
	public static int sum(int arr[],int n) {
		
		if(n==0) {
			return arr[n];
		}
		else {
			
		
		return arr[n]+sum(arr,n-1);
		
	}
	}
	//method 2
	public static int sum1(int arr[],int n) {
		
		int sum=0;
		
		for(int i=0;i<n;i++){
			sum+=arr[i];
			
		}
		return sum;
	}
	
	
	public static void main(String[] args) {

		Scanner in=new Scanner(System.in);
		
		System.out.println("How many elements do you enter?");
		int n=in.nextInt();
		System.out.println("Enter the Elements:");
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=in.nextInt();
		}
	
		System.out.println("sum of the array ="+sum(arr,n-1));
		
	}

}
