import java.sql.*;

class DisplayData {
    public static void main(String args[]) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection con = DriverManager.getConnection(
                "jdbc:oracle:thin:@localhost:1521:xe",
                "system", "1234");

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery(
                "SELECT * FROM student");

            while(rs.next()) {
                System.out.println("Roll No: " + rs.getInt(1));
                System.out.println("Name: " + rs.getString(2));
                System.out.println("Marks: " + rs.getInt(3));
            }

            con.close();
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}