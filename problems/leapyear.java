package problems;

import java.util.Scanner;

public class leapyear{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the year:");
		int a=sc.nextInt();
		
		if(a%400 == 0){
			System.out.println("is leap year");
		}
		else {
			System.out.println("is not a leap year");
		}
	}
}
