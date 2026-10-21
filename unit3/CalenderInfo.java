import java.util.Calendar;
import java.util.Date;

class CalenderInfo
{
    public static void main(String args[])
    {
        Calendar c = Calendar.getInstance();

        System.out.println("Current Date: " + c.getTime());

        c.add(Calendar.DAY_OF_MONTH, 5);
        System.out.println("After 5 Days: " + c.getTime());

        c.add(Calendar.DAY_OF_MONTH, -10);
        System.out.println("After Subtracting 10 Days: " + c.getTime());

        c.add(Calendar.MONTH, 2);
        System.out.println("After 2 Months: " + c.getTime());

        c.add(Calendar.MONTH, -1);
        System.out.println("After Subtracting 1 Month: " + c.getTime());
    }
}