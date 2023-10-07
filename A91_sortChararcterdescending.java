package Thecodeworld;

import java.util.*;

public class A91_sortChararcterdescending {
	
	
	public static void sortdescending(String str) {
		
		char[] ch = str.toCharArray();
		
        for (int i = 0; i < ch.length; i++) {
        	
            for (int j = i + 1; j < ch.length; j++) {
            	
                if (Character.toLowerCase(ch[i]) < Character.toLowerCase(ch[j])) {
                	
                char temp = ch[i];
                
                ch[i] = ch[j];
                
                ch[j] = temp;
                
                }
            }
        }
        String sortedWord = new String(ch);

        System.out.println( sortedWord);
}
	
	public static void  sortdescending1(String word) {
		
		 char[] chars = word.toCharArray();

	        Arrays.sort(chars);
	        
	        String ch=new String(chars);
	        
	      StringBuilder sortedWord = new StringBuilder(ch);
	      
	      StringBuilder k= sortedWord.reverse();

	      System.out.println( k);

		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        
        String s = sc.nextLine();
       
        sortdescending1(s);


		

	}

}
/*import java.util.Arrays;
import java.util.Scanner;

public class SortCharsInWordDescending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = sc.nextLine();

        // Convert the string to a character array
       
    }
}

 */
