package oop;

abstract class Person {
	private String name;
	public Person(String name) {
		this.name = name;
	}
	public void print() {
		System.out.println(this.name);
	}
	
	abstract public String getOccupation();
}

class Student extends Person {
	private String course;
	public Student(String name, String course) {
		super(name);
		this.course = course;
	}
	public void print() {
		super.print();
		System.out.println(this.course);
	}
	
	public String getOccupation() {
		return "Studying " + this.course; 
	}
}

class Teacher extends Person {
	private String subject;
	public Teacher(String name, String subject) {
		super(name);
		this.subject = subject;
	}
	public void print() {
		super.print();
		System.out.println(this.subject);
	}
	public String getOccupation() {
		return "Teaching " + this.subject; 
	}
}


public class TestPerson {
	public static void main(String[] args) {
		 Person p;
		 p = new Student("Mark","Java");
		 p.print();  // Runtime polymorphism
		 System.out.println(p.getOccupation());
		 
		 p = new Teacher("Joe","Java");
		 p.print(); 
	}
}
