package basics;

public class FunctionsDemo {

	public static int add(int a, int b) {
		return a + b;
	}
	
	public static void greet(String ... names) {
		for(String name : names)
			System.out.println("Hi " + name);
	}

	public static void main(String[] args) {
		System.out.println(add(10, 20));
		greet("Bob","Steve","Mike");
		greet("Larry", "Mark");
		
	}

}
