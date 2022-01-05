package streams;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.regex.Pattern;

public class ListJavaFiles {
    private static int count = 0;
	public static void printFile(Path p)
	{
		 System.out.println(p);
    	 count ++;
	}
	
	public static void main(String[] args) throws Exception {
		Path p = Path.of("d:\\classroom\\nov26");
		
		Files.walk(p)
		     .filter(f -> f.toString().endsWith(".java"))
		     //.forEach(ListJavaFiles::printFile);
		     .forEach(path -> {
		    	 System.out.println(path);
		    	 count ++;
		     });
		
        System.out.printf("Count = %d", count);
	}
 

}
