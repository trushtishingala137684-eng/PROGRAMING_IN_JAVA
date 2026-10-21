class ExceptionChaining
{
    public static void main(String args[])
    {
        try
        {
            Exception e = new Exception("Main Exception");
            e.initCause(new ArithmeticException("Divide by zero"));

            throw e;
        }
        catch (Exception e)
        {
            System.out.println(e);
            System.out.println(e.getCause());
        }
    }
}