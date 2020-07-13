import java.util.Scanner;

public class PracticeD5Q7 {
	public static void main(String args[]){
		Scanner scanner=new Scanner(System.in);
		String a=scanner.nextLine();
		countYZ(a);
	}
	public static int countYZ(String a){
		int count=0;
		for(int i=0;i<a.length();i++){
			String b=a.substring(i,i+1);
			if(b.equals(" ")){
				String c=a.substring(i-1,i);
				if(c.equalsIgnoreCase("y")||c.equalsIgnoreCase("z")){
					count++;
				}
			}
		}
		String c=a.substring(a.length()-1,a.length());
		if(c.equalsIgnoreCase("y")||c.equalsIgnoreCase("z")){
			count++;
		}
		System.out.println(count);
		return count;
	}
}
