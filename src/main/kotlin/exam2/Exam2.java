package exam2;

public class Exam2 {
	public static void main(String[] args) {
		int number = 15;

		if (number % 2 == 0) {
			System.out.println("Even Number");
		} else {
			System.out.println("Odd Number");
		}

		String str = number % 2 == 0 ? "even" : "odd"; // 3항 연산자로도 표현 가능
	}
}
