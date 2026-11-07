package encap;

class student12{
	private String name;
	private int id;
	private int marks;
	
	void setmain(String name,int id,int marks) {
		this.name=name;
		this.id=id;
		this.marks=marks;	
	}
	String getter() {
		return name;
	}
	int main3() {
		return id;
	}
	int main4() {
		return marks;
	}
	void display() {
		System.out.println(name);
		System.out.println(id);
		System.out.println(marks);
	}
	
}

public class student{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student12 s= new student12();
		s.setmain("manoj", 101,90);
		s.display();

	}

}
