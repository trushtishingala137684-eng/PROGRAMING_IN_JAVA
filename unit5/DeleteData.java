import java.sql.*;

class DeleteData {
    public static void main(String args[]) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection con = DriverManager.getConnection(
                "jdbc:oracle:thin:@localhost:1521:xe",
                "system", "1234");

            Statement st = con.createStatement();

            int i = st.executeUpdate(
                "DELETE FROM student WHERE rollno=1");

            System.out.println(i + " Record Deleted");

            con.close();
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}