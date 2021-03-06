package sortalgorthims;

public class MergeSort {
	
	public static void main(String[] args){
//		int[] a = Tool.getRandomArray(9546400);	//生成一个长度为9546400的数组
		int[] a = {11,25,32,1,3,4,37,12,33,13,32,10,38,58,7,4,63,33,6,43,4,21,14,24,62,4,42,1};
//		Tool.print(a);
		Tool.print("--------------------------------------");
//		int[] b = bubbleSort(a);
		int[] b = mergeSort(a);
		Tool.printL(b);
	}

	public static void merge(int[] a, int low, int mid, int high) {
	    int i = low; // i是第一段序列的下标
	    int j = mid + 1; // j是第二段序列的下标
	    int k = 0; // k是临时存放合并序列的下标
	    int[] b = new int[high - low + 1]; // array2是临时合并序列
	    // 扫描第一段和第二段序列，直到有一个扫描结束
	    while (i <= mid && j <= high) {
	        // 判断第一段和第二段取出的数哪个更小，将其存入合并序列，并继续向下扫描
	        if (a[i] <= a[j]) {
	            b[k++] = a[i++];
	        } else {
	            b[k++] = a[j++];
	        }
	    }
	    // 若第一段序列还没扫描完，将其全部复制到合并序列
	    while (i <= mid) {
	        b[k++] = a[i++];	        
	    }
	    // 若第二段序列还没扫描完，将其全部复制到合并序列
	    while (j <= high) {
	        b[k++] = a[j++];	        
	    }
	    // 将合并序列复制到原始序列中
	    for (k = 0, i = low; i <= high; i++, k++) {
	        a[i] = b[k];
	    }
	}
	public static void mergePass(int[] a, int gap, int length) {
	    int i = 0;
	    //	归并gap长度的两个相邻子表.如果i之后还有两个gap的长度，就继续循环否则跳出循环。
	    //	每次进行两个gap之间的归并，刚开始gap==1, 每两个数进行归并，确定大小后排好序
	    for (i = 0; i + 2 *gap-1 < length; i = i + 2 * gap) {
	        merge(a, i, i + gap - 1, i + 2 * gap - 1);
	    }	    
	    if (i + gap - 1 < length) {// 余下两个子表，后者长度小于gap
	        merge(a, i, i + gap - 1, length - 1);
	    }
	}
	public static int[] mergeSort(int[] a) {
	    for (int gap = 1; gap < a.length; gap = 2 * gap) {
	        mergePass(a, gap, a.length);	        
	    }
	    return a;
	}
}
