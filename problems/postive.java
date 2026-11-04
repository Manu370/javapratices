package problems;

import java.util.*;

public class postive {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first number:");
		int a=sc.nextInt();
		
		if(a > 0){
			System.out.println(a+"is postive");
		}
		else if(a<0){
			System.out.println(a+"is negative");
		}else {
			System.out.println(a+"is a zero");
		}
	}
}

