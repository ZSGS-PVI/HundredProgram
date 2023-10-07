package Thecodeworld;

import java.util.Scanner;

public class A97_BinarySearch {
	
	public static int binarysearch(char arr[], char x) {
		
		int first=0,last=arr.length,res;
		
		while(first<=last) {
			
			int mid=first+(last)/2;
			
			for(int i=0;i<arr.length;i++) {
				
				if(x==arr[i]);
				
				  res=i;
		
			
			if(res==0)
				
				return mid;
			
			if(res<0)
				
				first=mid+1;
			
			else
				last=mid-1;
			}
		}
		return -1;	
	}
	

	public static void main(String[] args) {
		
		  Scanner in =new Scanner(System.in);
		  
	        System.out.println("Enter the string:");
	        
			String str=in.nextLine();
			
			 System.out.println("Enter the target:");
			 
			char target=in.next().charAt(0);
			
			int max=str.length();
			
			 char ch[]=str.toCharArray();
		
		int result=binarysearch(ch,target);

		
		if(result!=-1)
			System.out.println("Element found at index of "+result);
			
		else
			System.out.println("Element not present:");

	}

}

