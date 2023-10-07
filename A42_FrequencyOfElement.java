package Thecodeworld;
import java.util.Scanner;
import java.util.Arrays;
public class A42_FrequencyOfElement {
	
	public static void Frequency(int a[],int n) {
		
		 int fr [] = new int [n]; 
		 
	        int visited = -1; 
	        
	        for(int i = 0; i < n; i++){  
	        	
	            int count = 1;
	            
	            for(int j = i+1; j < n; j++){ 
	            	
	                if(a[i] == a[j]){ 
	                	
	                    count++;  
	                    
	                    //To avoid counting same element again  
	                    fr[j] = visited;  
	                }  
	            }  
	            if(fr[i] != visited)
	            	
	                fr[i] = count;  
	        } 
	        for(int i = 0; i < fr.length; i++){
	        	
	           if(fr[i] != visited)  
	        	   
	                System.out.println("    " + a[i] + "    |    " + fr[i]);  
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
		
	    Frequency(a,n);	
		
		

	}
}
