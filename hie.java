package inheritance;

public class hie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student1 s=new student1(22,"manoj",121,"cse");
		student2 s2=new student2(21,"gopi",131,"dsa");
         s.studying();
         s2.studyings();
	}
}
class personsss{
		int age;
		String name;
		personsss(int age,String name){
			this.age=age;
			this.name=name;
		}
		void talking() {
			System.out.println(" he is talking to"+name);
		}
	}
class student1 extends personsss{
	int id;
	String dept;
	student1(int age,String name,int id,String dept){
		super(age,name);
		this.id=id;
		this.dept=dept;
	}
	void studying() {
		System.out.println(" he is studing in"+ " "+dept);
		
	}
}
class student2 extends personsss{
	int id;
	String dept;
	student2(int age,String name,int id,String dept){
		super(age,name);
		this.id=id;
		this.dept=dept;
	}
	void studyings() {
		System.out.println(" he is studing in"+dept);
		
	}
}



