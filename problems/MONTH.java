package problems;

import java.util.Scanner;

public class MONTH {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the month:");
		int a=sc.nextInt();
		
		switch(a) {
			case 1:
				System.out.println("result 30 days" );
				break;
			case 2:
				System.out.println("result 28 & 29");
				break;
			case 3:
				System.out.println("result 30");
				break;
			case 4:
				System.out.println("result 29");
				break;
			default:
				System.out.println("fail");
		}
	}

}
