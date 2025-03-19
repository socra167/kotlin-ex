package exam10;

public class Exam10 {

	public static void main(String[] args) {
		JPerson p1 = new JPerson("John", 30);
		JPerson p2 = new JPerson("John", 30);

		// 두 객체가 name, age가 같으면 같다고 표현하고 싶은 경우
		System.out.println(p1 == p2); // false
		System.out.println(p1.equals(p2)); // equals()를 오버라이딩해 동등성 비교 true

		System.out.println(p1); // toString()을 재정의하지 않으면 객체 참조값이 출력된다
		// toString()을 재정의하면 "Person{name='John', age=30}" 객체 내부 필드값을 자세히 보여준다
	}
}