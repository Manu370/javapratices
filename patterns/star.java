package patterns;

public class star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        char c='A';
        char b='B';
        System.out.println(c+b);
		int n = 4;
		for (int i = 1; i <= n; i++) {
		    for (int j = 1; j <=n-i; j++) {
		        System.out.print(" ");
		    }
		    for(int k=1;k<=3*i-2;k++) {
		    System.out.print("* ");
		    }
		    System.out.println();
		}
        
        
	}

}
