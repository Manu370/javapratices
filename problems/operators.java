package problems;

import java.util.Scanner;

public class operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first number:");
		int a=sc.nextInt();
		System.out.println("enter the second number:");
		int b=sc.nextInt();
		System.out.println("enter the operators:");
		char c=sc.next().charAt(0);
		
		if(c=='+'){
			System.out.println("add"+ (a+b));
		}
		else if(c=='-'){
			System.out.println("sub" + (a-b));
		}else if(c=='*'){
			System.out.println("mul" + (a*b));
		}else if(c=='/'){
			System.out.println("div" + (a/b));
		}else {
			System.out.println("invaild operator");
		}
	}
}
