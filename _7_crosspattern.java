package Thecodeworld;

import java.util.Scanner;

public class _7_crosspattern {
	
	static void print(String str,int n) {
		
		  for (int i = 0; i < n; i++) {
			  
		      for (int j = 0; j < n; j++) {
		    	  
		        if (i == j || i + j ==n - 1) {
		        	
		          System.out.print(str.charAt(i));
		          
		        } else {
		        	
		          System.out.print(" ");
		        }
		      }
		      System.out.println();
		    }
	}

	public static void main(String[] args) {
		
	Scanner in=new Scanner(System.in);
	
	System.out.println("Enter the string :");//12345
	
	String str =in.nextLine();
	
    int length = str.length();
    
    print(str,length);
			  
	 }
}

