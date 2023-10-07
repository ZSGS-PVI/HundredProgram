package Thecodeworld;
import java.util.Scanner;
public class A50_TriangleInverse {

	static void print(int n) {
		for(int i=1,k=9;i<=n;i++,k--)
		{
			for(int s=1;s<=i;s++) {
				System.out.print(" ");
				
			}
			for(int j=1;j<=n-i+1;j++) {
				System.out.print( k+" ");
			}
			System.out.println();
		}
		
	}

	public static void main(String[] args) {


		Scanner in=new Scanner(System.in);
		System.out.println("Enter the rows:");
		int rows=in.nextInt();
		print(rows);

	}

}
