class Buffer 
{
    int data;
    boolean available = false;

    synchronized void produce(int value) throws InterruptedException 
    {
        if (available) 
        {
            wait(); // wait if data already exists
        }
        data = value;
        System.out.println("Produced: " + data);
        available = true;
        notify(); // notify consumer
    }

    synchronized void consume() throws InterruptedException 
    {
        if (!available) 
        {
            wait(); // wait if no data
        }
        System.out.println("Consumed: " + data);
        available = false;
        notify(); // notify producer
    }
}

class Producer extends Thread 
{
    Buffer b;

    Producer(Buffer b) 
    {
        this.b = b;
    }

    public void run() 
    {
        int i = 1;
        try 
        {
            while (true) 
            {
                b.produce(i++);
                Thread.sleep(1000);
            }
        } 
        catch (Exception e) 
        {
            System.out.println(e);
        }
    }
}

class Consumer extends Thread 
{
    Buffer b;

    Consumer(Buffer b) 
    {
        this.b = b;
    }

    public void run() 
    {
        try 
        {
            while (true) 
            {
                b.consume();
                Thread.sleep(1500);
            }
        }
        catch (Exception e) 
        {
            System.out.println(e);
        }
    }
}

public class Test 
{
    public static void main(String[] args) 
    {
        Buffer b = new Buffer();

        Producer p = new Producer(b);
        Consumer c = new Consumer(b);

        p.start();
        c.start();
    }
}