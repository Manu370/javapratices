package problems;

import java.util.Scanner;

public class age {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the age:");
		int a=sc.nextInt();
        if(a>=18) {
        	System.out.println("adult");
        }else {
        	System.out.println("child10");
        }
	}

}
