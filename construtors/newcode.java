package construtors;

public class newcode {
	int a;
	int b;
    void main(int a,int b) {
    	this.a=a;
    	this.b=b;
    	
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		newcode n= new newcode();
		n.a=10;
		n.b=20;
		n.main(10,20);
		// TODO Auto-generated method stub

	}

}
