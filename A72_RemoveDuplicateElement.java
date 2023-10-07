package Thecodeworld;
import java.util.Arrays;
import java.util.Scanner;
public class A72_RemoveDuplicateElement {
	
//method 1	
public static int Duplicate(int a[],int n) {
	
	if(n==1 || n==0 ) {
		return n;
	}
	int j=0;
	for(int i=0;i<n-1;i++) {
		if(a[i]!=a[i+1]) {
			a[j++]=a[i];
		}
	}
	a[j++]=a[n-1];
	return j;
}

// method 2
public static int Duplicate1(int a[],int n) {	
	
	int temp[]=new int[n];
	int j=0;
	for(int i=0;i<n-1;i++) {
		if(a[i]!=a[i+1]) {
			temp[j++]=a[i];
		}
		
	}
	temp[j++]=a[n-1];
	
	for(int i=0;i<j;i++) {
		a[i]=temp[i];
	}
	return j;
	
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
           Arrays.sort(a);
           int length=a.length;
           int j=0;

		 j=Duplicate1(a,length);
		for(int i=0;i<j;i++) {
			System.out.println(a[i]);
		}
		
		

	}

}
