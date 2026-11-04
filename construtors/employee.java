package construtors;

public class employee {
	int salary;
	String name;
	 employee(){
	   System.out.println("Employee constructor called");
		
	 }
	

	public static void main(String[] args) {
		employee e=new employee();
		System.out.println("Employee Name: " + e.name);
		System.out.println("Employee Salary: " + e.salary);
	}

}
