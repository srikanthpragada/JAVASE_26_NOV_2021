package coll;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.TreeSet;

public class SortNamesFromFile {

	public static void main(String[] args) throws IOException {
		try (var fr = new FileReader("d:\\classroom\\nov26\\names.txt")) {
			var br = new BufferedReader(fr);
			var names = new TreeSet<String>();

			while (true) {
				String name = br.readLine();
				if (name == null)
					break;

				names.add(name);
			}

			br.close();

			for (String name : names)
				System.out.println(name);

		}
	}

}
