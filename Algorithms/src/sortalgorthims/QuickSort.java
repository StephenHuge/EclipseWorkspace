package sortalgorthims;

public class QuickSort {
	public static void main(String[] args){
		int[] a = Tool.getRandomArray(9546400);	//生成一个长度为9546400的数组
		Tool.print("-------------------------------------" +
				"-------------------------------------");
		int[] b = quickSort(a, 0, a.length-1);
		Tool.printL(b);
	}
	public static int[] quickSort(int[] a, int left, int right){		
		if(left<right){
			int pivot = quickAdjust(a, left, right);	
			quickSort(a, left, pivot);
			quickSort(a, pivot+1, right);
		}		
		return a;
	}

	public static int quickAdjust(int[] a, int left, int right){	
		int pivot = a[left];				
		while(left < right){
			while(left < right && pivot<=a[right])
				right--;
			a[left] = a[right];
			while(left < right && a[left]<=pivot)
				left++;
			a[right] = a[left];
		}			
		a[left] = pivot;
		return left;
	}
}