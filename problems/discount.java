package problems;

import java.util.Scanner;

public class discount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the amount:");
		int a=sc.nextInt();
	    int discount;
		if(a>=5000) {
			discount=(20*a)/100;
			a+=discount;
		}else if (a>=2000 && a<5000) {
			discount=(10*a)/100;
			a+=discount;
		}else if(a<2000) {
			discount=(5*a)/100;
			a+=discount;
		}
		System.out.println("amount = " + a);
		
	}

}
