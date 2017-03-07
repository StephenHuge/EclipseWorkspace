package tools;

public class Print {
	public static void print(int[] a){
		int length = a.length;
		for(int i=0; i<length-1; i++){
			System.out.print(a[i]+" ");
		}
	}
}
