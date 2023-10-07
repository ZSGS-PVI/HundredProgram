package Thecodeworld;

import java.util.Scanner;

public class A61_ReverseArray {
	//method 1
public static void Reverse(int arr[],int len) {
	
	int b[]=new int[len];


	int j=len;
	
	for(int i=0;i<len;i++) {
		
		b[j-1]=arr[i];
		
		j--;
	}
	System.out.println("Reversed Array:");
	
	for(int i=0;i<len;i++) {
		
		System.out.print(b[i]+" ");
		
	}
	
}
//method 2
public static void Reverse1(int arr[],int len) {
	
	for(int i=len-1;i>=0;i--) {
		System.out.print(arr[i]);
		
	}
	
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
        
        System.out.println("How many element do you enter the Array?");
        
        int n=in.nextInt();
        
        System.out.println("Enter the Element:");
        
        int arr[]=new int[n];
        
        for(int i=0;i<n;i++) {
      	  
      	  arr[i]=in.nextInt();
      	  
        }
		Reverse(arr,n);

	}

}
