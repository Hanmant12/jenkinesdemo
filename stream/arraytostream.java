package stream;

import java.util.Arrays;

public class arraytostream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {3, -4, 8, 4, -2, 17,
                9, -10, 14, 6, -12};
int sum = Arrays.stream(numbers)
   .map(n -> Math.abs(n))
   .filter(n -> n % 2 == 0)
   .distinct()
   .sum();
System.out.println(sum);
	}

}
