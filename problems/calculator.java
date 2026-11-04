package problems;

import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first number:");
		int a=sc.nextInt();
		System.out.println("enter the second number:");
		int b=sc.nextInt();
		System.out.println("enter the operator number:");
		char c=sc.next().charAt(0);
		
		switch(c) {
			case '+':
				System.out.println("result:"+ (a+b));
				break;
			case '-':
				System.out.println("result:"+ (a-b));
				break;
			case '*':
				System.out.println("result:"+ (a*b));
				break;
			case '/':
				System.out.println("result:"+ (a/b));
				break;
			default:
				System.out.println("fail");
		}
	}
}