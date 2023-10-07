package Thecodeworld;
import java.util.Scanner;
public class A49_TrianglePatternInverse {
	
	static void print(int n) {
		for(int i=1;i<=n;i++)
		{
			for(int s=1;s<=i;s++) {
				System.out.print(" ");
				
			}
			for(int j=1;j<=n-i+1;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the rows:");
		int rows=in.nextInt();
		print(rows);
		
	}

}
