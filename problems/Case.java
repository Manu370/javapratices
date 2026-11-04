package problems;

import java.util.Scanner;

public class Case {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a character: ");
	        char ch = sc.next().charAt(0);

	        if ((ch >= 'A' && ch <= 'Z')) {
	            System.out.println("uppercase");
	        } else if (ch >= 'a' && ch <= 'z') {
	            System.out.println("lowercase");
	        } else {
	            System.out.println(" not a Special Character");
	        }
	}
}

