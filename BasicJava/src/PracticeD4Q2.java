
public class PracticeD4Q2 {
	public static void main(String args[]){
		int[] arr={1,1,1,2,1};
		boolean a=balance(arr);
		if(a==false){
			System.out.println(a);
		}
	}
	public static boolean balance(int[] arr){
		int sum1=0;
		int sum2=0;
		boolean a=false;
		for(int i=0;i<arr.length;i++){
			sum1=sum1+arr[i];
		}
		for(int i=0;i<arr.length;i++){
			sum1=sum1-arr[i];
			sum2=sum2+arr[i];
			if(sum1==sum2){
				a=true;
				System.out.println(a);
				break;
			}
		}
		return a;
	}
}
