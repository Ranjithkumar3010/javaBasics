package programs;

public class Reverse_a_number {
	public static void main(String[] args) {
		int n = 123, reminder = 0, reverse = 0;
		while (n > 0) {
			reminder = n % 10;
			reverse = reverse * 10 + reminder;

			n = n / 10;
//			System.out.println(reverse);
		}
		System.out.println(reverse);
	}

}
