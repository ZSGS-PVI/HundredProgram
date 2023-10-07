package Thecodeworld;

import java.util.Scanner;

public class A45_SumOfArray {
	
	static void sum(int a[],int n) {

		int sum=0;
		
		int i=0;
		
		while(i<n) {
			
			sum+=a[i];
			
			i++;
		}
		/*for(int i=0;i<n;i++) {
			sum+=a[i];
		}
		*/
		System.out.println("sum of the array is="+sum);
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

        sum(a,n);
          
	}

}
