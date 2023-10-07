package Thecodeworld;

import java.util.Scanner;

public class A15_AreaOfCylinder {
	
	//find the surface area of the cylinder 

	    static double PI=3.14159;
	    
	    public static double AreaOf(double r,double h){
	    	
	        double cylinder=(2*22*(r+h))/7;

	        return cylinder;
	    }
	    public static void main(String[] args){
	    	
	        Scanner in=new Scanner(System.in);
	        
	        System.out.println("Enter the radius:");
	        
	       double r=in.nextFloat();

	        System.out.println("Enter the height :");
	        
	       double h=in.nextFloat();
	       
	        System.out.println("The area of the cylinder is="+AreaOf(r,h));
	    }
	}
