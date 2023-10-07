package Thecodeworld;

import java.util.Scanner;

public class A25_QuotientRemainder {

	    public static void program(int n1,int n2){
	    	
	        int rem=n1%n2;
	        
	        int quo=n1/n2;
	        
	        System.out.println("Quotient="+quo+ " "+ "Reminder="+rem);
	    }
	    
	    public static void main(String[] args){
	    	
	        Scanner in=new Scanner(System.in);
	        
	        System.out.println("Enter two value:");
	        
	        int value1=in.nextInt();
	        
	        int value2=in.nextInt();
	        
	        program(value1,value2);


	    }
	}

