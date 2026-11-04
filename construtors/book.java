package construtors;

public class book {
	book(){
		System.out.println("no parameters");
	}
	book(String title){
		System.out.println(title);
	}
    book(String title,int price){
    	System.out.println(" parameters" + title+" "+price);
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		book b=new book("t",300);
		book b1=new book();
		book b2=new book("t");

	}

}
