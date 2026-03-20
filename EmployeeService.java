import java.sql.*;

public class EmployeeService {

    public static void updateCredit(Connection con, String colleague, int requested) throws Exception {

        PreparedStatement checkEmp = con.prepareStatement(
            "SELECT * FROM employees WHERE name=?");
        checkEmp.setString(1, colleague);
        ResultSet rs = checkEmp.executeQuery();

        if(rs.next()) {
            int credits = rs.getInt("credit_points");
            credits += requested;

            PreparedStatement updateCredit = con.prepareStatement(
                "UPDATE employees SET credit_points=? WHERE name=?");
            updateCredit.setInt(1, credits);
            updateCredit.setString(2, colleague);
            updateCredit.executeUpdate();

            System.out.println(colleague + " earned " + requested + " credit points.");
        } else {
            PreparedStatement insertEmp = con.prepareStatement(
                "INSERT INTO employees(name, credit_points) VALUES(?,?)");
            insertEmp.setString(1, colleague);
            insertEmp.setInt(2, requested);
            insertEmp.executeUpdate();

            System.out.println(colleague + " added with credit points.");
        }
    }
}