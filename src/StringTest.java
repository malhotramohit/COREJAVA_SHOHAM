
public class StringTest {
	public static void main(String[] args) {

		String name = "Mohit";

		char c = name.charAt(2);
		System.out.println(c);

		System.out.println("Len is " + name.length());

		int index = name.indexOf('i');
		System.out.println("Index of i " + index);

		String name1 = "Shohom";
		System.out.println("Index of o " + name1.indexOf('o'));
		System.out.println("Index of second o " + name1.indexOf('o', 3));
		System.out.println("Index of ho " + name1.indexOf("ho", 3));

		name1.replace('o', 'a');
		System.out.println("After replacing " + name1);

		name1 = name1.replace('o', 'a');
		System.out.println("After replacing " + name1);

		String st1 = new String("Pierre");
		String st2 = new String("Pierre");

		if (st1 == st2) {
			System.out.println("Theya are some");
		} else {
			System.out.println("They are not same");
		}

		String st11 = "Rohit";
		String st22 = "Rohit";
		if (st11 == st22) {
			System.out.println("Theya are some");
		} else {
			System.out.println("They are not same");
		}
	}

}
