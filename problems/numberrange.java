package problems;

import java.util.Scanner;

public class numberrange{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number:");
		int a=sc.nextInt();
		
		if(a >=100){
			System.out.println("high");
		}
		else if(a>51 && a<100){
			System.out.println("medium");
		}
		else if(a>0 && a<50){
			System.out.println("low");
		}else {
			System.out.println("fail");
		}
	}
}

