class Adder {
	static int add(int a, int b) {
		return a+b; }
	static float add(int a , int b , int c) {
		return a+b+c;
	}
}
public class TestOverloading {

	public static void main(String[] args) {
		System.out.println(Adder.add(11, 11));
		System.out.println(Adder.add(23 , 13));

	}

}
