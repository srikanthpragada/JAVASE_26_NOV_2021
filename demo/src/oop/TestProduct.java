package oop;

class Product {
	// Instance variables
	private String name;
	private double price;

	// Constructor
	public Product(String n, double p) {
		name = n;
		price = p;
	}

	// Methods
	public void print() {
		System.out.println(name);
		System.out.println(price);
	}

	public double getPrice() {
		return price;
	}

	public double getNetPrice() {
		return price + price * 0.12;
	}
}

public class TestProduct {

	public static void main(String[] args) {
		Product p1 = new Product("Dell XPS", 200000); // object
		// Product p2 = new Product();
		p1.print();
		System.out.println(p1.getNetPrice());

	}

}
