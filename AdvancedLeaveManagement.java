import java.sql.Connection;
import java.util.Scanner;

public class AdvancedLeaveManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            Connection con = DBConnection.getConnection();

            System.out.println("Select Organization Type:");
            System.out.println("1. IT Company");
            System.out.println("2. College");
            System.out.println("3. Hospital");
            int choice = sc.nextInt();

            int leaveLimit = OrganizationService.getLeaveLimit(choice);

            if(leaveLimit == 0) {
                System.out.println("Invalid choice");
                return;
            }

            sc.nextLine();
            System.out.print("Enter Employee Name: ");
            String name = sc.nextLine();

            System.out.print("Leaves Taken This Month: ");
            int taken = sc.nextInt();

            System.out.print("Leave Days Requested: ");
            int requested = sc.nextInt();

            LeaveService.processLeave(con, name, taken, requested, leaveLimit);

            if((taken + requested) <= leaveLimit) {
                sc.nextLine();
                System.out.print("Enter colleague name covering work: ");
                String colleague = sc.nextLine();

                EmployeeService.updateCredit(con, colleague, requested);
            }

            con.close();

        } catch(Exception e) {
            System.out.println(e);
        }
    }
}