package streams;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.regex.Pattern;

public class ListMobiles {

	public static void main(String[] args) throws Exception {
		Path p = Path.of("d:\\classroom\\nov26\\mobiles.txt");

//		Files.lines(p)
//		     .filter(ListMobiles::isMobile) // Method reference 
//		     .forEach(System.out::println);
		
		Files.lines(p)
	     .filter(v -> isMobile(v))
	     .forEach(System.out::println);
	}

	public static boolean isMobile(String s) {
		return Pattern.matches("\\d+", s);
	}

}
