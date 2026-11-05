package inheritance;

public class sprial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int[][]arr= new int[n][n];
		int top=0;
		int bottom=n-1;
		int left=0;
		int right=n-1;
		int num=1;
		while((left<=right) && (top<=bottom)) {
			//left to right
			for(int i=left; i<=right; i++) {
				arr[top][i]= num;
				num++;
			}
			top++;
			for(int i=top;i<=bottom;i++) {
				arr[i][right]=num;
				num++;
			}
			right--;
			for(int i=right;i>=left;i--) {
				arr[bottom][i]=num;
				num++;
			}
			bottom--;
			for(int i=bottom;i>=top;i--) {
				arr[i][left]=num;
				num++;
			}
			left++;
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(arr[i][j] + " \t");
			}
			System.out.println();
		}

	}

}
