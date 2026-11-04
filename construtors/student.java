package construtors;

public class student {
	int id;
	String name;
	 student(int id,String name){
		 this.id=id;
		 this.name=name;
	 }
	  void main(){
		  System.out.println(id);
		  System.out.println(name);
	  }

	public static void main(String[] args) {
		student s=new student(1,"manoj"); 
		System.out.println(s.id);
		System.out.println(s.name);
		student s1=new student(2,"mahesh");
		s1.main();
	}
}
