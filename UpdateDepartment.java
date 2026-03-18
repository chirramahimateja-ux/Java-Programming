import java.sql.*;
import java.util.Scanner;

public class UpdateDepartment {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/studentdb", "root", "Learning@sri143");

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter dept id to update: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter new dept name: ");
            String name = sc.nextLine();

            System.out.print("Enter new dept location: ");
            String location = sc.nextLine();

            PreparedStatement ps =
                con.prepareStatement(
                    "UPDATE Department SET dname=?, dlocation=? WHERE did=?");

            ps.setString(1, name);
            ps.setString(2, location);
            ps.setInt(3, id);

            ps.executeUpdate();
            System.out.println("Record updated");

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
