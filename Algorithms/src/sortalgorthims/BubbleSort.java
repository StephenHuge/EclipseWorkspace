package sortalgorthims;

public class BubbleSort {	
	
	public static void main(String[] args){		
		int[] a = {11,25,32,1,3,4,37,12,33,13,32,10,38,58,
				7,4,63,33,6,43,4,21,14,24,62,4,42,1};
		Tool.print(a);		
		int[] b = bubbleSort(a);
		Tool.print(b);		
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
}	
/*	public static void print(int[] a){
		int length = a.length;
		for(int i=0; i<length-1; i++){
			System.out.print(a[i]+" ");
		}
	}*/
	
	/**
	 * Java����ͨ���͵ı����ǲ�֧�����ô��ݵ�
	 * ��������������ͨ�������飨Ҳ���ڴ�ֵ���ķ�������ɶԻ����ںܶ������㷨���������ô�ɵģ���
	 * 
	 * public static void swap(int[] data, int a, int b) {  
     * 	 int t = data[a];  
     *	 data[a] = data[b];  
     *   data[b] = t;  
     * }
     */
	/*public static void swap(int[] c, int a, int b){
		int temp = c[a];
		c[a] = c[b];
		c[b] = temp;
	}*/
	

