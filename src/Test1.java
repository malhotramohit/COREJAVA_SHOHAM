
public class Test1 {

	public static void main(String args[]) {

		System.out.println("Hello,World");

		byte b = 12; // -128 to 127 // 1 Byte
		short s = 1223; // 2bytes
		int i = 23344444; // 4bytes
		long l = 435355355535L; // 8 bytes

		float f = 3.14f;
		double d = 2454.3453535;

		boolean flag = true;

		char c = 'a';
		char c1 = 97;

		System.out.println(b);
		System.out.println(c);
		System.out.println(c1);
		System.out.println(s);
		System.out.println(l);

		int some = -129;

		byte bb = (byte) some;
		System.out.println(bb);

		String name = "mohit";

		if (c1 % 2 == 0) {
			System.out.println("Its even");
		} else {
			System.out.println("Its odd");
		}

		String outcome = c1 % 2 == 0 ? "Even" : "Odd";

		int j = 0;
		for (; j < 5; j++) {
			System.out.print("*");
		}

		int m = 0;
		while (m < 6) {
			System.out.println("@");
			m++;
		}

		int[] salaryarray = new int[10];

		for (int k = 0; k < salaryarray.length; k++) {
			salaryarray[k] = k;
		}

		for (int k = 0; k < salaryarray.length; k++) {
			System.out.println("The values are " + salaryarray[k]);
		}

		double[] arr =  {3.23,45.35,767.56};
		
		//1) Num = 45 , Present : 3
		//2) Sum of all the elements of array
		//3) Average of all array elements
		//4) Sorted array : binary search
		//5) Reverse array : 
		//6) Remove Duplicates from the array
		//7) Calculate the number of duplicates in an array
		//8) Factorial by rec
		//9) Given a number : is it pallindrome or not
		//10) Fibonancci using recursion
		//11) Bubble, Selection , Insertion , Merge sort
		//12) Sum = 25 : (a,b) :? whose sum is the given 
		
		
	}

}
