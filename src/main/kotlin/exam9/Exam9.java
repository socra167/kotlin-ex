package exam9;

import java.util.Arrays;
import java.util.List;

public class Exam9 {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

		names.forEach(name -> System.out.println("Hello, " + name));
	}
}
