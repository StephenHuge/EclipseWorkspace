package Bank;

public class ThreadTest
{
    public static void main(String[] args)
    {
        Example example = new Example();

        Thread t1 = new Thread1(example);

        // 此处即便传入不同的对象，静态方法同步仍然不允许多个线程同时执行
        example = new Example();

        Thread t2 = new Thread2(example);

        t1.start();
        t2.start();
    }

}

class Example
{
    public synchronized static void execute()
    {
        for (int i = 0; i < 20; ++i)
        {
            try
            {
                Thread.sleep((long) Math.random() * 1000);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
            System.out.println("Hello: " + i);
        }
    }

    public synchronized  void execute2()
    {
        for (int i = 0; i < 20; ++i)
        {
            try
            {
                Thread.sleep((long) Math.random() * 1000);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
            System.out.println("World: " + i);
        }
    }

}

class Thread1 extends Thread
{
    private Example example;

    public Thread1(Example example)

    {
        this.example = example;
    }

    @Override
    public void run()
    {
        Example.execute();
    }

}

class Thread2 extends Thread
{
    private Example example;

    public Thread2(Example example)
    {
        this.example = example;
    }

    @Override
    public void run()
    {
//        Example.execute2();
        example.execute2();
    }

}