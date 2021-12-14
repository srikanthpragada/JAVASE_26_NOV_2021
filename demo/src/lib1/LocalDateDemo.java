package lib1;

import java.time.LocalDate;

public class LocalDateDemo {

	public static void main(String[] args) {
		var ld1 = LocalDate.of(2021, 1,1);
		var ld2 = LocalDate.now();
		var ld3 = LocalDate.parse("2021-12-01"); // ISO
		
		System.out.println(ld1);
		System.out.println(ld2);
		System.out.println(ld3);

	}

}
