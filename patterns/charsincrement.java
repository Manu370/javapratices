package patterns;

public class charsincrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch='A';
		int n = 4;
		for (int i = 1; i <= n; i++) {
		    for (int j = 1; j <=n-i; j++) {
		        System.out.print(" ");
		    }
		    for(int k=1;k<=i;k++) {
		    System.out.print(ch+" ");
		    ch++;
		    }
		    System.out.println();
		}
	}

}
