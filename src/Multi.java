
public class Multi {
class multi extends Thread{
	public void run() {
		System.out.println("Thread is running");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
multi t1 = new multi();
t1.start();
	}

}
