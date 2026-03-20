import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

   static final String URL = "jdbc:mysql://localhost:3306/leave_db4";
static final String USER = "root";
static final String PASSWORD = "GUBBALA@131.in";


    public static Connection getConnection() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}