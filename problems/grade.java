package problems;

import java.util.Scanner;

public class grade{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the mark:");
		int a=sc.nextInt();
		
		if(a >=90){
			System.out.println("A");
		}
		else if(a>70 && a<89){
			System.out.println("b");
		}
		else if(a>50 && a<69){
			System.out.println("c");
		}else {
			System.out.println("fail");
		}
	}
}
