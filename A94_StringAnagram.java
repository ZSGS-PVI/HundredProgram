package Thecodeworld;

import java.util.Arrays;
import java.util.Scanner;

public class A94_StringAnagram {
	
	static void anagram(String str1,String str2) {
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		 if(str1.length()==str2.length()) {
			 char[] charArray1=str1.toCharArray();
			 char[] charArray2=str2.toCharArray();
			 
			 Arrays.sort(charArray1);
			 Arrays.sort(charArray2);
			 
			 boolean result=Arrays.equals(charArray1,charArray2);
			 
			 if(result) {
				 System.out.println(str1+ " and "+ str2 +" are anagaram");
			 }
			 else
			 {
				 System.out.println(str1+ " and "+ str2+"are not anagaram"); 
			 }
		 }
		 else
		 {
			 System.out.println(str1+ " and "+ str2+"are anagaram");
		 }

		
	}
	

	public static void main(String[] args) {
		  Scanner in=new Scanner(System.in);
	       System.out.println("Enter the string");
	       String str1=in.nextLine();
	       String str2=in.nextLine();
	       
	       anagram(str1,str2);
		
		
	}

}
/*import java.util.Arrays;
import java.util.Scanner;

public class SortWordAscending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = sc.nextLine();

        // Convert the string to a character array
        char[] chars = word.toCharArray();

        // Sort the character array in ascending order
        Arrays.sort(chars);

        // Convert the sorted character array back to a string
        String sortedWord = new String(chars);

        System.out.println("The sorted word in ascending order is: " + sortedWord);

     

    }
}

 */
