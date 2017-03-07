package Bank;

public class NumberHolder
{
	private int number;

	public synchronized void increase()
	{
		while (0 != number)
		{
			try
			{
				wait();
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}

		// ��ִ�е�����˵���Ѿ�������
		// ����numberΪ0
		number++;
		System.out.println(number);

		// ֪ͨ�ڵȴ����߳�
		notify();
	}

	public synchronized void decrease()
	{
		while (0 == number)
		{
			try
			{
				wait();
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}

		}

		// ��ִ�е�����˵���Ѿ�������
		// ����number��Ϊ0
		number--;
		System.out.println(number);
		notify();
	}

}



class IncreaseThread extends Thread
{
	private NumberHolder numberHolder;

	public IncreaseThread(NumberHolder numberHolder)
	{
		this.numberHolder = numberHolder;
	}

	@Override
	public void run()
	{
		for (int i = 0; i < 20; ++i)
		{
			// ����һ������ʱ
			try
			{
				Thread.sleep((long) Math.random() * 1000);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}

			// �������Ӳ���
			numberHolder.increase();
		}
	}

}



class DecreaseThread extends Thread
{
	private NumberHolder numberHolder;

	public DecreaseThread(NumberHolder numberHolder)
	{
		this.numberHolder = numberHolder;
	}

	@Override
	public void run()
	{
		for (int i = 0; i < 20; ++i)
		{
			// ����һ������ʱ
			try
			{
				Thread.sleep((long) Math.random() * 1000);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}

			// ���м��ٲ���
			numberHolder.decrease();
		}
	}

}



