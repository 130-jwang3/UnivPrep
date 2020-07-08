
public class ForLoop2 {
	public static void main(String args[]){
		int[] ns={1,4,9,16,25};
		int sum=0;
		int j=0;
		for(int i:ns){
			sum=sum+ns[j];
			j++;
		}
		System.out.println(sum);
	}
}
