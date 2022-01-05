package streams;

import java.nio.file.Files;
import java.nio.file.Path;

public class PrintMoreThanAvg {

	public static void main(String[] args) throws Exception {
		Path p = Path.of("d:\\classroom\\nov26\\marks.txt");

		var avgMarks = 
		   	  Files.lines(p)
		     .mapToInt(v -> Integer.parseInt(v))  // Covert to int
		     .average()       			      	// OptionalDouble 
		     .getAsDouble();
		
		System.out.println(avgMarks);
		
		Files.lines(p)
		     .mapToInt(v -> Integer.parseInt(v))   
		     .filter(v -> v > avgMarks)
		     .forEach(System.out::println);
	}

}
