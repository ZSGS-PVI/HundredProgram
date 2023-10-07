package Thecodeworld;
//sum of the natural number and find the largest number in the sum
import java.util.Scanner;

public class A34_SumOfNatural {
	
	    public static void sum(int n){
	      
	        int digit,rem,largest=0;  //sum of the natural number
	        
	        int answer=n*(n+1)/2;
	        
	      /* int sum=0;
	        for(int i=0;i<=n;i++) {
	        	 sum=sum+i;
	        }
	        System.out.println("sum "+sum);
	        int answer=sum;
	        */
	       System.out.println("sum of the natural number="+answer);
	       
	        while(answer!=0){    //largest number in the sum
	        	
	             rem=answer%10;
	             
	            if(largest<rem){
	            	
	                largest=rem;
	            }
	            answer/=10;
	        }
	        System.out.println("largest is="+largest);
	    }
	    public static void main(String[] args){
	    	
	        Scanner in=new Scanner(System.in);
	        
	        System.out.println("Enter the number:");
	        
	        int n=in.nextInt();
	        
	        sum(n);
	    }
	}

