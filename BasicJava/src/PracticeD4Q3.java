
public class PracticeD4Q3 {
	public static void main(String args[]) {
		int[] arr = {1,2,1,4};
		int a=maxMirror(arr);
		System.out.println(a);
	}

	public static int maxMirror(int[] arr) {
		  int maxlen= 0;
		  boolean match=false;
		  for (int i = 0; i < arr.length; i++) {
		    for (int j = arr.length - 1; j >= i; j--) {
		      int a = 0;
		      if(match = (arr[i] == arr[j])){
		    	  match=true;
		      }
		      while (match==true) {
		        a++;
		        int aa = i + a;
		        int bb = j - a;
		        if(match =(aa < arr.length) &&(bb >= 0) &&(arr[aa] == arr[bb])){
		        	match=true;
		        }else{
		        	match=false;
		        }
		      }
		      if (a > maxlen){
		    	  maxlen = a;
		      }
		    }
		  }

		  return maxlen;
		}
}
