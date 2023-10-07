package Thecodeworld;
import java.util.Scanner;
public class A56_Triangle123 {


	    public static void main(String[] args) {
	    	Scanner in=new Scanner (System.in);
	    	System.out.println("Enter the value:");
	    	int n=in.nextInt();//input=10;
	         n = n/2;
	        printPyramid(n);
	    }
	    
	    public static void printPyramid(int n) {
	        int num = 1;
	        for (int i = 0; i <n; i++) {
	            for (int s = 1; s <= n-i; s++) {
	                System.out.print(" ");
	            }
	            for (int j = 0; j < i; j++,num++) {
	                System.out.print(num +" ");
	            }
	            System.out.println();
	        }
	    }
	}

