package sortalgorthims;
/**
 * 这是一个工具类，里面有多个工具函数：
 * print(Object o)函数的重载，分别用于打印int型变量、String类型变量、数组，以及为了打印超长数组而设置的printL(int[] a);
 * swap(int[] a, int b, int c)交换数组a中下标为b和c的变量的位置；
 * getRandomArray(int log)生成一个长度为log的随机数组，其中的数无序最大值为log-1，最小值为0,且互不重复。
 * 
 * 持续更新中…
 * @author Steve Huge
 * @version	 1.0
 */

public class Tool {		
	/**
	 *打印一个int型的变量 
	 * @param a 一个int型变量
	 */
	public static void print(int a){
		System.out.print(a);
	}
	/**
	 * 打印一个String类型的变量
	 * @param s 一个String字符串
	 */
	public static void print(String s){
		System.out.println(s);
	}
	/**
	 * 打印一个数组
	 * @param a 一个int型数组
	 */
	public static void print(int[] a){
		int length = a.length;
		for(int i=0; i<length; i++){
			System.out.print(+a[i]+"\t");
		}
		System.out.println();
	}
	/**
	 * 打印超长数组时每10个数字换行，方便显示
	 * @param a 一个int型数组（数据量很大，一般大于50）
	 */
	public static void printL(int[] a){
		int length = a.length;
		for(int i=0; i<length; i++){
			System.out.print(+a[i]+"\t");			
			if((i+1)%10 == 0 )
				System.out.println();
		}
		System.out.println();
	}
	/**
	 * 交换数组中的两个数
	 * 引用：
	 *  //Java对普通类型的变量是不支持引用传递的
	 *  //可以像下面这样通过传数组（也属于传值）的方法来完成对换（在很多排序算法里面就是这么干的）：
	 *	//public static void swap(int[] data, int a, int b) {  
	 *	//	int t = data[a];  
	 *	//	data[a] = data[b];  
	 * 	//	data[b] = t;  
	 *	//}
	 * @param c int型数组
	 * @param a 数组下标
	 * @param b 数组下标
	 */      
	public static void swap(int[] c, int a, int b){
		int temp = c[a];
		c[a] = c[b];
		c[b] = temp;
	}
	/**	 
	 * 生成一个长度为<code>log</code>的随机数组，
	 * 其中的数无序最大值为<code>log-1</code>，最小值为<code>0</code>,且互不重复。		 
	 * @param  log 生成数组的长度
	 * @return 返回生成后的数组
	 */
	 public static int[] getRandomArray(int log){
	      int[] result = new int[log];
	      //	创建一个数组，其中每个值为其下标+1
	      for (int i = 0; i < log; i++) {
	              result[i] = i + 1;
	      }
	      //	每随机出一个数，将其按照从前到后与数组第一个值交换，以达到随机数组的目的
	      for (int i = 0; i < log; i++) {
	              int random = (int) (log * Math.random());
	              swap(result, random, i);
	     }
	     return result;
	 }	 
	 /**
	  *	随机生成一个int型二维数组
	  *	@param row 生成二维数组的行数
	  *	@param col 生成二维数组的列数
	  *	@return 返回生成后的二维数组
	  */
	 public static int[][] getRandomMatrix2(int row, int col){
		 int len = col*row;
		 int[] a = new int[len];
		 a = getRandomArray(len);
		 int[][] aa = new int[row][col];
		 int j = 0;
		 for (int i = 0; i < len; i++) {			 
//			 aa[j][i % col] = a[i];
			 aa[j][i % col] = i+1;
			 if((i+1) % col==0)				 
				 j++;			 				 			
		 }		    
		 return aa;
	 }
}
