package Thecodeworld;

import java.util.Arrays;

import java.util.Scanner;

public class A92_sortAscendingUsingRecursion {

	public static String sort(String s) {
		
		if (s.length() < 2) {
			
	        return s;
	    }

	    int pos = 0;
	    
	    char min = s.charAt(pos);
	    
	    for(int i = 1; i < s.length(); i++) {
	    	
	        char c = s.charAt(i);
	        
	        if (c < min) {
	        	
	            min = c;
	            
	           pos = i;
	        }
	    }

	    //System.out.printf("%c | %s\n", min, s.substring(0, pos) + s.substring(pos + 1));

	    return min + sort(s.substring(0, pos) + s.substring(pos + 1));
	}
	public static String sort1(String str) {
		
	    if (str.length() < 2) {
	    	
	        return str;
	    }
	    char ch = str.charAt(0);
	    
	    String lesser = "";
	    
	    String greater = "";
	    
	    for (int i = 1; i < str.length(); i++) {
	    	
	        char current = str.charAt(i);
	        
	        if (current <= ch) {
	        	
	            lesser += current;
	        } else {
	            greater += current;
	        }
	    }
	    return sort1(lesser) +ch + sort1(greater);
	}


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        
        String s = sc.nextLine();
       
		String result=sort(s);
		
       System.out.println(result);

		

	}

}


