package Thecodeworld;
import java.util.Scanner;
public class A55_AlphabetC {
	
	static void print(int n) {
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if((i==1||i==4||j==1))
				
				System.out.print("*");
		
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
     Scanner in=new Scanner(System.in);
     System.out.println("Enter the row value:");
     int row=in.nextInt();
     print(row);

	//n=4;
	

	}

}
