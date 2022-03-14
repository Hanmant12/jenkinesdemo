package stream;

import java.util.stream.IntStream;

public class largestnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int largest = 
		            IntStream.of(55, 20, 19, 31, 40, -2, 62, 30)
		            .filter(n -> n % 10 == 0)
		            .max()
		            .getAsInt();
		        System.out.println(largest);
	}

}
