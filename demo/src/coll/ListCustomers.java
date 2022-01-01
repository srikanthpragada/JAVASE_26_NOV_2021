// Uses customers.txt with Name, Mobile 

package coll;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.TreeMap;

public class ListCustomers {

	public static void main(String[] args) throws Exception {
		var lines = Files.readAllLines(Path.of("d:\\classroom\\customers.txt"));
		var customers = new TreeMap<String, String>();

		for (String line : lines) {
			String parts[] = line.split(",");
			if(parts.length > 1)
			     customers.put(parts[1], parts[0]); // mobile and name
		}

		for (String mobile : customers.keySet())
			System.out.printf("%-10s  %s\n", mobile, customers.get(mobile));
	}

}
