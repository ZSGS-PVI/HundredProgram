package Thecodeworld;
//print the number of elements present in an array
import java.util.Scanner;

public class A40_ArrayPrint {
	
	static void print(int arr[],int n) {
		
		System.out.println("The array Elements are:");
		
		for(int i=0;i<n;i++) {
			
			System.out.print(arr[i]+" ");

		}
	}

	public static void main(String[] args) {


		Scanner in=new Scanner(System.in);
		
		System.out.println("How many number do you enter?");
		
		int n=in.nextInt();
		
		int arr[]=new int[n];
		
		System.out.println("Enter the Element:");
		
		for(int i=0;i<n;i++) {
			
			arr[i]=in.nextInt();

		}
		
		print(arr,n);

	}

}
