import java.sql.*;

class UpdateDeletePrepared {
    public static void main(String args[]) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection con = DriverManager.getConnection(
                "jdbc:oracle:thin:@localhost:1521:xe",
                "system", "1234");

            PreparedStatement ps1 = con.prepareStatement(
                "UPDATE student SET marks=? WHERE rollno=?");

            ps1.setInt(1, 95);
            ps1.setInt(2, 2);

            int a = ps1.executeUpdate();

            System.out.println(a + " Record Updated");
            PreparedStatement ps2 = con.prepareStatement(
                "DELETE FROM student WHERE rollno=?");

            ps2.setInt(1, 2);

            int b = ps2.executeUpdate();

            System.out.println(b + " Record Deleted");

            con.close();
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}