package Thecodeworld;
import java.util.Scanner;
public class A37_OddPosition {
	
	static void oddposition(int arr[],int n) {
		
		  System.out.println("Odd position number.");
	       
	       for(int i=0;i<n;i++) {
	    	   
	    	   if(i%2!=0) {
	    		   
	    		   System.out.println(arr[i]);
	    	   }
	       }
		}
	

		public static void main(String[] args) {

	       Scanner in=new Scanner(System.in); 
	       
	       System.out.println("How many number do you enter?");
	       
	       int n=in.nextInt();
	       
	       int arr[]=new int[n];
	       
	       System.out.println("Enter the numbers:");
	       
	       for(int i=0;i<n;i++) {
	    	   
	    	   arr[i]=in.nextInt();
	       }
	       
	       oddposition(arr,n);
	    
	}
}


