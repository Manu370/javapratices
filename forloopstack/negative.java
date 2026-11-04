package forloopsstask;

public class negative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[]= {10,-20,-2,20,-3,50};
         for(int i=0;i<arr.length; i++) {
        	 if(arr[i]<0) {
        		 arr[i]=0;
        	 }
         }
         for(int i=0; i<arr.length; i++) {
      System.out.print(arr[i]+" ");
         }
	}

}
