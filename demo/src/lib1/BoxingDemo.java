package lib1;

public class BoxingDemo {

	public static void fun1(Integer obj) {
		System.out.println(obj.getClass());
		System.out.println(obj.hashCode());
		System.out.println(obj.intValue() + 10); // Unboxing
		System.out.println(obj + 10); // Autounboxing
	}

	public static void fun2(Object obj) {
		System.out.println(obj.getClass());
		System.out.println(obj.hashCode());
	}

	public static void main(String[] args) {
		fun1(10); // Autoboxing
		fun2(100);
		fun2(10.50);

	}

}
