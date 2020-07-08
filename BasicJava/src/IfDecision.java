import java.util.Scanner;

public class IfDecision {
	public static void main(String args[]){
		Scanner scanner=new Scanner(System.in);
		double weight=scanner.nextDouble();
		double height=scanner.nextDouble();
		double BMI=weight/height;
		BMI=BMI*BMI;
		if(BMI<18.5){
			System.out.println("Too light");
		}else if(BMI>=18.5&&BMI<25){
			System.out.println("normal");
		}else if(BMI>=25&&BMI<28){
			System.out.println("Too heavy");
		}else if(BMI>=28&&BMI<32){
			System.out.println("Fat");
		}else if(BMI>=32){
			System.out.println("Extremely Fat");
		}
	}
}
