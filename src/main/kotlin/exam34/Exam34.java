package exam34;

public class Exam34 {

	class Person {
		private String name;
		private int age;

		public Person(String name, int age) {
			this.name = name;
			this.age = age;
			System.out.println("Person 객체가 생성되었습니다: " + name + ", " + age);
		}
	}
}
