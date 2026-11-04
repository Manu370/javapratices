package problems;

import java.util.*;

public class sum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the numbers:");
		int a=scan.nextInt();
		 
		if (a%2==0) {
			System.out.println("even");
		}else {
			System.out.println("odd");
		}
	}
}