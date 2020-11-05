import java.util.Stack;
public class stackFrame {
	

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String> ();
		
		stack.push("A");
		stack.push("B");
		stack.push("C");
		stack.push("D");
		
		System.out.println("Top element is " + stack.peek());
		
		stack.pop();
		stack.pop();
		
		System.out.println("Size of stack is " + stack.size());
		
		if(stack.isEmpty()) {
			System.out.println("Stack is empty");
		}
		System.out.println("Stasck is not empty");

	}

}
