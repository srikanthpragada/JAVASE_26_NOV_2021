package oop;

class Stack {
	private int[] data = new int[10];
	private int top = 0;

	public void push(int value) {
		this.data[this.top] = value;
		this.top++;
	}

	public int pop() {
		if (this.top == 0)
			throw new RuntimeException("Stack empty!");
		this.top--;
		return this.data[this.top];
	}

	public int peek() {
		return this.data[this.top];
	}

	public boolean isEmpty() {
		return this.top == 0;
	}

	public int length() {
		return this.top;
	}
}

public class TestStack {

	public static void main(String[] args) {
		var s = new Stack();
		System.out.println(s.pop());
		s.push(10);

	}

}
