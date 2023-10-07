package Thecodeworld;

import java.util.Arrays;
import java.util.regex.Pattern;

public class A52_ReverseWords {
	
	public static String Reverse(String str) {
		
		Pattern pattern=Pattern.compile("\\s");
		
		String temp[]=pattern.split(str);
		
		String result=" ";
		
		for(int i=0;i<temp.length;i++) {
			
			if(i==temp.length-1)
				
				result=temp[i]+result;
			else
				result=" "+temp[i]+result;
		}
		return result;
	}

	public static void main(String[] args) {
		
		String str="I LOVE ARMY";
		System.out.println(Reverse(str));
		

	}

}
