import java.util.Scanner;

public class ForLoop3 {
	public static void main(String args[]){
		Scanner scanner=new Scanner(System.in);
		int round=scanner.nextInt();
		double pi=0;
		double a=1;
		for(int i=0;i<round;i++){
			if(i%2==0){
				pi=pi+(1/a);
			}else{
				pi=pi-(1/a);
			}
			a=a+2;
		}
		pi=pi*4;
		System.out.println(pi);
	}
}
