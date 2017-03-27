package sortalgorthims;
/**
 * ����һ�������࣬�����ж�����ߺ�����
 * print(Object o)���������أ��ֱ����ڴ�ӡint�ͱ�����String���ͱ��������飬�Լ�Ϊ�˴�ӡ������������õ�printL(int[] a);
 * swap(int[] a, int b, int c)��������a���±�Ϊb��c�ı�����λ�ã�
 * getRandomArray(int log)����һ������Ϊlog��������飬���е����������ֵΪlog-1����СֵΪ0,�һ����ظ���
 * 
 * ���������С�
 * @author Steve Huge
 * @version	 1.0
 */

public class Tool {		
	/**
	 *��ӡһ��int�͵ı��� 
	 * @param a һ��int�ͱ���
	 */
	public static void print(int a){
		System.out.print(a);
	}
	/**
	 * ��ӡһ��String���͵ı���
	 * @param s һ��String�ַ���
	 */
	public static void print(String s){
		System.out.println(s);
	}
	/**
	 * ��ӡһ������
	 * @param a һ��int������
	 */
	public static void print(int[] a){
		int length = a.length;
		for(int i=0; i<length; i++){
			System.out.print(+a[i]+"\t");
		}
		System.out.println();
	}
	/**
	 * ��ӡ��������ʱÿ10�����ֻ��У�������ʾ
	 * @param a һ��int�����飨�������ܴ�һ�����50��
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
	 * ���������е�������
	 * ���ã�
	 *  //Java����ͨ���͵ı����ǲ�֧�����ô��ݵ�
	 *  //��������������ͨ�������飨Ҳ���ڴ�ֵ���ķ�������ɶԻ����ںܶ������㷨���������ô�ɵģ���
	 *	//public static void swap(int[] data, int a, int b) {  
	 *	//	int t = data[a];  
	 *	//	data[a] = data[b];  
	 * 	//	data[b] = t;  
	 *	//}
	 * @param c int������
	 * @param a �����±�
	 * @param b �����±�
	 */      
	public static void swap(int[] c, int a, int b){
		int temp = c[a];
		c[a] = c[b];
		c[b] = temp;
	}
	/**	 
	 * ����һ������Ϊ<code>log</code>��������飬
	 * ���е����������ֵΪ<code>log-1</code>����СֵΪ<code>0</code>,�һ����ظ���		 
	 * @param  log ��������ĳ���
	 * @return �������ɺ������
	 */
	 public static int[] getRandomArray(int log){
	      int[] result = new int[log];
	      //	����һ�����飬����ÿ��ֵΪ���±�+1
	      for (int i = 0; i < log; i++) {
	              result[i] = i + 1;
	      }
	      //	ÿ�����һ���������䰴�մ�ǰ�����������һ��ֵ�������Դﵽ��������Ŀ��
	      for (int i = 0; i < log; i++) {
	              int random = (int) (log * Math.random());
	              swap(result, random, i);
	     }
	     return result;
	 }	 
	 /**
	  *	�������һ��int�Ͷ�ά����
	  *	@param row ���ɶ�ά���������
	  *	@param col ���ɶ�ά���������
	  *	@return �������ɺ�Ķ�ά����
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
