class ExceptionPropagation
{
    void method1()
    {
        int a = 10 / 0;
    }

    void method2()
    {
        method1();
    }

    void method3()
    {
        try
        {
            method2();
        }
        catch (Exception e)
        {
            System.out.println("Exception handled");
        }
    }

    public static void main(String args[])
    {
        Test t = new Test();
        t.method3();
    }
}