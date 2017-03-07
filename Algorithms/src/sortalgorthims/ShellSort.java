package sortalgorthims;

public class ShellSort {
	public static void main(String[] args){
		int[] a = {11,25,32,1,3,4,37,12,33,13,32,10,38,58,7,4,63,33,6,43,4,21,14,24,62,4,42,1};
		Tool.print(a);
		int[] b = shellSort(a);
		Tool.print(b);
	}
	

	public static int[] shellSort(int[] a){
		int length = a.length;
		int d = length/2;
		while(true){
			// 把距离为d的元素编为一个组，扫描所有组
	        for (int i = d; i < a.length; i++) {
	            int j = 0;
	            int temp = a[i]; 		 
	            // 对距离为d的元素组进行排序
	            for (j = i - d; j >= 0 && temp < a[j]; j = j - d) {
	                a[j + d] = a[j];
	            }
	            a[j + d] = temp;
	        }		
	        if(d==1) return a;
	        d = d / 2; // 减小增量
		}					
		
	}
}
