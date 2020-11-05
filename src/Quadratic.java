import java.util.Scanner;

public class Quadratic {

	public static void main(String[] args) {
		double secondRoot = 0 , firstRoot =0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a");
		double a = sc.nextDouble();
		
		System.out.println("Enter the value of b");
		double b = sc.nextDouble();
		
		System.out.println("Enter the value of c");
		double c = sc.nextDouble();

		double d = (b*b) - (4*a*c);
		double sqrt = Math.sqrt(d);
		
		if(d>0) {
			System.out.println("Roots are real");
			firstRoot = (-b+sqrt)/(2*a);
			secondRoot = (-b-sqrt)/(2*a);
			System.out.println("Roots are = " + firstRoot + "and " + secondRoot);
		} else if(d==0) {
			System.out.println("Root is " + (-b + sqrt)/(2*a));
		}else {
			System.out.println("Roots are complex");
			}
		
	}

}
