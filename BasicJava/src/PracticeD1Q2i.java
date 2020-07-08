import java.util.Scanner;

public class PracticeD1Q2i {
	public static void main(String args[]){
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter length and width:");
		int length=scanner.nextInt();
		int width=scanner.nextInt();
		for(int i=0;i<width;i++){
			for(int j=0;j<length;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
