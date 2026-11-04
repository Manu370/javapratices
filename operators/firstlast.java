package operators;

public class firstlast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int num=12345;
        int last=num%10;
        while(num>=10) {
        	num=num/10;
        }
        int first=num;
        int c=first+last;
        System.out.println(c);
	}
}
