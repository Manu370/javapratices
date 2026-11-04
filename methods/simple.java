package methodstask;
import java.util.*;
public class simple {
	 float p;
	 int t;
	 float r;
	 float si;
	 void values() {
		 Scanner sc =new Scanner(System.in);
		 System.out.println("enter the amount:");
		 p=sc.nextFloat();
		 System.out.println("enter the time:");
		 t=sc.nextInt();
		 r =5.0f;
	 }
	 void main() {
		  si=(p*r*t)/100;
	 }
	 float result() {
		 return si;
	 }
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		simple  s=new simple();
		s.values();
		s.main();
		float w=s.result();
		System.out.println(w);
	}

}
