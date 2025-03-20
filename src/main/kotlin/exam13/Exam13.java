package exam13;

public class Exam13 {
	public static class Singleton {
		private static final Singleton INSTANCE = new Singleton();

		private Singleton() {}

		public static Singleton getInstance() {
			return INSTANCE;
		}

		public void showMessage() {
			System.out.println("Hello from Singleton!");
		}

		public static void main(String[] args) {
			Singleton.getInstance().showMessage();
		}
	}
}
