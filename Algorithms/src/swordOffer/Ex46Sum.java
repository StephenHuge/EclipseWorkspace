package swordOffer;

import java.util.Scanner;

public class Ex46Sum {
	public static void main(String[] args){
		int n = 15;
//		int sum = new Ex46Sum().sum(n);
		Scanner scan = new Scanner(System.in);
		System.out.println("Input n:");
		n = scan.nextInt();
		int sol = 0;
		sol = sum(n, sol);
		System.out.println("Sum from 1 to n is " + sol);	
	}
	public static int sum(int n, int sol){
//		return n * (n + 1) / 2;
//		try{
//			int[] array = new int[n-2];
//			return n+sum(n-1);
//		}catch(Exception e){
//			return 1;
//		}
		boolean is_end = true;
		sol += n;
		is_end=(n>0) && ((sol=sum(sol, --n))>0);
		return sol;
	}
}
