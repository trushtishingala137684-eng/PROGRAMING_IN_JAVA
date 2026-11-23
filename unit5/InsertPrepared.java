import java.sql.*;

class InsertPrepared {
    public static void main(String args[]) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection con = DriverManager.getConnection(
                "jdbc:oracle:thin:@localhost:1521:xe",
                "system", "1234");

            PreparedStatement ps = con.prepareStatement(
                "INSERT INTO student VALUES(?,?,?)");

            ps.setInt(1, 2);
            ps.setString(2, "Amit");
            ps.setInt(3, 90);

            int i = ps.executeUpdate();

            System.out.println(i + " Record Inserted");

            con.close();
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}