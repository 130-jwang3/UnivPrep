import java.util.Scanner;

public class InputOutput {
	public static void main(String args[]){
		Scanner scanner=new Scanner(System.in);
		int firstTest=scanner.nextInt();
		int secondTest=scanner.nextInt();
		double improvement=(((double)secondTest/(double)firstTest)-1)*100;
		System.out.printf("You have improved %.2f%%",improvement);
	}
}
