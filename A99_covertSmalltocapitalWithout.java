package Thecodeworld;
 
import java.util.Scanner;

//convert all small letter to capital

public class A99_covertSmalltocapitalWithout {
	
	//method 1
	
	static void smalltocaps(char strArr[]) {
		
		for(int i=0;i<strArr.length;i++) {
			
			if(strArr[i]>='a' && strArr[i]<='z') {
				
				strArr[i]=(char)((int) strArr[i]-32);
			}
		}
	
		for(int i=0;i<strArr.length;i++) {
			
			System.out.print(strArr[i]);
		}
	}
		
		//method 2
	
		static void caps(String str) {
			
		 StringBuilder sb = new StringBuilder();

	        // loop through each character in the string
		 
	        for (int i = 0; i < str.length(); i++) {
	        	
	            char c = str.charAt(i);

	            if (c >= 'a' && c <= 'z') {


	                c = (char) (c - 32);
	            }

            sb.append(c);
        }

        //String newStr = sb.toString();
        
        System.out.println(sb);
    

	}

	public static void main(String[] args) {

          Scanner in =new Scanner(System.in);
          
          System.out.println("enter the string :");
          
          String str=in.nextLine();
          
         // caps(str);
          
		char strArr[]=str.toCharArray();
		
		smalltocaps(strArr);
		
		
	}

}


