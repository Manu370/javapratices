package methodstask;

public class swap {
	int a=10;
	int b=20;
	 void swaps(){
		System.out.println("after swapping");
		
		int temp=a;
		a=b;
		b=temp;
		System.out.println((a) +" "+ (b));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		swap s=new swap();
		s.swaps();

	}

}
