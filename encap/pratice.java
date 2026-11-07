package encap;

class demo{
	public int a;
	protected int b;
	int c;
	private int d;
	
	void setmain(int x) {
		this.d = x;
	}
	int getma2() {
		return d;
	}	
}
class pratice extends demo {
	 public static void main(String[]args) {
		 demo d=new demo();
		 System.out.println(d.a);
		 System.out.println(d.b);
		 System.out.println(d.c);
		 d.setmain(100);
		 System.out.println(d.getma2());
	 }

	}


