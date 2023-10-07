package Thecodeworld;

import java.util.Scanner;

public class A13_AreaOfSquare {
	//find the area of the square

	    public static int Area(int a) {

	        int square = a * a;
	        
	        return square;
	    }


	    public static void main(String[] args){
	    	
	        Scanner in=new Scanner(System.in);
	        
	        System.out.println("Enter the value:");
	        
	        int value=in.nextInt();
	        
	        System.out.println("The area of the square is= "+Area(value));
	    }
	}

