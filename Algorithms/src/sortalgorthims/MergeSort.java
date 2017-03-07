package sortalgorthims;

public class MergeSort {
	
	public static void main(String[] args){
		int[] a = Tool.getRandomArray(9546400);	//����һ������Ϊ9546400������
//		int[] a = {11,25,32,1,3,4,37,12,33,13,32,10,38,58,7,4,63,33,6,43,4,21,14,24,62,4,42,1};
//		Tool.print(a);
		Tool.print("--------------------------------------");
//		int[] b = bubbleSort(a);
		int[] b = sort(a);
		Tool.printL(b);
	}
	public static void Merge(int[] array, int low, int mid, int high) {
	    int i = low; // i�ǵ�һ�����е��±�
	    int j = mid + 1; // j�ǵڶ������е��±�
	    int k = 0; // k����ʱ��źϲ����е��±�
	    int[] array2 = new int[high - low + 1]; // array2����ʱ�ϲ�����
	    // ɨ���һ�κ͵ڶ������У�ֱ����һ��ɨ�����
	    while (i <= mid && j <= high) {
	        // �жϵ�һ�κ͵ڶ���ȡ�������ĸ���С���������ϲ����У�����������ɨ��
	        if (array[i] <= array[j]) {
	            array2[k] = array[i];
	            i++;
	            k++;
	        } else {
	            array2[k] = array[j];
	            j++;
	            k++;
	        }
	    }
	    // ����һ�����л�ûɨ���꣬����ȫ�����Ƶ��ϲ�����
	    while (i <= mid) {
	        array2[k] = array[i];
	        i++;
	        k++;
	    }
	    // ���ڶ������л�ûɨ���꣬����ȫ�����Ƶ��ϲ�����
	    while (j <= high) {
	        array2[k] = array[j];
	        j++;
	        k++;
	    }
	    // ���ϲ����и��Ƶ�ԭʼ������
	    for (k = 0, i = low; i <= high; i++, k++) {
	        array[i] = array2[k];
	    }
	}
	public static void MergePass(int[] array, int gap, int length) {
	    int i = 0;
	    //	�鲢gap���ȵ����������ӱ�
	    for (i = 0; i + 2 * gap - 1 < length; i = i + 2 * gap) {
	        Merge(array, i, i + gap - 1, i + 2 * gap - 1);
	    }
	    // ���������ӱ����߳���С��gap
	    if (i + gap - 1 < length) {
	        Merge(array, i, i + gap - 1, length - 1);
	    }
	}
	public static int[] sort(int[] list) {
	    for (int gap = 1; gap < list.length; gap = 2 * gap) {
	        MergePass(list, gap, list.length);	        
	    }
	    return list;
	}
}
