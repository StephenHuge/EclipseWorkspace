package test;

public class Thread1Test {
	public static void main(String[] args){
		Thread1 t = new Thread1();
		Thread r1 = new Thread(t, "һ��");
		Thread r2 = new Thread(t, "����");
		r1.start();
		r2.start();
	}
}
