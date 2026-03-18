import java.sql.*;
import java.util.Scanner;

public class DeleteDepartment {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/studentdb", "root", "Learning@sri143");

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter dept id to delete: ");
            int id = sc.nextInt();

            PreparedStatement ps =
                con.prepareStatement("DELETE FROM Department WHERE did=?");

            ps.setInt(1, id);
            ps.executeUpdate();

            System.out.println("Record deleted");

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
