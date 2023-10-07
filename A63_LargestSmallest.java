package Thecodeworld;

import java.util.Arrays;
import java.util.Scanner;

public class A63_LargestSmallest {
	//method 1
	public static void fun(int a[],int n) {
		
		int largest=a[0],smallest=a[0];
		
		for(int i=0;i<n;i++) {
			
			if(smallest>a[i])
				
				smallest=a[i];
			
		   if(largest<a[i])
				
				largest=a[i];
			
		}
		
		System.out.println("Smallest= "+smallest);
		
		System.out.println("Largest= "+largest);
	}
	
	//method 2
	public static void fun1(int arr[],int n) {
	 Arrays.sort(arr);

     System.out.println("Largest= "+ arr[n - 1]);
     System.out.println( "Smallest= "+arr[0]);
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner in=new Scanner(System.in);
        
        System.out.println("How many element do you enter the Array?");
        
        int n=in.nextInt();
        
        System.out.println("Enter the Element:");
        
        int a[]=new int[n];
        
        for(int i=0;i<n;i++) {
      	  
      	  a[i]=in.nextInt();
      	  
        }
		fun1(a,n);

	}

}



