package oop2;

import java.util.Arrays;

class Person implements Comparable<Person> {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Person other) {
		return this.age - other.age;
	}
	
	public String toString() {
		return this.name + " - " + this.age;
	}
}

public class TestComparable {

	public static void main(String[] args) {
		Person [] people = {
				new Person("A", 20),
				new Person("C", 18),
				new Person("B", 25)
		};
		
		Arrays.sort(people);
		
		for(var p : people)
			System.out.println(p);
		
		/*
		var p1 = new Person("A", 20);
		var p2 = new Person("B", 25);
		System.out.println(p1.compareTo(p2));
		*/

	}

}
