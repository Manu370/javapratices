package forloopsstask;

public class fibnocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a=0;
        int b=1;
        int c;
        for(int i=1;i<=7;i++) {
        	System.out.println(a+" ");
        	c=a+b;
        	a=b;
        	b=c;
        }
	}

}
