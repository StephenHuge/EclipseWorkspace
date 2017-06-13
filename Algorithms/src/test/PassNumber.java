package test;

import sortalgorthims.*;
/**
 * 题目：输入为已排序的学生期末考试成绩，从小到大，再输入一个及格分数线s，求几个学生的数量。
 * （要求算法复杂度严格低于O（n），不包括O（n），不能使用各类库函数）
 * 
 * @author Steve Hu
 * @data 2017/03/31
 */
public class PassNumber {
	public static void main(String[] args){
//		int[] a = {11,25,32,1,3,4,37,12,33,13,32,10,38,
//		58,7,4,63,33,6,43,4,21,14,24,62,4,42,1};
		int[] a = Tool.getRandomArray(9546400);
		int[] b = QuickSort.quickSort(a, 0, a.length-1);
		int c = getPassNum(b, 600);
//		Tool.printL(b);
		Tool.print(c);
		
	}
	
	/**
	 * 参考算法四P241 rank()。
	 */
	public static int getPassNum(int[] a, int s) {
		int len = a.length;
		int lo = 0;
		int hi = len - 1;
		
		while(lo <= hi) {
			int mid = lo + (hi - lo) / 2;
			if(s > a[mid]) {
				lo = mid + 1;
			}else if(s < a[mid]) {
				hi = mid - 1;
			}else{
				return len - mid;
			}
		}
		return len - lo;
	}
	/*	//写的很烂
	 * @version 1.0	
		int left = 0;
		int right = a.length;
		int mid = (left + right) / 2;
		while(true){
			if(a[mid]>s){
				right = mid;
				mid = (left + right) / 2;				
			}
			if(a[mid]<=s){
				left = mid;
				mid = (left + right) / 2;
			}
			if(a[mid]==s || (a[mid-1]>s && a[mid]<s))
				return a.length - mid; 
		}
		
*/	
}
