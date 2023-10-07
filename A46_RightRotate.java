package Thecodeworld;
import java.util.Scanner;
public class A46_RightRotate {
	
	public static void Rotate(int arr[],int d,int n) {
		 int  last;
		 
		 last = arr[n-1];
		 
		   for(int i = 0; i < d; i++){    
	               
	            //Stores the last element of array    
	                
	            
	            for(int j = n-1; j > 0; j--){    
	                //Shift element of array by one    
	                arr[j] = arr[j-1]; 


	            }    
	            //Last element of array will be added to the start of array.    
	            arr[0] = last;    
	        }    
	        
	        System.out.println();    
	           
	        System.out.println("Array after right rotation: ");  
	        
	        for(int i = 0; i< n; i++){ 
	        	
	            System.out.print(arr[i] + " ");    
	        } 
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
		
		int d=3;
		
		Rotate(a,d,n);




	}

}
