package stream;

import java.util.stream.IntStream;

public class filter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 
			     IntStream.of(3, 1, 4, 1, 5, 9, 2, 6, 5, 3)
			    .filter(n -> n % 2 != 0)
			    .map(n -> n * n)
			    .sum();
		System.out.println(sum);
	}

}
