package Test;

import sortalgorthims.*;

public class PassNumber {
	public static void main(String[] args){
//		int[] a = {11,25,32,1,3,4,37,12,33,13,32,10,38,58,7,4,63,33,6,43,4,21,14,24,62,4,42,1};
		int[] a = Tool.getRandomArray(9546400);
		int[] b = QuickSort.quickSort(a, 0, a.length-1);
		int c = getPassNum(b, 600);
//		Tool.printL(b);
		Tool.print(c);
		
	}
	public static int getPassNum(int[] a, int s){
		int left = 0;
		int right = a.length;
		int mid = (left + right) / 2;
		while(true){
			if(a[mid]>s){
				right = mid;
				mid = (left + right) / 2;				
			}
			if(a[mid]<=s){
				left = mid;
				mid = (left + right) / 2;
			}
			if(a[mid]==s || (a[mid-1]>s && a[mid]<s))
				return a.length - mid; 
		}
		
	}
}
