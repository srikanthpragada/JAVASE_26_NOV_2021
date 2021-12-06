package oop;

class Product {
	// Instance variables
	private String name;
	private double price;
	private int qoh;

	// Constructor
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
		this.qoh = 0;
	}

	public Product(String name, double price, int qoh) {
		this(name,price); // Call another constructor 
		this.qoh = qoh;
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
	
	public void purchase(int qty) {
		qoh += qty;
	}
	public void sell(int qty) {
		qoh -= qty;
	}
}

public class TestProduct {

	public static void main(String[] args) {
		Product p1 = new Product("Dell XPS", 200000); // object
		Product p2 = new Product("iPhone 13", 120000,10);
		p1.print();
		System.out.println(p1.getNetPrice());

	}

}
