package Thecodeworld;

import java.util.Scanner;

public class A66_LeftRotate {
	
	static void rotate(int a[],int d,int n) {
		d=d%n;
		if(d<0) {
			d=d+n;
		}
		reverse(a,0,d-1);
		reverse(a,d,n-1);
		reverse(a,0,n-1);
	}
	
	 static void reverse(int a[],int start,int end) {
		
		while(start<end) {
			int temp=a[start];
			a[start]=a[end];
			a[end]=temp;
			start++;
			end--;
		}
	}
		
		
	
	
	static void Ntimes(int a[],int d,int n) {
		d=d%n;
		if(d<0) {
			d=d+n;
		}
		for(int i=0;i<n;i++) {
			rotate(a);
		}
	}
	
	static void rotate(int a[]) {
		int temp=a[0];
		for(int i=0;i<a.length;i++) {
			a[i-1]=a[i];
		}
		a[a.length-1]=temp;
	}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("How many elements do you enter?");
		int n=in.nextInt();
		System.out.println("Enter the Elements:");
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=in.nextInt();
		}
		int d=2;
		rotate(a,d,n);
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
		//PrintArray(a,n);

	}

}
/*for(int i=0;i<d;i++) {
int j,first;
first=a[0];
for(j=0;j<n-1;j++) {
	a[j]=a[j+1];
}
a[j]=first;


}
System.out.println();
for(int i=0;i<n;i++) {
System.out.println(a[i]+" ");
}
}*/
/*
int temp[]=new int[n];
int k=0;
//d to n numbers store in temp
for(int i=d;i<n;i++) {
temp[k]=a[i];
k++;
}

//store first element

for(int i=0;i<d;i++) {
temp[k]=a[i];
k++;
}

//copy the elements to final rotation
for(int i=0;i<n;i++) {
a[i]=temp[i];
}
}
public static void PrintArray(int a[],int n) {

for(int i=0;i<n;i++) {
	System.out.print(a[i]+" ");
}
}
*/

