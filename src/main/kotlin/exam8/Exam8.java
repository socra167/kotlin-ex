package exam8;

public class Exam8 {

	public static void main(String[] args) {
		String name = null;

		if (name != null) {
			System.out.println(name.length());
		} else {
			System.out.println("Name is null");
		}

		// 자바에서 안전하게 함수 호출하려면 이렇게 해야 함
		// Person person = new Person();
		// if ( person != null && person.leftArm != null && person.leftArm.hand != null ) person.leftArm.hand.grab();
	}
}
