public class OrganizationService {

    public static int getLeaveLimit(int choice) {

        switch(choice) {
            case 1: return 4;   // IT Company
            case 2: return 3;   // College
            case 3: return 4;   // Hospital
            default: return 0;
        }
    }
}