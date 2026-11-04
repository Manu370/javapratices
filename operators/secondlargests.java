package operators;

public class secondlargests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {23,34,56,54,76};
        int largest=arr[0];
        int secondlargest=arr[0];

        for(int i=0;i<arr.length;i++) {
        	if(arr[i]>largest) {
        		secondlargest=largest;
        		largest=arr[i];
        		
        		
        	}
        }
        System.out.println(secondlargest);
	}

}
