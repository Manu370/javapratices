package problems;

import java.util.Scanner;

public class voting{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the numbers:");
		int a=scan.nextInt();
		 
		if (a>=18) {
			System.out.println("vote");
		}else {
			System.out.println("not vote");
		}
	}
}
