package tools;

public class Swap {
	public static void swap(int[] c, int a, int b){
		int temp = c[a];
		c[a] = c[b];
		c[b] = temp;
	}
}
