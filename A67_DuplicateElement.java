package Thecodeworld;
//PROGRAM TO PRINT THE DUBLICATE ELEMENTS

import java.util.Scanner;
import java.util.ArrayList;

public class A67_DuplicateElement {
	
	public static void Duplicate(int a[],int n) {
		//methid 1
		
		boolean ifPresent=false;
		
		ArrayList a1=new ArrayList();
		
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(a[i]==a[j]) {
					if(a1.contains(a[j])) {
						
						break;
						
					}
					else {
						a1.add(a[i]);
						ifPresent=true;
					}
				}
			}
		}
		if(ifPresent==true) {
			System.out.println(a1+" ");
		}
	}
	
//method 2
public static void Duplicate1(int a[],int n) {
		System.out.println("The duplicate Elements are:");
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
			if(a[i]==a[j]) { 
				 System.out.println(a[j]+" ");
			}
			}
		}
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
		//Arrays.sort(a);
	   Duplicate(a,n);	
	   //Duplicate1(a,n);
		
	}

}
