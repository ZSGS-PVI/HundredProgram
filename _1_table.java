package Thecodeworld;

import java.util.Scanner;

public class _1_table {
	
	public static void Multiplication(int num,int n){
		
        System.out.println("Multiplication Table");
        
        int i=1;
        
        while(i<=n) {
        	
        	System.out.println(i + "*" +num + "=" +(i*num));
        	
        	i++;
        }
       /* for(int i=1;i<=n;i++)

        System.out.println( i + "*" +num + "=" +(i*num));
    }
    */
	}
    public static void Subtraction(int num,int n){
    	
        System.out.println("Subtraction Table");
        
        for(int i=2;i<=n;i++)

            System.out.println(i + "-" +num + "=" +(i-num));
    }
    public static void main(String[] args){
    	
        Scanner in=new Scanner (System.in);
        
        System.out.println("enter the num value:");
        
        int num=in.nextInt();
        
        System.out.println("enter the table length:");
        
        int n=in.nextInt();
        
     Multiplication(num,n);
     
     Subtraction(num,n);
    }

}
