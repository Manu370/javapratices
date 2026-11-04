package problems;

import java.util.Scanner;

public class student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mar=80;
		int mar2=75;
		int mar3=70;
		double total=(mar+mar2+mar3)/3.0;
		if(mar>=35 && mar2>=35 && mar3>=35) {
			if(total>=75) {
				System.out.println("pass ");
			}else {
				System.out.println("fails");
			} 
		}else {
			System.out.println("failed");
		}
			
		}
}
