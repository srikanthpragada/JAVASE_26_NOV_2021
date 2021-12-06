package oop;

class Circle {
	private int x, y, r;
	
	
	public Circle(int x, int y, int r) {
		super();
		this.x = x;
		this.y = y;
		this.r = r;
	}
	public double getArea() {
		return 3.14 * this.r * this.r;
	}
	public double getCircum() {
		return 2 * 3.14 * this.r;
	}
	public int getX() {
		return this.x;
	}
	public int getY() {
		return this.y;
	}
	public int getRadius() {
		return this.r;
	}
}

public class TestCircle {

	public static void main(String[] args) {
	   Circle c1 = new Circle(10,20,30);
	   System.out.println(c1.getArea());
	   Circle c2 = new Circle(10,10,20);
	   System.out.println(c2.getArea());

	}

}
