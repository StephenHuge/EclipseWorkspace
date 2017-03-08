package sortalgorthims;

public class HeapSort {
	
	public static void main(String[] args){
//		int[] a = {5,1,3,4,9,6,7,8,2};
		int[] a = Tool.getRandomArray(300000);
//		int[] a = Tool.getRandomArray(9546400);	//����һ������Ϊ9546400������
//		Tool.printL(a);
		Tool.print("--------------------------------------");		
		int[] b = heapSort(a);
		Tool.printL(b);
	}
	
	public static void heapAdjust(int[] array, int parent, int length) {
	    int temp = array[parent]; // temp���浱ǰ���ڵ�	   
	    int child = 2 * parent + 1; // �Ȼ������	 
	    while (child < length) {	    	
	        // ������Һ��ӽ�㣬�����Һ��ӽ���ֵ�������ӽ�㣬��ѡȡ�Һ��ӽ��
	        if (child + 1 < length && array[child] < array[child + 1]) 
	            child++;	           	        
	        // ���������ֵ�Ѿ����ں��ӽ���ֵ����ֱ�ӽ���	        
	        if (temp >= array[child])
	            break;	 
	        // �Ѻ��ӽ���ֵ���������	        
	        array[parent] = array[child];	 
	        // ѡȡ���ӽ������ӽ��,��������ɸѡ
	        parent = child;	        
	        child = 2 * child + 1;	        
	    }	 
	    array[parent] = temp;	    
	}
	 
	public static int[] heapSort(int[] list) {
	    // ѭ��������ʼ��
		int length = list.length;
	    for (int i = length / 2; i >= 0; i--) {
	        heapAdjust(list, i, length - 1);
	    }	    
	    // ����n-1��ѭ�����������
	    for (int i = length - 1; i > 0; i--) {
	        // ���һ��Ԫ�غ͵�һԪ�ؽ��н���
	        Tool.swap(list, 0, i);	 
	        // ɸѡ R[0] ��㣬�õ�i-1�����Ķ�
	        heapAdjust(list, 0, i);
	    }	  
	    return list;
	}
}
