package coll;

import java.util.ArrayList;

public class GenericsDemo {

	public static void main(String[] args) {
		var names = new ArrayList();

		var al = new ArrayList<String>();
		var marks = new ArrayList<Integer>();

		al.add("Abc"); // String
		marks.add(10); // Integer

		String s = al.get(1);
	}

}
