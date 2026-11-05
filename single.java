package inheritance;

public class single {
	public static void main(String[] args) {
		student s= new student("manoj", 22, 170, 90);
		s.show2();
		s.show();
	}
}
	 class person{
		String name;
		int age;
		person(String name,int age){
			this.name=name;
			this.age=age;
		}
		void show() {
			System.out.println("my name is"+name);
		}	
	}
	class student extends person{
		int id;
		int marks;
		student(String name, int age, int id, int marks){
			super(name, age);
			this.id=id;
			this.marks=marks;	
		}
		void show2() {
			System.out.println(" my id is "+id);
		}
	}

