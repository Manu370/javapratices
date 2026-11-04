package forloopsstask;

public class min {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		// TODO Auto-generated method stub
        int arr[]= {10,5,20,2};
        int min=arr[0];
        for(int i=0;i<arr.length;i++) {
        	if(min>arr[i]) {
        		min=arr[i];
        	}
        }
        System.out.println("min number:"+ min);
	}
}
