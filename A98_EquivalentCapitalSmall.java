package Thecodeworld;

import java.util.Scanner;

// print equivalent capital letter of given small letter

public class A98_EquivalentCapitalSmall {
	
	//method 1
	
static void uppercase1(char ch) {
		
		char ch2;
		
		if(ch >= 'a' && ch <= 'z') {
         
            ch2 = (char)((int)ch -32);
            
            System.out.println( ch+"="+ ch2);
        }
}
	
	//method 2
	
		static void uppercase(char ch) {
			
			char ch1=Character.toUpperCase(ch);
			
			System.out.println(ch+"="+ch1);
		}
      
    

	public static void main(String[] args) {
	
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter the Alphabet:");
		
		char ch=in.next().charAt(0);
		
		uppercase1(ch);
		

	}

}


