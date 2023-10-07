package Thecodeworld;

import java.util.Scanner;

public class A51_ReverseNumber {
	
	public static void Reverse(int num) {

		int q=num,result=0;
		
		while(q!=0) {
			
			int rem=q%10;
			
			result=result*10+rem;
			
			q/=10;
		}
		System.out.println(num+"="+result);
		
	}

	public static void main(String[] args) {

		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter the number:");
		
		int num=in.nextInt();
		
		Reverse(num);

	}

}
