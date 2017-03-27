package test;

import sortalgorthims.Tool;

public class SearchMatrix {
	public static final int A = 1;
	public static final int B = 2;
	public static final int C = 3;
	public static final int D = 4;
	
	public static void main(String[] args){
		int[][] a = Tool.getRandomMatrix2(4, 5);
		for(int i=0; i<a.length; i++)
			Tool.print(a[i]);
		boolean b = searchMatrix(a, 4);
		Tool.print(b+"");
	}
	
	public static boolean searchMatrix(int[][] a, int s){		
		
		int rFlag_min = 0;              //最小行数为0
		int cFlag_min = 0;              //最小列数为0
		int rFlag_max = a.length-1;     //最大行数为数组的行数
		int cFlag_max = a[0].length-1;  //最大列数为数组的列数
		
		int bMin = a[rFlag_min][cFlag_min];	 //数组左上角的数
		int bMax = a[rFlag_max][cFlag_max];  //数组右下角的数
		 
		while(s>=bMin && s<=bMax){
			if (rFlag_max-rFlag_min >= cFlag_max-cFlag_min ){
				changeCol(cFlag_min, cFlag_max, rFlag_min, rFlag_max, a, s);				
			}
			if (rFlag_max-rFlag_min < cFlag_max-cFlag_min ){
				changeRow(rFlag_min, rFlag_max, rFlag_min, rFlag_max, a, s);				
			}
			bMin = a[rFlag_min][cFlag_min];	 //数组左上角的数
			bMax = a[rFlag_max][cFlag_max];  //数组右下角的数
			
			if (bMin==s || bMax==s)	return true;
			if (bMin==bMax)			return false;
		} 		 
		return false;
	}
	public static void changeCol(int c_min, int c_max, int r_min, int r_max, int[][] a, int s){
		int cTemp = (c_min + c_max) / 2;
		if (a[r_min][cTemp]<s){
			c_max = cTemp - 1;
			return;
		}
		if (a[r_max][cTemp-1]>s){
			c_min = cTemp;
			return;
		}					
	}
	public static void changeRow(int c_min, int c_max, int r_min, int r_max, int[][] a, int s){
		int rTemp = (r_min + r_max) / 2;
		if (a[c_min][rTemp]<s){
			r_max = rTemp - 1;
			return;
		}
		if (a[c_max][rTemp-1]>s){
			r_min = rTemp;
			return;
		}			
	}
	
}
