import java.util.Random;
import java.util.Scanner;

public class SwitchOption {
	public static void main(String args[]){
		Scanner scanner=new Scanner(System.in);
		String hand=scanner.nextLine();
		int uHand = 0;
		switch(hand){
		case "rock":
			uHand=0;
			break;
		case "sciccor":
			uHand= 1;
			break;
		case "paper":
			uHand=2;
			break;
		default:
			uHand=-1;
			System.out.println("no hand");
			break;
		}
		Random rn=new Random();
		int rn1=rn.nextInt(3);
		if(uHand==rn1){
			System.out.println("tie");
		}else if(uHand==0&rn1==1||uHand==1&rn1==2||uHand==2&rn1==0){
			System.out.println("you win");
		}else if(uHand==1&rn1==0||uHand==2&rn1==1||uHand==0&rn1==2){
			System.out.println("you lose");
		}
	}
}
