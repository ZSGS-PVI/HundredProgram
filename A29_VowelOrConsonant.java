package Thecodeworld;

import java.util.Scanner;

public class A29_VowelOrConsonant {
		
		static void vowel(char ch) {
			
		 if( ch=='a'|| ch=='A'|| ch=='e'|| ch=='E'  ||ch=='i'||ch=='I'
				 
				 || ch=='o'||ch=='O' ||ch=='u'||ch=='U' )
				 
		            System.out.println(ch+" is vowel");
			 
		        else
		        	
		            System.out.println(ch+" is consonant");
		}
		
	    public static void main(String[] args){
	    	
	        Scanner in=new Scanner(System.in);
	        
	        System.out.println("Enter the character:");
	        
	        char ch=in.next().charAt(0);
	        
	        vowel(ch);
	       


	    }

	}

