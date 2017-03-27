package test;

import sortalgorthims.Tool;

public class QuickSortDemo {
	public static void main(String[] args){
//		int[] a = {11,25,32,1,3,4,37,12,33,13,32,10,38,58,7,4,63,33,6,43,4,21,14,24,62,4,42,1};
		int[] a = Tool.getRandomArray(9999999);
//		Tool.printL(a);
		System.out.println("-------------------------------------" +
				"-------------------------------------");
		int[] b = quickSort(a);
		Tool.printL(b);
	}
	
	public static int[] quickSort(int[] a){
		return quickSort(a, 0, a.length-1);
	}
	public static int[] quickSort(int[] a, int first, int last){		
		if(first<last){
			int pivot = quickAdjust(a, first, last);
			quickSort(a, first, pivot);					
			quickSort(a, pivot+1, last);
		}
		return a;
	};
	public static int quickAdjust(int[] a, int first, int last){
		int pivot = a[first];	
		while(first<last){
			while(first<last && pivot<=a[last])
				last--;
			a[first] = a[last];
			while(first<last && pivot>=a[first])
				first++;
			a[last] = a[first];
		}
		a[first] = pivot;
		return first;
	}
}
