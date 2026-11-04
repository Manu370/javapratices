package problems;

import java.util.Scanner;

public class Bouns {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the salary:");
		double a=sc.nextDouble();
		 
		double bonus;
		if(a>50000) {
			bonus=a*10/100;
		}else {
			bonus=a*5/100;
		}
		System.out.println("bouns"+bonus);
	}
}
