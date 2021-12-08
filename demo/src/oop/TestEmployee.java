package oop;

class Employee {
	protected String name;
	protected int salary;

	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}

	public void print() {
		System.out.println(this.name);
		System.out.println(this.salary);
	}
}

class OnsiteEmployee extends Employee {
	protected int allowance;

	public OnsiteEmployee(String name, int salary, int allowance) {
		super(name, salary);
		this.allowance = allowance;
	}

	// Overriding
	public void print() {
		super.print();
		System.out.println(this.allowance);
	}

}

public class TestEmployee {

	public static void main(String[] args) {
		Employee e = new Employee("A", 90000);
		e.print();
		OnsiteEmployee oe = new OnsiteEmployee("B", 60000, 40000);
		oe.print();

	}

}
