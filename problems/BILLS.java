package problems;

import java.util.*;

public class BILLS {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the units");
		int a=sc.nextInt();
		int bill;
		if(a<=100) {
			bill=a*1;
		}else if (a<=200) {
			bill=a*2;
		}else {
			bill=a*3;
		}
		System.out.println("bills = "+ bill);
	}

}
