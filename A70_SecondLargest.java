
package Thecodeworld;

import java.util.Arrays;
import java.util.Scanner;

public class A70_SecondLargest {
	//method 1
	
	public static int Largest(int a[],int len) {
		
		for(int i=0;i<len;i++) {
			
			for(int j=i+1;j<len;j++) {
				
				if(a[i]>a[j]) {
					
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			
		}
		return a[len-2];
	}
	
	//method 2
	
public static int Largest1(int a[],int len) {		
		
		if(len<2) {
			System.out.println("Invalid input:");
			
		}
		Arrays.sort(a);
		//find the second largest
		System.out.println();
		return a[len-2];	
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
       
     System.out.println("The second largest element:"+Largest(a,n));

	}

}
