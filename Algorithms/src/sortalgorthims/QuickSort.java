package sortalgorthims;

public class QuickSort {
	public static void main(String[] args){
		int[] a = Tool.getRandomArray(9546400);	//生成一个长度为9546400的数组
//		int[] a = {11,25,32,1,3,4,37,12,33,13,32,10,
//				38,58,7,4,63,33,6,43,4,21,14,24,62,4,42,1};
//		Tool.printL(a);
		Tool.print("-------------------------------------" +
				"-------------------------------------");
//		int[] b = bubbleSort(a);
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
//	public static int medianOfThree(int[] a, int left, int right){
//		int mid = left + (right - left) /2;
//		if(a[left]>a[right])	//保持右端比左端大
//			Tool.swap(a, left, right);
//		if(a[mid]>a[right])		//保持右端比中间大
//			Tool.swap(a, mid, right);
//		//这时右端最大。只需要比较左端和中间，取较大值即可
//		if(a[mid]>a[left])		//保持左端处于中间值
//			Tool.swap(a, left, right);							
//		return a[left];
//	} 
	public static int quickAdjust(int[] a, int left, int right){	
		int pivot = a[left];
//		对pivot的取法进行优化
//		int pivot = medianOfThree(a, left, right);	//方法行不通？？				
		while(left < right){
			while(pivot<=a[right] && left < right)
				right--;
			a[left] = a[right];
			while(a[left]<=pivot && left < right)
				left++;
			a[right] = a[left];
		}			
		a[left] = pivot;
		return left;
	}
}
/*	public static int division(int[] list, int left, int right) {
	    // 以最左边的数(left)为基准
	    int base = list[left];
	    while (left < right) {
	        // 从序列右端开始，向左遍历，直到找到小于base的数
	        while (left < right && list[right] >= base)
	            right--;
	        // 找到了比base小的元素，将这个元素放到最左边的位置
	        list[left] = list[right];	 
	        // 从序列左端开始，向右遍历，直到找到大于base的数
	        while (left < right && list[left] <= base)
	            left++;
	        // 找到了比base大的元素，将这个元素放到最右边的位置
	        list[right] = list[left];
	    }	 
	    // 最后将base放到left位置。此时，left位置的左侧数值应该都比left小；
	    // 而left位置的右侧数值应该都比left大。
	    list[left] = base;
	    return left;
	}	 
	private static int[] quickSort(int[] list, int left, int right) {	 
	    // 左下标一定小于右下标，否则就越界了
	    if (left < right) {
	        // 对数组进行分割，取出下次分割的基准标号
	        int base = division(list, left, right);	 	 
	        // 对“基准标号“左侧的一组数值进行递归的切割，以至于将这些数值完整的排序
	        quickSort(list, left, base - 1);	 
	        // 对“基准标号“右侧的一组数值进行递归的切割，以至于将这些数值完整的排序
	        quickSort(list, base + 1, right);
	    }
	    return list;
	}
}
*/