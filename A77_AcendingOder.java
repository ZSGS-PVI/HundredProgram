package Thecodeworld;

import java.util.Arrays;
import java.util.Scanner;

public class A77_AcendingOder {
	


public static void Acending(int A[],int n) {
	Arrays.sort(A);
	System.out.println("The numbers in Acending Order:");
	for(int i=0;i<n;i++) {
		System.out.print(A[i]+" ");
	
}
}

public static void Acending1(int A[],int n) {
	
	int temp;
	for(int i=0;i<n;i++) {
		for(int j=i+1;j<n;j++) {
			if(A[i]>A[j]) {
				 temp=A[i];
			       A[i]=A[j];
			       A[j]=temp;
		}
	}
	}

	System.out.print(Arrays.toString(A));


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
		Acending(a,n);

	}

}
