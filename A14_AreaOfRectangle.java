package Thecodeworld;

import java.util.Scanner;

public class A14_AreaOfRectangle {
	//find the area of the rectangle

	    public static int AreaOfRect(int l,int b ){
	    	
	        int rectangle=l*b;
	        
	        return rectangle;
	    }
	    public static void main(String[] args){
	    	
	        Scanner in=new Scanner(System.in);
	        
	        System.out.println("Enter the length:");
	        
	        int l=in.nextInt();

	        System.out.println("Enter the breadth:");
	        
	        int b=in.nextInt();
	        
	        System.out.println("The area of the rectangle is="+AreaOfRect(l,b));
	    }
	}
