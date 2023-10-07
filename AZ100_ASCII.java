package Thecodeworld;

import java.util.Scanner;    

// convert ASCII to character(for A-Z)

public class AZ100_ASCII {
	
//method 1	
	
static void aschiitochar(int asciiValue) {
	
                  
        if(asciiValue >= 65 && asciiValue <= 90){
        	
            char character = (char) asciiValue;
            
            System.out.println( asciiValue +"-" + character);
        }

	}


       //method 2 

 static void aschiitochar1(int asciiValue) {
        	
        
    	String s=Character.toString(asciiValue);
    	
        System.out.println(s);
        
    }
	

	public static void main(String[] args) {
	
	 Scanner in = new Scanner(System.in);

     System.out.print("Enter the ASCII value (65-90): ");
     
	 int asciiValue = in.nextInt();
	 
	 aschiitochar1(asciiValue);
		        


	  }
	}

	


		
		
		