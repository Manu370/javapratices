package operators;

public class spynumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int  n=1124;
        int sum=0;
        int pro=1;
        for( int i=n;i>0; i=i/10) {
        	int digit=i%10;
        	sum=sum+digit;
        	pro=pro*digit;
        }
        if(sum==pro) {
        	System.out.println("spy number");
        }else {
        	System.out.println(" not a spy number");
        	
        }
        
	}

}
