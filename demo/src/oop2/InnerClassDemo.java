package oop2;

class Outer {
	private int a = 100;

	class Inner  {
	   public void print() {
		   System.out.println(a); // Private variable of outer class 
	   }
	}
	
	public void m() {
		class Local  {
		     public void print() {
		    	 
		     }
		}
		
		var obj = new Local();
		obj.print(); 
	}
}

public class InnerClassDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
}
