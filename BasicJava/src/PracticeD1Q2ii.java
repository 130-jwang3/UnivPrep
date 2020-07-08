import java.util.Scanner;

public class PracticeD1Q2ii {
	public static void main(String args[]){
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter number of line");
		int width=scanner.nextInt();
		for(int i=0;i<width;i++){
			for(int j=0;j<width;j++){
				if(j<=i){
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
