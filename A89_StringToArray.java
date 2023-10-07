package Thecodeworld;
import java.util.ArrayList;

public class A89_StringToArray {

	
	public static void main(String[] args) {
	
		ArrayList<String> list=new ArrayList<String>();
		
		list.add("HELLO");
		
		list.add("THIS");
		
		list.add("IS");
		
		list.add("JAVA");
		
		int listsize=list.size();
		
		String[] strArray=new String[listsize];
		
		list.toArray(strArray);
		
		for(int i=0;i<strArray.length;i++) {
			
			System.out.println(strArray[i]);
		}

	}

}


 
