package encap;

class bankaccount{
	
	private int balance;
	
	void deposit(int amount) {
		this.balance=amount;
		if(balance>0) {
			System.out.println("deposite amount:" + balance);
		}else {
			System.out.println("invaid amount");
		}
		
	}
	void withdraw(int amount) {
		if(amount > 0 && balance>=amount) {
			this.balance-=amount;
			System.out.println("withdraw:"+ balance);
		}else if(amount>balance) {
			System.out.println("insuffient amount");
		}else {
			System.out.println("invaild withdraw");
		}

		
	}
	int getbalance() {
		return balance;
		
	}
}

public class bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         bankaccount a= new bankaccount();
         a.deposit(50000);
         a.withdraw(20000);
         System.out.println(a.getbalance());
	}

}
