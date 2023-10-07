package Thecodeworld;
//find ASCII value of character
import java.util.Scanner;
public class A24_ASCII {
	
   static void value(char ch) {
	   
	   if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z')) {
		   
           int value = (int ) ch;
           
           System.out.println( ch +" - "+ value);

       }
       else{
    	   
           System.out.println("Type only alphabet.");
       }
   }


 public static void main(String[] args){
	 
   Scanner in=new Scanner(System.in);
   
    System.out.println("Enter the character:");
    
    char ch=in.next().charAt(0);
    
    value(ch);
	     
	    }
	}
