package Thecodeworld;

import java.util.Scanner;

public class A58_HollowDiamondPattern {
	
	public static void hallowDiamond(int n) {

	//top 1
	
	for(int i=1;i<n;i++) {
		for(int j=1;j<=n+1-i;j++) {
			System.out.print("*");
		}
		//space
		for(int s=1;s<=2*i-2;s++) {
			System.out.print("_");
		}
		//top 2
		for(int j=1;j<=n+1-i;j++) {
			System.out.print("*");
		}
		
		System.out.println();
	}
	
	//bottom 1
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print("*");
		}
		
		//space
		for(int s=1;s<=2*(n-i);s++) {
			System.out.print("_");
		}
		//bottom 2
		for(int j=1;j<=i;j++) {
			System.out.print("*");
		}
		System.out.println();
	}

}	

public static void main(String[] args) {
  
	Scanner in=new Scanner(System.in);
	System.out.println("Enter the value:");
	int n=in.nextInt();
	hallowDiamond(n);
	
}

}