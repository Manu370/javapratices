package forloopsstask;

public class average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {10,20,30};
		int avr=0;
		for(int i=0;i<arr.length;i++) {
			avr+=arr[i];
		}
		float s=avr/arr.length;
		System.out.println(s);

	}

}
