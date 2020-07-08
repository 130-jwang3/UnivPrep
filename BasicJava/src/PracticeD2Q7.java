import java.util.Scanner;

public class PracticeD2Q7 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter year month and date");
		int year = scanner.nextInt();
		int month = scanner.nextInt();
		int date = scanner.nextInt();
		int a, b, c, x, y, day = 0;
		boolean aa=true;
		a = year - 1900;
		if(a%4==0){
			aa=false;
		}
		for (int i = 0; i < a; i++) {
			if (i % 4 == 0) {
				day = day + 366;
			} else {
				day = day + 365;
			}
		}
		b = month - 1;
		if(b>1){
			if(aa==true){
				day=day+60;
			}if(aa==false){
				day=day+59;
			}
		}else if(b==1){
			day=day+31;
		}
		for (int i = 1; i < b; i++) {
			if(i<=6&&i%2==0){
				day=day+31;
			}else if(i<=6&&i%2!=0){
				day=day+30;
			}else if(i>6&&i%2==0){
				day=day+30;
			}else if(i>6&&i%2!=0){
				day=day+31;
			}
		}
		c=date-1;
		day=day+c;
		System.out.println("The differene in date is "+day);
	}
}
