
public class MethodOverLoading {
	public static void main(String[] args) {

		System.out.println(add(2, 3));
		// add(34.4,56);
		System.out.println(add(2, 3, 4));
		System.out.println(add(2, 'c'));
		System.out.println(add('a', 5));

	}

	static int add(int a, int b) {
		return a + b;
	}

	/**
	 * Way 1 : No. of arguments
	 * 
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 */
	static int add(int a, int b, int c) {
		return a + b + c;
	}

	/**
	 * Way 2: Type of arguments
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	static int add(int a, char b) {
		return a + b;
	}

	/**
	 * Way 2: Type and relative order of arguments
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	static int add(char a, int b) {
		return a + b;
	}

	// Not allowed in terms or return type
	// void add(int a, int b) {
	// return;
	// }

}
