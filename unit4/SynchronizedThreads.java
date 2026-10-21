class SynchronizedThreads
{
    synchronized void display()
    {
        for (int i = 1; i <= 5; i++)
        {
            System.out.println(i);
        }
    }

    public static void main(String args[])
    {
        SynchronizedThreads obj = new SynchronizedThreads();

        Thread t1 = new Thread(() -> obj.display());
        Thread t2 = new Thread(() -> obj.display());

        t1.start();
        t2.start();
    }
}