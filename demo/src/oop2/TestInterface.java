package oop2;

interface Printable {
	// static and final variable 
	int PAGESIZE = 20;
	// abstract methods 
	void print(); 
}

class MyPrint implements Printable  {

	@Override
	public void print() {
	
	}
	
}

public class TestInterface {

	public static void main(String[] args) {
		System.out.println(MyPrint.PAGESIZE);
		System.out.println(Printable.PAGESIZE);

	}

}

