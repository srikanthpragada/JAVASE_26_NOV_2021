package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class WriteNonBlank {

	public static void main(String[] args) throws Exception {

		var fr = new FileReader("d:\\classroom\\nov26\\names.txt");
		var br = new BufferedReader(fr);
		try (var fw = new FileWriter("d:\\classroom\\nov26\\new_names.txt")) {
			while (true) {
				var line = br.readLine();
				if (line == null)
					break;
				if (!line.isBlank())
					fw.write(line + "\n");
			}

		} // try 
		

	}

}
