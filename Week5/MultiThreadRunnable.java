class Runnable1 implements Runnable 
{
    public void run() 
    {
        while (true) 
        {
            System.out.println("Good Morning");
            try 
            {
                Thread.sleep(1000);
            } 
            catch (InterruptedException e) 
            {
                System.out.println(e);
            }
        }
    }
}

class Runnable2 implements Runnable 
{
    public void run() 
    {
        while (true) 
        {
            System.out.println("Hello");
            try 
            {
                Thread.sleep(2000);
            }
            catch (InterruptedException e) 
            {
                System.out.println(e);
            }
        }
    }
}

class Runnable3 implements Runnable 
{
    public void run() 
    {
        while (true) 
        {
            System.out.println("Welcome");
            try 
            {
                Thread.sleep(3000);
            } 
            catch (InterruptedException e) 
            {
                System.out.println(e);
            }
        }
    }
}

public class MultiThreadRunnable
{
    public static void main(String[] args) 
    {
        Thread t1 = new Thread(new Runnable1());
        Thread t2 = new Thread(new Runnable2());
        Thread t3 = new Thread(new Runnable3());

        t1.start();
        t2.start();
        t3.start();
    }
}