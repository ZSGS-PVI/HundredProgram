package Thecodeworld;

import java.util.Scanner;

//copy the elements

public class A64_ArrayCopy {
	
	public static void copyarray(int a[],int b[]) {
		
		for(int i=0;i<a.length;i++)
			
		b[i]=a[i];  //coping elements of a[] to b[]
		
		b[0]++;
		
		System.out.println("original form:");
		
		for(int i=0;i<a.length;i++)
			
			System.out.print(a[i]+" ");
		
			
			System.out.println("\ncopy form:");
			
			for(int k=0; k<b.length;k++) 
				
				System.out.print(b[k]+" ");
		
		
	}
	
		//b=a;
		public static void clonearray(int a[],int array[]) { 
		
	
	     int array1[]=a.clone();
		
		//b[0]++;
		
			System.out.println("\ncopy form:");
			
			for(int k=0; k<array1.length;k++) 
			
				System.out.print(array1[k]+" ");
		
		
	}
	

	public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        
        System.out.println("How many element do you enter the Array?");
        
        int n=in.nextInt();
        
        System.out.println("Enter the Element:");
        
        int arr[]=new int[n];
        
        for(int i=0;i<n;i++) {
      	  
      	  arr[i]=in.nextInt();
      	  
        }
		int b[]=new int[arr.length];
		
		copyarray(arr,b);
		clonearray(arr,b);

	}

}
