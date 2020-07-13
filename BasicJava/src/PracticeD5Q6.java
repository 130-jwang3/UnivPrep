import java.util.Scanner;

public class PracticeD5Q6 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		String a = scanner.nextLine();
		sumNumbers(a);
	}

	public static int sumNumbers(String a) {
		int total = 0;

		for (int i = 0; i < a.length(); i++) {

			if (Character.isDigit(a.charAt(i))) {
				int b = i;
				while (b < a.length() && Character.isDigit(a.charAt(b))) {
					b++;
				}
				total = total + Integer.parseInt(a.substring(i, b));
				i = b;
			}

		}
		System.out.println(total);
		return total;

	}
}
