package Thecodeworld;

import java.util.Scanner;

public class A41_CopyOfArray {
	
	static void copyOf(int a[]) {
		
		int b[]=new int[a.length];
		
		b=a;//doesn't copy of elements only refer same location
		
		b[0]++;
		
		System.out.println("contents of a[]");
		
		for(int i=0;i <a.length;i++)
			
			System.out.print(a[i]+ " ");
		
		
		System.out.println("\ncontents of copyofarray[]");
		
		for(int i=0;i<b.length;i++) 
			
			System.out.print(b[i]+ " ");
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
		copyOf(a);
		
	}

}
