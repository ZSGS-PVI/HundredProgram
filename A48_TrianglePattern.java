package Thecodeworld;
import java.util.Scanner;
public class A48_TrianglePattern {
	
	static void pattern(int n) {
		
		for(int i=1;i<=n;i++) {
			int p=1;
			
			for(int s=1;s<=n-i;s++)
				System.out.print(" ");
		
			
			for(int j=1;j<i;j++) {
				System.out.print(p++);
			}

			for(int j=1;j<=i;j++) {
				System.out.print(p--);
			}
			
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the rows value:");
		int n=in.nextInt();
		pattern(n);
	
		}
	}


