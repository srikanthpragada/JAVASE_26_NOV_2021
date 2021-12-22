package oop2;

public class AssertTest {

	public static int add(int a, int b) {
		return a + a;
	}

	public static void main(String[] args) {
		assert add(10, 20) == 30 : "Invalid return value from add()";

	}

}
