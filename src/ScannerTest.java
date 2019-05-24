import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {

		System.out.println("Enter some num");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		System.out.println("The num entered is " + input);

	}

}
