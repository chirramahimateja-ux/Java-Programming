import java.sql.*;

public class ReadDepartment {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/studentdb", "root", "Learning@sri143");

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM Department");

            while (rs.next()) {
                System.out.println(
                    rs.getInt("did") + " " +
                    rs.getString("dname") + " " +
                    rs.getString("dlocation"));
            }

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
