package exam5;

class JPerson {
	String name;

	// 생성자
	public JPerson(String name) {
		this.name = name;
	}

	public void greet() {
		System.out.println("Hello, my name is " + name);
	}
}

public class Exam5 {
	public static void main(String[] args) {
		JPerson person = new JPerson("Alice");
		person.greet();
	}
}
