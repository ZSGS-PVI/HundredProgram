package Thecodeworld;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class A89_stringtoarray1 {
	
	public static String[] sentenceToWords(String sentence) {
		
	    List<String> words = new ArrayList<String>();
	    
	    StringBuilder sb = new StringBuilder();
	    
	    for (int i = 0; i < sentence.length(); i++) {
	    	
	        char c = sentence.charAt(i);
	        
	        if (c == ' ') {
	        	
	            words.add(sb.toString());
	            
	            sb.setLength(0);
	            
	        } else {
	        	
	            sb.append(c);
	        }
	    }
	    if (sb.length() > 0) {
	    	
	        words.add(sb.toString());
	    }
	    return words.toArray(new String[0]);
	}

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a word: ");
	        
	        String s = sc.nextLine();
	        
	     String[] words = sentenceToWords(s);
	     
	       System.out.println(Arrays.toString(words));
	}
	}




