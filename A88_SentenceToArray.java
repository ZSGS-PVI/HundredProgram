package Thecodeworld;

import java.util.Arrays;
import java.util.Scanner;


public class A88_SentenceToArray {

	static void wordarray(String str) {
		
		String words[] = str.split(" ");
		
		String strArray[] = new String[] {str}; 
		
		//printing the string array using Arrays.toString()  
		System.out.print(Arrays.toString(strArray)); 
	}
	
	 static  void wordarray1(String sentence) {
		 
	    String[] words = sentence.split("\\s");
	    
		System.out.println(Arrays.toString(words));
	}

	
	public static void main(String[] args) {

         Scanner in=new Scanner(System.in);
         
         System.out.println("Enter the string:");
         
		String str = in.nextLine();


	
		 wordarray(str);
	

	}

}

