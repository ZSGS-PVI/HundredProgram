package Thecodeworld;

import java.util.Scanner;

public class A57_XPattern {
	
	public static void Pattern(int len) {
		
		 
		for(int i=0;i<=len-1;i++) {
			
			for(int j=0,count=1;j<=len-1;j++,count++) {
				
				if(j==i || i+ j==len-1)
					
					System.out.print(count);
				else
					System.out.print(" ");
			}
			System.out.println(" ");
			}
			
			
		}
		
		
	
	public static void main(String[] args) {
    
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter the string:");
		
		String n=in.nextLine();//123456
		
		int len=n.length();
		
		Pattern(len);
	
	}

}
