package oop2;

import java.util.Scanner;

public class TotalMarks {

	public static void main(String[] args) {
		int total = 0;
		Scanner s = new Scanner(System.in);
		for (int i = 1; i <= 5; i++) {
			System.out.print("Enter marks :");
			try {
				var marks = Integer.parseInt(s.nextLine());
				total += marks;
			} catch (Exception ex) {
				System.out.println("Sorry! Invalid Number!!");
			}
		}
		System.out.println(total);
	}

}
