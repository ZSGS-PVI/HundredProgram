package Thecodeworld;

import java.util.Scanner;


public class A96_LinearSearch {
	
	//method 1
	
	public static int linearsearch(String str,char target) {
		
		if(str.length()==0) {
			
			return 0;
		}
		
		for(int i=0;i<str.length();i++) {
			
			if(str.charAt(i)==target) {
				
				return i;
			}
		}
		return -1;
		
	}
	
	
	
	//method 2
	
	static void linearsearch1(String str,char target) {
		
		 int index = -1; 

	        for(int i = 0; i < str.length(); i++) {
	        	
	            if(str.charAt(i) == target) {
	            	
	                index = i; 
	                
	                break; // Exit the loop early once the target is found
	            }
	        }

	        if(index >= 0) {
	        	
	            System.out.println(index );
	            
	        } else {
	            System.out.println( " not present in the string");
	        }
	}

	
	public static void main(String[] args) {

         Scanner in =new Scanner(System.in);
         
        System.out.println("Enter the string:");
        
		String str=in.nextLine();
		
		 System.out.println("Enter the target:");
		 
		char target=in.next().charAt(0);
		
		
		linearsearch1(str,target);
		//System.out.println(linearsearch(str,target));
		
		/*boolean ans=linearsearch(str,target);
		if(ans)
		  System.out.println("the given target is present");
		else
			  System.out.println("the given target is not present");
*/
	}

}



