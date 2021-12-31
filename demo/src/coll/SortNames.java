package coll;

import java.util.ArrayList;

public class SortNames {

	public static void main(String[] args) {
		 var al = new ArrayList<String>();
		 
		 al.add("Scott");
		 al.add("Tom");
		 al.add("Ben");
		 al.add("Mark");
		 
		 al.sort(null);  // Sort using Default Order
		 
		 for(var n : al)
			 System.out.println(n);
		 
	}

}
