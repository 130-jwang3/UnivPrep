
public class PracticeD4Q1 {
	public static void main(String args[]) {
		int[] span = { 1, 2, 1, 3, 1, 4, 1, 5, 1, 6 };
		int bc = maxspan(span);
		System.out.println(bc);
	}

	public static int maxspan(int[] span) {
		int maxSpan = 0;
		int a = 0;
		int c = span.length;
		for (int i = 0; i < c; i++) {
			for (int j = c - 1; j > i; j--) {
				if (span[i] == span[j]) {
					a = j - i;
					break;
				}
			}
			if (a > maxSpan) {
				maxSpan = a;
			}
		}
		return maxSpan + 1;
	}
}
