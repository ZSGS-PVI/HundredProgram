package Thecodeworld;

class student{
	
	int rollno;
	
	String name;
	
	static String college="GCE";
	
	student(int r,String n){
		
		rollno=r;
		
		name=n;
	}
	void display() {
		
		System.out.println(rollno+" "+name+" "+college);
	}
}

public class _8_StaticKeyword {
	

	public static void main(String[] args) {
		
     student s1=new student(21,"vikram");
     
     student s2=new student(23,"devi");
     
     s1.display();
     
     s2.display();


	}

}
