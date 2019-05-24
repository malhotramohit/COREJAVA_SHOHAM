
public class FactorialRec {
	public static void main(String[] args) {
		int num = 5;
		int res = fact(num);
		System.out.println(res);

	}

	static int fact(int n) {
		if (n == 1) {
			return 1;
		} else {
			return n * fact(n - 1);
		}
	}

}
