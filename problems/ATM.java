package problems;

public class ATM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int balance=5000;
        int withdraw=2000;
            if(withdraw%100!=0) {
            	System.out.println("invaild amount");
            }else if (balance>=withdraw) {
            	System.out.println("transation ");
            }else {
            	System.out.println("fails");
            }
	}

}
