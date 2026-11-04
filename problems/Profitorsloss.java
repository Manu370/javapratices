package problems;

import java.util.Scanner;

public class Profitorsloss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the cost price:");
		int a=sc.nextInt();
		System.out.println("enter the selling price:");
		int b=sc.nextInt();
		int c=b-a;
		int d=a-b;
		if(b > a){
			System.out.println("profit"+ c);
		}
		else if(a>b){
			System.out.println("loss"+d);
		}else {
			System.out.println("is no loss");
		}
	}
}
