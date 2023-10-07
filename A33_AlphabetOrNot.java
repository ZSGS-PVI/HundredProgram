package Thecodeworld;
import java.util.Scanner;
public class A33_AlphabetOrNot {
	
	static void alphabet(char ch) {
		
		   if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z'))
			   
	            System.out.println(ch+" is Alphabet" );
	   
	         else
	        	 
	            System.out.println(ch+" is not Alphabet");
	}



	    public static void main(String[] args){
	    	
	        Scanner in=new Scanner(System.in);
	        
	        System.out.println("Enter the character:");
	        
	        char ch=in.next().charAt(0);
	        
	        alphabet(ch);
	     

	    }

	}
