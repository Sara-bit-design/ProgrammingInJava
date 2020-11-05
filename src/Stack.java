
class Stack {
	private int arr[];
	private int capacity;
	private int top;
	
	Stack( int size){
		arr = new int[size];
		capacity = size;
		top = -1;
	}
	
	public void push(int x) {
		if(isFull()) {
			System.out.println("Overflow\n Program Terminated\n");
			System.exit(1);
		}
		
		System.out.println("Inserting" + x);
		arr[++top] = x;
	}
	
	public int pop() {
		if(isEmpty()) {
			System.out.println("Underflow\n Program Terminated\n");
			System.exit(1);
		}
		System.out.println("Removing" + peek());
		return arr[top--];
	}
	
	public int peek() {
		if(!isEmpty()) {
			return arr[top];
		}
		System.exit(1);
		return -1;
	}
	
	public int size() {
		return top+1;
	}
	
	public Boolean isEmpty() {
		return top == -1;
		
	}
	public Boolean isFull() {
		return top == capacity -1;
	}

public static void main(String[] args) {
		Stack stack = new Stack(3);
		
		stack.push(1);
		stack.push(2);
		
		stack.pop();
		stack.pop();
		
		stack.push(3);
		
		System.out.println("Top element is " + stack.peek());
		System.out.println("Stack size is  " + stack.size());
		
		stack.pop();
		
		if(stack.isEmpty()) {
			System.out.println("Stack is empty");
			
		}
		
		System.out.println("Stack is not empty");
		


	}
}


	