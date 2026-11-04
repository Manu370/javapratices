package patterns;

public class Rowletters {

	public static void main(String[] args) {
		for (int i = 1; i <= 3; i++) {
		    for (int j = 1; j <= 3; j++) {
		        System.out.print((char) ('A' + j - 1) + " ");
		    }
		    System.out.println();
		}
	}

}
