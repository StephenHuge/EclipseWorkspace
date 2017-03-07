package Bank;

public class NumberTest1
{
	public static void main(String[] args)
	{
		NumberHolder numberHolder = new NumberHolder();

		Thread t1 = new IncreaseThread(numberHolder);
		Thread t2 = new DecreaseThread(numberHolder);
		Thread t3 = new IncreaseThread(numberHolder);
		Thread t4 = new DecreaseThread(numberHolder);

		t1.start();
		t2.start();

		t3.start();
		t4.start();
	}

}