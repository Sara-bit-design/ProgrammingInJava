
public class thisKeyword {
	
	int a;
	int b; 
	 
	public void setData(int a , int b ) {
		this.a=a;
		this.b=b;
	}
	
	public void showData() {
		System.out.println("Value of a is " + a);
		System.out.println("Value of b is " + b);
	}

	public static void main(String[] args) {
		thisKeyword obj = new thisKeyword();
		obj.setData(2,3);
		obj.showData();

	}

}
