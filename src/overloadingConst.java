
public class overloadingConst {
	
	overloadingConst(String name){
		System.out.println("Greetings! I am " + name);
	}
	
	overloadingConst(String name , int age){
		System.out.println("Greetings! I am " + name + " and I am " + age + " years old");
	}
	
	overloadingConst(String name , int age , String field){
		System.out.println("Greetings! I am " + name + " and I am " + age + " years old. I am a " + field);
	}

	public static void main(String[] args) {
		
		overloadingConst obj1 = new overloadingConst("Sara Dhingra");
		overloadingConst obj2 = new overloadingConst("Sara Dhingra" , 21);
		overloadingConst obj3 = new overloadingConst("Sara Dhingra" , 21 , "Full-Stack-Developer");

	}

}
