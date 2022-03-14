package stream;

import java.util.stream.IntStream;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// compute the sum of the squares of integers 1-5
		int sum = 0;
		for (int i = 1; i <= 5; i++) {
		    sum = sum + i * i;
		}
		System.out.println(sum);
		int sum1 = IntStream.range(1, 6)
			    .map(n -> n * n)
			    .sum();
	}

}
