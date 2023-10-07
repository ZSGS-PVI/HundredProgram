package Thecodeworld;

import java.util.Scanner;

public class A39_SmallestElement {
	
	
	public static int Smallest(int arr[],int n) {
		
	    for(int i=0;i<n;i++) {
	    	
      	  if(arr[0]>arr[i]) {
      		  
      		  arr[0]=arr[i];
      		  
      	  }
        }
	    return arr[0];
		
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
          System.out.println("The Smallest Element in The Array = "+Smallest(arr,n));
          
      
          
	}
}




