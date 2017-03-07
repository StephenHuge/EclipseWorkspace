package sortalgorthims;

public class Test1 {
	public static void main(String[] args){
		int[] a = getRandomArray(9546400);	//生成一个长度为9546400的数组
//		int[] a = {11,25,32,1,3,4,37,12,33,13,32,10,38,58,7,4,63,33,6,43,4,21,14,24,62,4,42,1};
//		Tool.print(a);
		Tool.print("--------------------------------------");
//		int[] b = bubbleSort(a);
		int[] b = shellSort(a);
		Tool.printL(b);
	}
	public static int[] bubbleSort(int[] a){
		int length = a.length;
		for(int i=0; i<length; i++){
			for(int j=0;j<length-1-i;j++){
				if(a[j] > a[j+1])
					Tool.swap(a, j, j+1);
			}
		}
		return a;
	}
	 public static int[] getRandomArray(int log){
	      int[] result = new int[log];
	      for (int i = 0; i < log; i++) {
	              result[i] = i;
	      }
	      for (int i = 0; i < log; i++) {
	              int random = (int) (log * Math.random());
	              int temp = result[i];
	             result[i] = result[random];
	             result[random] = temp;
	     }
	     return result;
	 }
	 public static int[] shellSort(int[] a) {
		    int d = a.length / 2;		 
		    while (true) {
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
	 

