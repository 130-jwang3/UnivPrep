
public class PracticeD1Q1 {
	public static void main(String args[]){
		int count=0;
		for(int i=0;i<200;i++){
			if(i%7==0&&i%4!=0){
				count++;
				if(count%6==0){
					System.out.println(i);
				}else{
					System.out.print(i+" ");
				}
			}
		}
	}
}
