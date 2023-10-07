package Thecodeworld;

import java.util.Scanner;

public class _2_CharacterZ {
	
	static void print(char ch) {
		
		  if( ch>='A' && ch<='Z')  {
			  
       	   for(char i=ch; i<='Z';i++)
       		   
       		   System.out.print(i);
       	   
       }
       	   else if(ch>='a' && ch<='z') {
       		   
       	   for(char j=ch;j<='z';j++) 
       		   
       		   System.out.print(j);  	
       	
       }
       
	}
	
    public static void main(String[] args){
    	
        Scanner in=new Scanner(System.in);
        
        System.out.println("Enter the character: ");
        
        char ch=in.next().charAt(0);
        
        print(ch);
        
       /* boolean isUppercase=in.nextBoolean();
        for (char c = ch; c <= 'Z'; c++) {
            if (isUppercase) {
                System.out.print(Character.toUpperCase(c) + " ");
            } else {
                System.out.print(Character.toLowerCase(c)+ " ");
            }
        }
        */
      
       // for(char i=letter;i<=90;i++)
          

    }
}

