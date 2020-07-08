import java.util.Scanner;

public class PracticeD1Q2iv {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of line");
		int width = scanner.nextInt();
		for (int i = 0; i < width; i++) {
			for (int j = 1; j < width - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <= 2 * i; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
