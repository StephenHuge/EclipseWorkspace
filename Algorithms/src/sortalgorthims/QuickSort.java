package sortalgorthims;

public class QuickSort {
	public static void main(String[] args){
		int[] a = Tool.getRandomArray(9546400);	//����һ������Ϊ9546400������
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
//		if(a[left]>a[right])	//�����Ҷ˱���˴�
//			Tool.swap(a, left, right);
//		if(a[mid]>a[right])		//�����Ҷ˱��м��
//			Tool.swap(a, mid, right);
//		//��ʱ�Ҷ����ֻ��Ҫ�Ƚ���˺��м䣬ȡ�ϴ�ֵ����
//		if(a[mid]>a[left])		//������˴����м�ֵ
//			Tool.swap(a, left, right);							
//		return a[left];
//	} 
	public static int quickAdjust(int[] a, int left, int right){	
		int pivot = a[left];
//		��pivot��ȡ�������Ż�
//		int pivot = medianOfThree(a, left, right);	//�����в�ͨ����				
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
	    // ������ߵ���(left)Ϊ��׼
	    int base = list[left];
	    while (left < right) {
	        // �������Ҷ˿�ʼ�����������ֱ���ҵ�С��base����
	        while (left < right && list[right] >= base)
	            right--;
	        // �ҵ��˱�baseС��Ԫ�أ������Ԫ�طŵ�����ߵ�λ��
	        list[left] = list[right];	 
	        // ��������˿�ʼ�����ұ�����ֱ���ҵ�����base����
	        while (left < right && list[left] <= base)
	            left++;
	        // �ҵ��˱�base���Ԫ�أ������Ԫ�طŵ����ұߵ�λ��
	        list[right] = list[left];
	    }	 
	    // ���base�ŵ�leftλ�á���ʱ��leftλ�õ������ֵӦ�ö���leftС��
	    // ��leftλ�õ��Ҳ���ֵӦ�ö���left��
	    list[left] = base;
	    return left;
	}	 
	private static int[] quickSort(int[] list, int left, int right) {	 
	    // ���±�һ��С�����±꣬�����Խ����
	    if (left < right) {
	        // ��������зָȡ���´ηָ�Ļ�׼���
	        int base = division(list, left, right);	 	 
	        // �ԡ���׼��š�����һ����ֵ���еݹ���и�����ڽ���Щ��ֵ����������
	        quickSort(list, left, base - 1);	 
	        // �ԡ���׼��š��Ҳ��һ����ֵ���еݹ���и�����ڽ���Щ��ֵ����������
	        quickSort(list, base + 1, right);
	    }
	    return list;
	}
}
*/