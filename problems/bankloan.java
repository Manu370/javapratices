package problems;

import java.util.Scanner;

public class bankloan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the age:");
		int a=sc.nextInt();
		System.out.println("enter the salary:");
		double b=sc.nextDouble();
        if(a>=20  && a<=60) {
        	System.out.println(" enter age:"+a);
        	if(b>=25000) {
        		System.out.println(" enter salary:"+b);
        	}else {
        		System.out.println(" enter salary:"+b);
        	}
        }else {
        	System.out.println("loan rejected");
        }
	}

}
