package Thecodeworld;
import java.util.Arrays;
import java.util.Scanner;

public class A90_SortWordsAscending {
	//method 1
	static void ascending(String word) {
		
        char[] chars = word.toCharArray(); // Convert the string to a character array

        
        Arrays.sort(chars);// Sort the character array in ascending order

        // Convert the sorted character array back to a string
        String sortedWord = new String(chars);

        System.out.println( sortedWord);
        
	}
	
//method 2
	static void ascending1(String word) {
		
		 char[] ch = word.toCharArray();
		 
	        for (int i = 0; i < ch.length; i++) {
	        	
	            for (int j = i + 1; j < ch.length; j++) {
	            	
	                if (Character.toLowerCase(ch[i]) > Character.toLowerCase(ch[j])) {
	                	
	                char temp = ch[i];
	                
	                ch[i] = ch[j];
	                
	                ch[j] = temp;
	                }
	            }
	        }
	        String sortedWord = new String(ch);

	        System.out.println( sortedWord);
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        
        String word = sc.nextLine();
        
       ascending(word);
        

	}

}





