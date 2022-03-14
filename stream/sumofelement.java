package stream;

import java.util.stream.IntStream;

public class sumofelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        // Using IntStream.sum() to find
        // sum of elements dividible by 3
        // in given range
        int sumOfElements = IntStream.range(2, 10)
                        .filter(num -> num % 3 == 0)
                        .sum();
 
        // Displaying the calculated sum
        System.out.println(sumOfElements);
	}

}
