package exam30;

public class Exam30 {

	interface Animal {
		default void makeSound() {
			System.out.println("Animal sound");
		}
	}

	interface Pet {
		default void makeSound() {
			System.out.println("Pet sound");
		}
	}

	class Dog implements Animal, Pet {
		@Override
		public void makeSound() {
			Animal.super.makeSound(); // 특정 인터페이스의 메서드 호출
		}
	}
}
