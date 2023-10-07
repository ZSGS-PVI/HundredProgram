package Thecodeworld;

import java.util.Scanner;

//print the number is even or odd
public class A28_EvenOrOdd {
	
   static void evenorodd(int num) {

       if(num%2==0)
    	   
           System.out.println(num  +" is an Even number");
       
       else
    	   
           System.out.println(num +" is an Odd number");
   }
	


	    public static void main(String[] args){
	    	
	        Scanner in=new Scanner(System.in);
	        
	        System.out.println("Enter the value:");
	        
	        int num=in.nextInt();
	        
	       evenorodd(num);
	    }
	}

