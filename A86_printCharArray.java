package Thecodeworld;
import java.util.Scanner;

//print all the character in an array
public class A86_printCharArray {
	
	//method 1
	public static void print(char charArray []) {
		 
		  for(char c:charArray) {
			  
			   System.out.print(c+" "); 
		  }
	}
	
	//method 2
		  public static void print1(char charArray []) {
			  
		for(int i=0;i<charArray.length;i++) {
			
			System.out.println(charArray[i]);
		}
		
	}
	
	public static void main(String[] args) {
		
		char[] charArray = {'w', 'e', 'l', 'c', 'o','m','e'};


		
     print1(charArray);
     
}
}
