package Thecodeworld;
//print the elements of an array present on even position
import java.util.Scanner;

public class A36_EvenPosition {
	
	static void evenposition(int arr[],int n) {
		
		System.out.println("Even position numbers:");
		
		 for(int i=0;i<n;i++){
			 
			   	if(i%2==0) {
			   		
	            System.out.println(arr[i]);
	            
	        }
		 }
	}

	    public static void main(String[] args){

	    	  Scanner in=new Scanner(System.in);
	    	  
		       System.out.println("How many number do you enter?");
		       
		       int n=in.nextInt();
		       
		       int arr[]=new int[n];
		       
		       System.out.println("Enter the numbers:");
		       
		       for(int i=0;i<n;i++) {
		    	   
		    	   arr[i]=in.nextInt();
		       }
	        int len=arr.length;
	        
	        evenposition(arr,n);
	       
	    }
	}

