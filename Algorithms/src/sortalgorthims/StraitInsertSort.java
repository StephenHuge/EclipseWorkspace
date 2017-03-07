package sortalgorthims;

public class StraitInsertSort {
	
	public static void main(String[] args){
		int[] a = {11,25,32,1,3,4,37,12,33,13,32,10,38,58,7,4,63,33,6,43,4,21,14,24,62,4,42,1};
		Tool.print(a);			
		int[] b = straitInsertSort(a);
		Tool.print(b);	
	}
	
	public static int[] straitInsertSort(int[] unSorted){
		int length = unSorted.length;		
		for(int i=1; i<length; i++){			
			if(unSorted[i-1]>unSorted[i]){
				int temp = unSorted[i];;
				int j = i;				
				for(; j > 0 && unSorted[j-1] > temp;j--)
					unSorted[j] = unSorted[j-1];				
				unSorted[j] = temp;
			}
		}
		return unSorted;
	}	
}
