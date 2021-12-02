package basics;

import java.util.Scanner;

public class AverageOfPositiveNumbers {

	public static void main(String[] args) {
		int sum = 0, count = 0;
		Scanner s = new Scanner(System.in); // Read from keyboard

		for (int i = 1; i <= 5; i++) {
			System.out.print("Enter a number : ");
			int num = s.nextInt();
			if (num > 0) {
				sum += num;
				count++;
			}
		} // for

		System.out.printf("Average = %f", sum / (double) count);
	}
}
