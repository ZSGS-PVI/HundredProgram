package Thecodeworld;
import java.io.*;
import java.util.*;
public class A94_anagram {

	// JAVA program to check if two strings
	// are anagrams of each other

static int NO_OF_CHARS = 256;

static boolean areAnagram(char str1[], char str2[])
		{
			
			int count1[] = new int[NO_OF_CHARS];

			int count2[] = new int[NO_OF_CHARS];

			int i;

			for (i = 0; i < str1.length && i < str2.length;i++) {
				count1[str1[i]]++;
				count2[str2[i]]++;
			}

			
			if (str1.length != str2.length)
				return false;

			// Compare count arrays
			for (i = 0; i < NO_OF_CHARS; i++)
				if ((count1[i] !=  count2[i]))
					return false;

			return true;
		}

	
		public static void main(String args[])
		{
			
			  Scanner in=new Scanner(System.in);
			  
		       System.out.println("Enter the string");
		       
		       String str1=in.nextLine();
		       
		       String str2=in.nextLine();
		       
		       str1=str1.toLowerCase();
		       
				str2=str2.toLowerCase();
				
			char st1[] = str1.toCharArray();
			
			char st2[] =str2.toCharArray();

			
			if (areAnagram(st1, st2))
				
				System.out.println("The two strings are"
								+ " anagram of each other");
			else
				System.out.println("The two strings are not"
								+ " anagram of each other");
		}
	}

	
