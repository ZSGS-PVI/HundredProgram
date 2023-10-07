package Thecodeworld;
//largest element in an array
import java.util.Scanner;

public class A38_LargestElement {
	
	public static int Largest(int arr[],int n) {
		
	    for(int i=0;i<n;i++) {
	    	
      	  if(arr[0]<arr[i]) {
      		  
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
          System.out.println("The largest Element in The Array = "+Largest(arr,n));
          
      
          
	}

}
