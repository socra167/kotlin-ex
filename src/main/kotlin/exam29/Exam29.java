package exam29;

public class Exam29 {

	class Animal {

		void makeSound() {
			System.out.println("Some generic animal sound");
		}
	}

	class Dog extends Animal {

		@Override
		void makeSound() {
			System.out.println("Bark! Bark!");
		}
	}
}
