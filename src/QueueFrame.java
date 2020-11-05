import java.util.Queue;
import java.util.LinkedList;


public class QueueFrame {
	
	

	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();
		
		queue.add("A");
		queue.add("B");
		queue.add("C");
		queue.add("D");
		
		System.out.println("Front element is" + queue.peek());
		
		queue.remove();
		queue.remove();
		
		System.out.println("Front element is" + queue.peek());
		
		System.out.println("Queue size is " + queue.size());
		
		if(queue.isEmpty()) {
			System.out.println("Queue isz empty");
		}
		System.out.println("Queue is not empty");

	}

}
