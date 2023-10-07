package Thecodeworld;

import java.util.Scanner;

public class A30_LargestThreeNumber {
	
	static void largest(int num1,int num2,int num3) {
		
		 if(num1>num2 && num1>num3)
			 
	            System.out.println(num1+" is Largest Number");
		 
	        else if(num2>num1 && num2>num3)
	        	
	            System.out.println(num2+" is Largest Number");
		 
	        else
	            System.out.println(num3+" is Largest Number");
	}
    public static void main(String[] args){
    	
        Scanner in=new Scanner(System.in);
        
        System.out.println("Enter the three values:");
        
        int num1=in.nextInt();
        
        int num2=in.nextInt();
        
        int num3=in.nextInt();
        
        largest(num1,num2,num3);
       
    }
}
