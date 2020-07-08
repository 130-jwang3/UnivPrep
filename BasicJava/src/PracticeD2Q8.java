import java.util.Scanner;

public class PracticeD2Q8 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter x for sinx and  n");
		int x = scanner.nextInt();
		int n = scanner.nextInt();
		double sinx = 0;
		int a = 1;
		for (int i = 0; i < (n + 1 / 2); i++) {
			double b = sin(x, n, a);
			if (i % 2 == 0) {
				sinx = sinx + b;
			} else {
				sinx = sinx - b;
			}
			a = a + 2;
		}
		System.out.println(sinx);
	}

	public static double sin(int x, int n, int a) {
		double up = 1;
		double down = 1;
		int b = a;
		for (int i = 0; i < a; i++) {
			up = up * x;
		}
		for (int i = 0; i < a; i++) {
			down = down * b;
			b--;
		}
		double sum = up / down;
		return sum;

	}
}
