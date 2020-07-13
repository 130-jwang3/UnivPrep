import java.util.Scanner;

public class PracticeD5Q5 {
	public static void main(String args[]){
		Scanner scanner=new Scanner(System.in);
		String a=scanner.nextLine();
		sumDigits(a);
	}
	public static int sumDigits(String a){
		int sum=0;
		char[] b=a.toCharArray();
		for(int i=0;i<a.length();i++){
			char c=b[i];
			if(Character.isDigit(c)){
				int d=Integer.parseInt(String.valueOf(c));
				sum=sum+d;
			}
		}
		System.out.println(sum);
		return sum;
	}
}
