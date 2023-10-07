package Thecodeworld;

import java.util.Scanner;

public class A32_PositiveOrNegative {
	
	static void positiveor(int value) {
		
		 if(value>0)
	            System.out.println(value+" is positive number");
	        else if(value==0)
	              System.out.println(value+" is zero");
	            else
	                 System.out.println(value+" is Negative number");
	}
	
    public static void main(String[] args){
    	
        Scanner in=new Scanner(System.in);
        
        System.out.println("enter the value:");
        
        int value=in.nextInt();
        
        positiveor(value);
       

    }
}
