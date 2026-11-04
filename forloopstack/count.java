package forloopsstask;

public class count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int even=0;
        int odd=0;
        for(int i=1; i<=5;i++) {
        	if(i%2==0) {
        		even++;
        	}else {
        		odd++;
        	}
        	
        }
        System.out.println(even);
        System.out.println(odd);
	}

}
