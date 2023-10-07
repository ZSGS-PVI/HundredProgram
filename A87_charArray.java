package Thecodeworld;

//convert char array to string
public class A87_charArray {
	
	//method 1
	static void tostring(char arr[]) {
		
		StringBuilder s=new StringBuilder();
		
		for(int i=0;i<arr.length;i++) {
			
			s.append(arr[i]);
		}
		System.out.println(s);
	}
	//method 2
	static void tostring1(char arr[]) {
		
		  String s=new String(arr);
		  
				System.out.println(s);
		}

	public static void main(String[] args) {
		
		char arr[]= {'J','A','V','A','W','O','R','L','D'};
		
         tostring(arr);
	}
}


