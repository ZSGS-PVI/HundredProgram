package Thecodeworld;
import java.util.Scanner;
public class A47_Triangle {
	
	static void print(int n) {
		
		for(int i=n;i>=1;i--) {
			
			for(int s=1;s<=2*i;s++) {
				System.out.print(" ");
			}

			for(int j=i;j<=n;j++) {
				System.out.print(j+" ");
			}

			for(int j=n-1;j>=i;j--) {
				System.out.print(j+" ");
			}
			System.out.println();
			
		}
	}

	public static void main(String[] args) {


		Scanner in=new Scanner(System.in);
		System.out.println("Enter the rows value:");
		int n=in.nextInt();
		print(n);
	
     


	}
}

/* for(int row=n;row>=1;row--) {
for(int s=1;s<row*2;s++) {
	   System.out.print(" ");
	   
}

for(int col=row;col<=n;col++) {
	   System.out.print(col+" ");
}
for(int col=n-1;col>=row;col--) {
	   System.out.print(col+" ");
}

System.out.println();
// count++;

}
*/
