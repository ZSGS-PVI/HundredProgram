package Thecodeworld;
import java.util.*;
import java.lang.*;
import java.util.Scanner;
public class A54_OddPositionDesecnding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the inputs:");
		int inputCount=in.nextInt();
		int odd[]=new int[100];
		int even[]=new int[100];
		int oddit=0,evenit=0;
		for(int i=0;i<inputCount;i++) {
			if(i%2!=0) {
				even[evenit]=in.nextInt();
				evenit++;
			}
			else
			{
				odd[oddit]=in.nextInt();
				oddit++;
			}
		}
		//Descending odd elements
		for(int i=0;i<oddit-1;i++) {
			for(int j=i+1;j<oddit;j++) {
				if(odd[i]<odd[j]) {
					int temp=odd[i];
					odd[i]=odd[j];
					odd[j]=temp;
				}
			}
		}
		//Ascending even elements
		for(int i=0;i<evenit-1;i++) {
			for(int j=i+1;j<evenit;j++) {
				if(even[i]>even[j]) {
					int temp=even[i];
					even[i]=even[j];
					even[j]=temp;
				}
			}
		}
		int limit =oddit>evenit?oddit:evenit;
		for(int i=0;i<limit;i++) {
			if(i<oddit)
				System.out.print(" "+odd[i]);
			if(i<evenit)
				System.out.print(" "+even[i]);
		}
	}

		}

	
