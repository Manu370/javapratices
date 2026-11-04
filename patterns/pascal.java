package patterns;

public class pascal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;

	    for (int i = 0; i < n; i++) {

	        // Spaces
	        for (int j = 1; j <= n - i; j++) {
	            System.out.print("  ");
	        }

	        int num = 1;

	        // Numbers
	        for (int k = 0; k <= i; k++) {

	            System.out.print(num + "   ");

	            num = num * (i - k) / (k + 1);
	        }

	        System.out.println();
	    }
	}
}
