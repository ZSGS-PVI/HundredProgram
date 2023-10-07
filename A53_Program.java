package Thecodeworld;
import java.util.Scanner;
//import java.util.HashMap;
public class A53_Program {




	  public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    System.out.print("Enter input string: ");
	    String inputString = input.nextLine();

	    String outputString = "";
	    int i = 0;

	    while (i < inputString.length()) {
	      char currentChar = inputString.charAt(i);
	      i++;

	      int count = 0;
	      while (i < inputString.length() && Character.isDigit(inputString.charAt(i))) {
	        count = count * 10 + Character.getNumericValue(inputString.charAt(i));
	        i++;
	      }

	      for (int j = 1; j <= count; j++) {
	        outputString += currentChar;
	      }
	    }

	    System.out.println(outputString);
	  }
	}



