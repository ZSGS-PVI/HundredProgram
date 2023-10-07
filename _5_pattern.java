package Thecodeworld;
//pattern printing
import java.util.Scanner;
public class _5_pattern {
	
	static void print(char ch) {
		
		  if( ch>='A' && ch<='Z') {
			  
		for(char i=ch;i>='A';i--) {
			
			for(char j='A';j<=i;j++) {
				
				System.out.print(i);
			}
			System.out.println();
		}
	}
		  else if(ch>='a' && ch<='z') {
			  
				for(char i=ch;i>='a';i--) {
					
					for(char j='a';j<=i;j++) {
						
						System.out.print(i);
					}
					System.out.println();
				}
		  }
		 
	}
	
    public static void main(String[] args) {
    	
    	Scanner in=new Scanner(System.in);
    	
    	System.out.println("Enter the character:");
    	
    	char ch=in.next().charAt(0);
    	
    	print(ch);



    }
}
