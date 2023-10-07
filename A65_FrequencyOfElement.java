package Thecodeworld;

import java.util.Arrays;
import java.util.Scanner;

public class A65_FrequencyOfElement {

	public static void Frequency(int a[],int n) {
		int frequency[]=new int[n];
		int counted=-1;
		for(int i=0;i<n;i++) {
			int count=1;
			
			for(int j=i+1;j<n;j++) {
				if(a[i]==a[j]) {
					count++;
					frequency[j]=counted;
				}
			}
			if(frequency[i]!=counted)
				frequency[i]=count;
		}
		for(int i=0;i<frequency.length;i++) {
			if(frequency[i]!=counted)
				System.out.println(a[i]+" "+frequency[i]);
		}
	}
	
	static void Frequency1(int a[],int n) {
		
		boolean visited[]=new boolean[n];
		
		Arrays.fill(visited, false);
		for(int i=0;i<n;i++) {
			if(visited[i]==true) 
				continue;
			int count=1;
			for(int j=i+1;j<n;j++) {
				if(a[i]==a[j]) {
					visited[j]=true;
					count++;
				}
			}
			
			System.out.println(a[i]+" "+count);
		
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
	    Frequency(a,n);	
		
		

	}
}
