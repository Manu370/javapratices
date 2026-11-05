package inheritance;

public class multi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		manager m= new manager("manoj",22,1200,123,90);
              m.show();
              m.money();
              m.show2();
        employee e= new employee("gopi",22,1300);
        e.money();
        e.show();
        person p=new person("mahesh",22);
        p.show();
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
class employee extends person{
	int salary;
	employee(String name, int age,int salary){
		super(name,age);
		this.salary=salary;
	}
	void money() {
		System.out.println("my salary is "+ salary);
	}
}
class manager extends employee{
	int id;
	int marks;
	String dept;
	manager(String name, int age,int salary, int id, int marks){
		super(name, age, salary);
		this.id=id;
		this.marks=marks;	
	}
	void show2() {
		System.out.println(" my id is "+id);
	}
}



