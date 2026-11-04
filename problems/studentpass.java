package problems;

import java.util.Scanner;

public class studentpass{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the mark:");
		int a=sc.nextInt();
		
		if(a >=40){
			System.out.println(" student pass");
		}
		else if(a<40){
			System.out.println("student is fail");
		}
	}
}

