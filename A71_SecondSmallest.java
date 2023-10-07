package Thecodeworld;

import java.util.Arrays;
import java.util.Scanner;

public class A71_SecondSmallest {
	
	//method 1
	public static void Smallest(int b[],int n) {
		
	for(int i=0;i<n;i++) {
			
			for(int j=i+1;j<n;j++) {
				
				if(b[i]>b[j]) {
					
					int temp=b[i];
					b[i]=b[j];
					b[j]=temp;
				}
			}
			
		}
	System.out.println("the second smallest element="+b[1]);
	}
	
	//method 1
	public static void Smallest1(int b[],int n) {
		
		Arrays.sort(b);
		System.out.println("the second smallest element="+b[1]);
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
		Smallest(a,n);

	}

}
