import java.sql.*;
import java.util.Scanner;

public class InsertDepartment {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/studentdb", "root", "Learning@sri143");

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter dept id: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter dept name: ");
            String name = sc.nextLine();

            System.out.print("Enter dept location: ");
            String location = sc.nextLine();

            PreparedStatement ps =
                con.prepareStatement("INSERT INTO Department VALUES(?,?,?)");

            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setString(3, location);

            ps.executeUpdate();
            System.out.println("Record inserted");

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
