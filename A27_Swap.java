package Thecodeworld;

import java.util.Scanner;
//swap two numbers
public class A27_Swap {


	    public static void swap(int n1,int n2){

            n1=(n1+n2)-(n2=n1);
            
	        System.out.println("After swapping  n1= "+n1+" and n2="+n2);


	    }
	    public static void withouttemp(int n1,int n2){

	    n1=n1+n2;
	    
	    n2=n1-n2;
	    
	    n1=n1-n2;

	        System.out.println("After swapping withouttemp n1= "+n1+" and n2="+n2);
	    }

	    public static void main(String[] args){
	    	
	        Scanner in=new Scanner(System.in);
	        
	        System.out.println("Enter the two values:");
	        
	        int n1=in.nextInt();
	        
	        int n2=in.nextInt();
	        
	        System.out.println("Before swapping n1= "+n1+" and n2="+n2);
	        
	        swap(n1,n2);
	        
	        withouttemp(n1,n2);




	    }
	}

