package basics;

import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in); // Read from keyboard
		System.out.print("Enter a number : ");
		int num = s.nextInt();

		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0)
				System.out.println(i);
		}
	}

}
