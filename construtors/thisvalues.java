package construtors;

public class thisvalues {
	int price;
	String brand;
	 thisvalues(int price,String brand){
		 this.brand=brand;
		 this.price=price;
	 }
	  void main(){
		  System.out.println(brand);
		  System.out.println(price);
	  }

	public static void main(String[] args) {
		thisvalues v=new thisvalues(200,"g");
		v.main();
	}
}

