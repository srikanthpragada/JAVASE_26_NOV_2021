package lib1;

public class SumOfNumbers {

	public static void main(String[] args) {
		var marks = "89,44,56,78,47";
		
		var total = 0;
		for(var s : marks.split(","))
		{
		      total += Integer.parseInt(s);	
		}
		
		System.out.println(total);

	}

}
