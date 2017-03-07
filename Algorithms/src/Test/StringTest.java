package Test;

public class StringTest {
	public static void main(String[] args){
//		int num = 10;
//		String a = "unchanged.";
//		StringBuilder b = new StringBuilder("unchanged.");
//		changeInt(num);
//		changeStr(a);
//		changeStrB(b);
//		System.out.println(num);
//		System.out.println(a);
//		System.out.println(b);
		int[] a = {1,2};
		int[] b = a;
		b[1] = 5;
		System.out.println(a[1]);
	}
	
	public static int changeInt(int a){
		a = 20;
		return a;
	}
	public static String changeStr(String s){
		s = "changed.";
		return s;
	}
	public static StringBuilder changeStrB(StringBuilder sb){
		sb.delete(0, 10);
		sb.append("changed.");
		return sb;
	}
}
