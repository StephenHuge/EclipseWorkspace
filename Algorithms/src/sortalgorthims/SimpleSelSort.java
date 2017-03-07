package sortalgorthims;

public class SimpleSelSort {
	public static void main(String[] args){
		int[] a = {11,25,32,1,3,4,37,12,33,13,32,10,38,58,7,4,63,33,6,43,4,21,14,24,62,4,42,1};
		Tool.print(a);	
		Tool.print("a.length is " + a.length);
		int[] b = simpleSelSort(a);
		Tool.print(b);	
	}
	public static int[] simpleSelSort(int[] a){
		int length = a.length;
		int min;
		for(int i=0; i<length; i++){
			min = i;
			for(int j=i+1; j<length; j++){
				if(a[min]>a[j]){
					min = j;					
				}
			}
			if(min!=i)
				Tool.swap(a, i, min);
		}
		return a;
	}
}
