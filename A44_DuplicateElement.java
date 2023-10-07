package Thecodeworld;

//import java.util.Arrays;
import java.util.Scanner;

public class A44_DuplicateElement {
	
	public static void Duplicate(int a[],int n) {


		System.out.println("The duplicate Elements are:");
		
		for(int i=0;i<n;i++) {
			
			for(int j=i+1;j<n;j++) {
				
			if(a[i]==a[j]) 
				
				 System.out.println(a[j]+" ");
			}
			
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
		//Arrays.sort(a);
	   Duplicate(a,n);	  
		
	}

}
