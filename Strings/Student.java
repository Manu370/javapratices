package Strings;

public class Student {
	String name="Rahul";
	int marks=90;
	
	void display(){
		System.out.println(name);
		System.out.println(marks);
	}

	public static void main(String[] args){
		Student  s= new Student();
		s.display();
	}
}
