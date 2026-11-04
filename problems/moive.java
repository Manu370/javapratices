package problems;

import java.util.Scanner;

public class moive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the age:");
		int a=sc.nextInt();
        if(a<=12) {
        	System.out.println("100");
        }else if(a>12 && a<60) {
        	System.out.println("200");
        }else {
        	System.out.println("120");
        }
	}

}
