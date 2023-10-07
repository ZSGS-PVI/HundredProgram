package Thecodeworld;

import java.util.Scanner;

public class A69_RightRotate {
	
	//method 1
	public static void Rotate(int a[],int d,int n) {
		
		int j,last;
		
		for(int i=0;i<d;i++) {
		
			last=a[n-1];
			
			for(j=n-1;j>0;j--) {
				
				a[j]=a[j-1];
			}
			a[0]=last;
		}
		System.out.println();
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
	}
	
	
	//method 2	
public static void Rotate1(int a[],int d,int n) {	
		  while(d>n) {
		 
			d=d-n;
		}
		// copy of n-d elements
		int temp[]=new int[n-d];
		for(int i=0;i<n-d;i++) {
			temp[i]=a[i];
			
		}
		
		//moving rest element
		
		for(int i=n-d;i<n;i++) {
			a[i+n-d]=a[i];
		}
		
		//copy the element to a[]
		for(int i=0;i<n-d;i++) {
			a[i+d]=temp[i];
				
		}
	}

		
		public static void PrintArray(int a[],int n) {
			for(int i=0;i<n;i++) {
				System.out.print(a[i]+" ");
			
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in=new Scanner(System.in);
		System.out.println("How many elements do you enter?");
		int n=in.nextInt();
		System.out.println("Enter the Elements:");
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=in.nextInt();
		}
		int d=3;
		Rotate(a,d,n);
		//PrintArray(a,n);


	}

}

