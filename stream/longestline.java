package stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class longestline {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int longest = Files.lines(Paths.get("C:/Users/hanmant.raje/eclipse-workspace/Javafirstproject/src/haiku.text"))
			    .mapToInt(String::length)
			    .max()
			    .getAsInt();
			 
//		//stream operations:
//		Files.lines -> ["haiku are funny",
//		       "but sometimes they don't make sense",
//			                "refrigerator"]
//			-> mapToInt -> [15, 35, 12]
//			     -> max -> 35
		System.out.println(longest);
	}

}
