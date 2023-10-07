package Thecodeworld;
import java.util.Scanner;
public class _4_BitwiseOPerator {
	
	static void print(int a,int b,String operator) {
		switch(operator) {
	
		case "&":
			     
				System.out.println("a&b= "+(a&b));   //0101 & 0111=0101=5
				
				break;
			
		case "|":	
			       
				System.out.println("a|b= "+(a|b));  //0101 | 0111=0101=7
				
			   break;
			   
		case "^":
			     
				System.out.println("a^b= "+(a^b));    //0101 ^ 0111=0101=2
				
				  break;
				  
		case"~":	
			 
				
				System.out.println("~a= "+ ~a);  //~ 00000101= 11111010=-6
				
				   break;
				   
	   default:
		   
		 System.out.println("Enter the valid operators only:");

	}
	}

	public static void main(String[] args) {
		
     Scanner in=new Scanner(System.in);
     
        System.out.println("Enter the operator:");
        
	    String operator=in.nextLine();
	    
        System.out.println("Enter the a value:");
        
		int a=in.nextInt();
		
		System.out.println("Enter the b value:");
		
		int b=in.nextInt();
		
	
		print(a,b,operator);
		
	}

}
