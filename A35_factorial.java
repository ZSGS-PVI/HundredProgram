package Thecodeworld;
import java.util.Scanner;
public class A35_factorial {
	
	public static void facto(int n) {
		
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact*=i;
		}
		System.out.println(" factorial of a number="+fact);
		int count=1,sum=0;
		while(fact!=0) {
			int rem= (fact%10);
			 sum+=rem;
			fact/=10;
               
				
		}
		System.out.println("sum of factorial="+sum);
	}
	
	

	public static void main(String[] args) {
		
		int number=0;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter any number:");
		int number1=in.nextInt();
		facto(number1);



	}
	
	//public static boolean strong(int number) {
	
			/*
			 * int sum=0,last=0;
			 
			int temp=number;
			 while(temp!=0) {
				 last=temp%10;
				 sum+=facto(last);
				 temp/=10;
			 }
			 if(sum==number)
				 return true;
			 return false;
		}
		*/

}
