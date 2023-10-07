package Thecodeworld;
import java.util.Scanner;
public class A43_LeftRotate {
	
	public static void Rotate(int a[],int d,int n) {
		int temp[]=new int[n];
		int k=0;
		//d to n numbers store in temp
		
		for(int i=d;i<n;i++) {
			temp[k]=a[i];
			k++;
		}
		for(int i=0;i<d;i++) {
			temp[k]=a[i];
			k++;
		}
		
		//store first element
		
		
		
		//copy the elements to final rotation
		for(int i=0;i<n;i++) {
			a[i]=temp[i];
			System.out.print(a[i]+" ");
		}
		
	}

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		
		System.out.println("How many elements do you enter?");
		
		int n=in.nextInt();
		
		System.out.println("Enter the Elements:");
		
		int a[]=new int[n];
		
		for(int i=0;i<n;i++) {
			
			a[i]=in.nextInt();
			
		}
		
		int d=2;
		
		Rotate(a,d,n);



	}

}
