package streams;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.IntStream;

public class UsingStreamTwice {
	public static void main(String[] args) throws Exception {
		Path p = Path.of("d:\\classroom\\nov26\\marks.txt");

		IntStream stream = Files.lines(p)
				          .mapToInt(v -> Integer.parseInt(v));
		var avgMarks = 
		     stream.average()		   
		           .getAsDouble();
		
		// stream was already consumed, so can't use it again
		stream.filter(v -> v > avgMarks)
		      .forEach(System.out::println);
		    
	}

}
