import java.sql.*;

public class LeaveService {

    public static void processLeave(Connection con, String name,
                                    int taken, int requested,
                                    int leaveLimit) throws Exception {

        String status;
        String impact;

        if((taken + requested) <= leaveLimit) {

            status = "Approved";

            if(requested >= 3)
                impact = "High";
            else if(requested == 2)
                impact = "Medium";
            else
                impact = "Low";

            System.out.println("Leave Approved ");
            System.out.println("Operational Impact: " + impact);

        } else {
            status = "Rejected";
            impact = "High";

            System.out.println("Leave Rejected ");
            System.out.println("Reason: Monthly limit exceeded");
        }

        PreparedStatement ps = con.prepareStatement(
            "INSERT INTO leave_records(name, taken, requested, status, impact) VALUES(?,?,?,?,?)"
        );
        ps.setString(1, name);
        ps.setInt(2, taken);
        ps.setInt(3, requested);
        ps.setString(4, status);
        ps.setString(5, impact);
        ps.executeUpdate();

        System.out.println("Record Saved Successfully ");
    }
}