package test;

public class Thread1Test {
	public static void main(String[] args){
		Thread1 t = new Thread1();
		Thread r1 = new Thread(t, "Ò»ºÅ");
		Thread r2 = new Thread(t, "¶şºÅ");
		r1.start();
		r2.start();
	}
}
