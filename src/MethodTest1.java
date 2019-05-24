
public class MethodTest1 {

	public static void main(String[] arr) {

		doSomething();
		int res = calculateSquare(10);
		System.out.println("Res is " + res);

	}

	static void doSomething() {
		System.out.println("I am doing some stuff");
	}

	static int calculateSquare(int num) {
		return num * num;
	}

}
