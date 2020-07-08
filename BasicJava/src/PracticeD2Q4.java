import java.util.Scanner;

public class PracticeD2Q4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of line");
		int n = scanner.nextInt();
		for (int i = 0; i < 2*n + 2; i++) {
			System.out.print("*");
		}
		System.out.println();
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j <= n - i; j++) {
				if (j == 0) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			for (int j = 0; j <= i * 2 - 1; j++) {
				if (j == 1 || j == i * 2 - 1) {
					System.out.print("@");
				} else {
					System.out.print(" ");
				}
			}
			for(int j=0;j<2*n-1;j++){
				if(j==n-i){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for (int i = n - 1; i > 0; i--) {
			for (int j = 0; j <= n - i; j++) {
				if (j == 0) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			for (int j = 0; j <= i * 2 - 1; j++) {
				if (j == 1 || j == i * 2 - 1) {
					System.out.print("@");
				} else {
					System.out.print(" ");
				}
			}
			for(int j=0;j<2*n-1;j++){
				if(j==n-i){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for (int i = 0; i < 2*n + 2; i++) {
			System.out.print("*");
		}
		System.out.println();

	}
}
