class Outer2
{
    static int a = 10;

    static class Inner
    {
        void display()
        {
            System.out.println("Value of a = " + a);
        }
    }

    public static void main(String args[])
    {
        Outer2.Inner obj = new Outer2.Inner();
        obj.display();
    }
}