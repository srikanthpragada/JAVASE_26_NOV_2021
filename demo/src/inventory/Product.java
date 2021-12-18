package inventory;

public class Product {
    private int a;
    protected int b;
    int c;  // default - package access 
    // private Currency cur;
}

// Package access 
class Sale {
     public Sale() {
    	 Product p = new Product();
    	 p.b = 10;
    	 p.c = 100; 
     }
}