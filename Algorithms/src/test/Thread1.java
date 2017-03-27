package test;

public class Thread1 implements Runnable{
	int k = 10;
	public void run(){	
//		int k = 10;
		for(int i=1;i<k;i++){
			System.out.println(Thread.currentThread().getName()+"Hello" + i);
		}
	}
}

