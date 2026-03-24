class Thread1 extends Thread 
{
    public void run() 
   {
        while (true) 
        {
            System.out.println("Good Morning");
            try {
                Thread.sleep(1000); // 1 second
            } 
            catch (InterruptedException e) 
           {
                System.out.println(e);
            }
        }
    }
}

class Thread2 extends Thread 
{
    public void run() 
    {
        while (true) 
        {
            System.out.println("Hello");
            try 
            {
                Thread.sleep(2000); // 2 seconds
            }
            catch (InterruptedException e) 
            {
                System.out.println(e);
            }
        }
    }
}

class Thread3 extends Thread 
{
    public void run() 
    {
        while (true) 
        {
            System.out.println("Welcome");
            try 
            {
                Thread.sleep(3000); // 3 seconds
            } 
            catch (InterruptedException e) 
            {
                System.out.println(e);
            }
        }
    }
}

public class MultiThreadDemo 
{
    public static void main(String[] args) 
    {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        Thread3 t3 = new Thread3();

        t1.start();
        t2.start();
        t3.start();
    }
}