package lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class SortUniqueNames {

	public static void main(String[] args) throws IOException {
		var lines = Files.lines(Paths.get("d:\\classroom\\nov26\\names.txt"));
		
		lines.filter(v -> v.trim().length() > 0 )  // ignore blank lines
			 .distinct()                           // Take unique values
			 .sorted()
			 //.forEach(System.out::println);
			 .forEach(n -> {
				 System.out.println(n.toUpperCase());
				 System.out.println(n.length());
			    }
			 );
		  
	}

}
