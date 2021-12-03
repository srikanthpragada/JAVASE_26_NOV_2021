package basics;

public class PrintFactors {

	public static void main(String[] args) {

		if (args.length < 1) {
			System.out.println("Usage : java basics.PrintFactors <number>");
			return;
		}

		int num = Integer.parseInt(args[0]);

		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0)
				System.out.println(i);
		}
	}

}
