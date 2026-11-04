package Strings;

public class marks3 {
	int z=10;
	void misplay() {
		int z=20;
		System.out.println(z);
		{
			int y=30;
			System.out.println(y);
			System.out.println(this.z);	
		}
		System.out.println(z);
        System.out.println(this.z);
	}


	public static void main(String[] args) {
		marks3 mc = new marks3();
		mc.misplay();
	}
}
