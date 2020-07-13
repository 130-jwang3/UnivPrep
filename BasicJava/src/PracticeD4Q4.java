import java.util.Scanner;

public class PracticeD4Q4 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		String a = scanner.nextLine();
		String b = scanner.nextLine();
		removeString(a, b);
		
	}

	public static String removeString(String a, String b) {
		int aLen = a.length();
		int bLen = b.length();
		String c = "";
		for (int i = 0; i < aLen; i++) {
			if (i <= aLen - bLen) {
				String bc = a.substring(i, i + bLen);
				if (!bc.equalsIgnoreCase(b)) {
					c = c + a.substring(i, i + 1);
				} else {
					i=i+bLen-1;
				}
			} else {
				String bc = a.substring(i, i + 1);
				if (!bc.equalsIgnoreCase(b)) {
					c = c + a.substring(i, i + 1);
				}
			}

		}
		System.out.println(c);
		return c;
	}
}
