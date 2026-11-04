package methodstask;

public class largest {
		// TODO Auto-generated method stub
		 int main(int a,int b) {
			 if(a>b) {
				 System.out.println("a is largest");
				 return a;
			 }else {
				 System.out.println("b is largest");
				 return b;
			 }
		 }

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			largest e=new largest();
			int res=e.main(10,24);
			System.out.println(res);
		}
}
