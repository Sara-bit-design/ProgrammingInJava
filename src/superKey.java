
class word {
	
	void message(){
		System.out.println("This is the super class");
	}
}

	class key extends word{
		void message() {
			System.out.println("This is the extended class");
		}
		
		void display() {
			message();
			super.message();
		}
	}
	
	
	public class superKey{
		public static void main(String[] args) {
			
			key obj = new key();
			obj.display();

				}
	}
	
	


