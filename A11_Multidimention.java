package Thecodeworld;
import java.util.Scanner;
public class A11_Multidimention {

	 
	 static void transpose(int a[][] ){
		 //int[][] trans=new int[a.length][a.length];
		 for (int i = 0; i < a.length; i++) {
		      for (int j = i; j < a.length; j++) {
		    	  int temp=a[i][j];
		    	  a[i][j]=a[j][i];
		    	  a[j][i]=temp;
		      }
		 }
	 }
	 
	  public static void Reverse(int a[][]) {
       
		  for(int i=0;i<a.length;i++) {
			  int k=a.length-1;
			  for(int j=0;j<a.length/2;j++) {
				  int temp=a[i][j];
				  a[i][j]=a[i][k];
				  a[i][k]=temp;
				  k--;
			  }
		  }
        
	  }

		 public static void printArray(int a[][] ) {
			    for (int i = 0; i < a.length; i++) {
			      for (int j = 0; j < a.length; j++) {
			        System.out.print(a[i][j] + " ");
			      }
			      System.out.println();
			    }
		 }

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the length of the array:");
		int size=in.nextInt();
	    int[][] arr = new int[size][size];
	    for(int i=0;i<size;i++) {
	    for(int j=0;j<size;j++) {
	    	arr[i][j]=in.nextInt();
	    }
	    }
			    
			    System.out.println("Original array:");
			    printArray(arr);
			    transpose(arr);
			    Reverse(arr);
			    System.out.println("Array after left rotation:");
			    printArray(arr);
			  
			   // printArray(arr);
			  }

			
}
			
