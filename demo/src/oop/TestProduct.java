package oop;

class Product {
	// Instance variables
	private String name;
	private double price;
	private int qoh;
	// Class variable / static variable
	private static int taxrate = 12;

	public static int getTaxrate() {
		return Product.taxrate;
	}

	// Constructor
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
		this.qoh = 0;
	}

	public Product(String name, double price, int qoh) {
		this(name, price); // Call another constructor
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
		return price + (price * Product.taxrate / 100);
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
		System.out.println(Product.getTaxrate());
		Product p1 = new Product("Dell XPS", 200000); // object
		Product p2 = new Product("iPhone 13", 120000, 10);
		p1.print();
		System.out.println(p1.getNetPrice());

	}

}
