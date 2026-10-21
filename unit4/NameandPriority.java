class NameandPriority extends Thread
{
    public void run()
    {
        System.out.println("Thread Name: " + getName());
        System.out.println("Thread Priority: " + getPriority());
    }

    public static void main(String args[])
    {
        NameandPriority  t = new NameandPriority ();

        t.setName("MyThread");
        t.setPriority(8);

        t.start();
    }
}