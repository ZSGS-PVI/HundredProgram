package Thecodeworld;

import java.util.Scanner;

public class A60_sumofseries {
	
	static void print(int n) {
		
		int sum=0,j=1;
		
		  for(int i=1;i<=n;i++) {
			
			sum=sum+j;
			//print the series
			System.out.print(j+ "+");
			
			j=(j*10)+1;
			
		}
		System.out.print( "n");
		
		System.out.println("\nsum="+sum);
		
	}

	public static void main(String[] args) {
		
     Scanner in=new Scanner(System.in);
     
     System.out.println("Enter the value:");
     
     int n=in.nextInt();
     
     print(n);


	}

}
