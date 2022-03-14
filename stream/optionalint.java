package stream;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class optionalint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// (does not compile!)
        OptionalInt largest = 
            IntStream.of(55, 20, 19, 31, 40, -2, 62, 30)
            .filter(n -> n % 10 == 0)
            .max();
        System.out.println(largest.getAsInt());
	}

}
