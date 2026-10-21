class Outer
{
    interface Inner
    {
        void display();
    }
}

class Test implements Outer.Inner
{
    public void display()
    {
        System.out.println("Hello Nested Interface");
    }

    public static void main(String args[])
    {
        Test obj = new Test();
        obj.display();
    }
}