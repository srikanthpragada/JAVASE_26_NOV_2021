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
	public int getSalary() {
		return this.salary;
	}
}

class OnsiteEmployee extends Employee {
	protected int allowance;

	public OnsiteEmployee(String name, int salary, int allowance) {
		super(name, salary);
		this.allowance = allowance;
	}

	// Overriding
	@Override 
	public void print() {
		super.print();
		System.out.println(this.allowance);
	}
	@Override 
	public int getSalary() {
		return  this.salary + this.allowance;
	}
}

public class TestEmployee {

	public static void main(String[] args) {
//		Employee e = new Employee("A", 90000);
//		e.print();
//		System.out.println(e.getSalary());
//		OnsiteEmployee oe = new OnsiteEmployee("B", 60000, 40000);
//		oe.print();
//		System.out.println(oe.getSalary());
		
		OnsiteEmployee onsite;
		Employee emp;
		
		emp = new Employee("E1", 50000);
		if (emp instanceof OnsiteEmployee)
		    onsite = (OnsiteEmployee) emp;
		

	}

}
