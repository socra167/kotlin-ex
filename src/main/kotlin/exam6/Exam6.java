package exam6;

import java.util.ArrayList;
import java.util.List;

public class Exam6 {
	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("Alice");
		names.add("Bob");
		names.add("Charlie");

		for (String name : names) {
			System.out.println(name);
		}
	}
}
