package Thecodeworld;

public class A97_binaryString {

	
	static String[] a = { "AAA", "BBB", "CCC", "DDD", "EEE", "FFF", "GGG" };
	static int first = 0;
	static int last = a.length - 1;
	static int mid;
	static String key = "CC";
	
	
	public static void main(String[] args) {
		
		System.out.println("Key Found at : " + stringBinarySearch() + " position");
	}
	
	public static int stringBinarySearch() {
		
		while (first <= last) {
			
			mid = (first+ last) / 2;
			
			if (a[mid].compareTo(key) < 0) { 
				
				first = mid + 1; 
				} 
			
			else if (a[mid].compareTo(key) > 0) {
				last = mid - 1;
				
			} 
			else 
			{
				return mid;
			}
		}
		return -1;
	}
}


