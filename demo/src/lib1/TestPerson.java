package lib1;

class Person extends Object{
	private String name;
	private int age;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	@Override 
	public String toString() {
		return this.name + "-" + this.age;
	}
}

public class TestPerson {

	public static void main(String[] args) {
		var p1 = new Person("A", 20);
		var p2 = new Person("A", 20);

		System.out.println(p1 == p2);
		System.out.println(p1.equals(p2));
		System.out.println(p1.toString());

	}

}
