package lambda;

import java.util.Arrays;
import java.util.function.Predicate;

class LongNames implements Predicate<String> {
	@Override
	public boolean test(String t) {
		return t.length() > 3;
	}
}

public class SortLongNames {

	public static void main(String[] args) {
		String[] names = { "Li", "Joe", "Andy", "Scott", "Richards", "Jason", "James", "Kim" };

		Arrays.stream(names)
		      //.filter(new LongNames())
		      .filter( t -> t.length() > 3)      	// Intermediate 
		      .sorted()   							// Intermediate 
		      .limit(3) 							// Intermediate 
		      .forEach(System.out::println);        // Terminal 

	}

}
