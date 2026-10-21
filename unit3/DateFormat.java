import java.text.SimpleDateFormat;
import java.util.Date;

class DateFormat
{
    public static void main(String args[])
    {
        Date d = new Date();

        SimpleDateFormat f1 = new SimpleDateFormat("dd-MM-yyyy");
        SimpleDateFormat f2 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat f3 = new SimpleDateFormat("EEEE, dd MMMM yyyy");

        System.out.println(f1.format(d));
        System.out.println(f2.format(d));
        System.out.println(f3.format(d));
    }
}