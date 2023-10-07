package Thecodeworld;
import java.util.Scanner;
public class A95_stringPlindrome {
	
	static void reverse(String str) {
		
		String reversestr="";
		
		int strlength=str.length();
		
		for(int i=(strlength-1);i>=0;i--) {
			
			reversestr=reversestr + str.charAt(i);
		}
		if(str.toLowerCase().equals(reversestr.toLowerCase())) {
			
			System.out.println(str+" is a Palindrome string");
		}
		else {
			System.out.println(str+" is not a Palindrome string");
		}
	}
	
	static void reverse1(String str) {
		
		// Remove all spaces from the string and convert to lowercase
		
        str = str.replaceAll("\\s", "").toLowerCase();

        // Check if the string is a palindrome using StringBuilder
        
        StringBuilder sb = new StringBuilder(str);
        
        sb.reverse();
        
        String reversedStr = sb.toString();
        
        if (str.equals(reversedStr)) {
        	
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
		
	}

	public static void main(String[] args) {

       Scanner in=new Scanner(System.in);
       
       System.out.println("Enter the string");
       
       String str=in.nextLine();
		
		reverse(str);

	}

}




