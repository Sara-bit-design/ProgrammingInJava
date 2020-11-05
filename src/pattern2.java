public class pattern2 {
	static int sp=0;
	static void pattern(int n){
		for(int i=n;i>0;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			for(int j=0;j<sp;j++) {
				System.out.print("*");
			}
			for(int j=i;j>0;j--) {
				System.out.print(j);
			}
			sp+=2;
			System.out.println();
		}
	}
	public static void main(String[] args) {
		
		pattern(4);
	}
}
