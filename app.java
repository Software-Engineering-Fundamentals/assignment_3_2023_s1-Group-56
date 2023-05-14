import java.util.Scanner;

class app {
    public static void main(String[] args) {
        // test abc = new test("input");
        // abc.printInput();
        RoleMenu();
    }

    // Menu to select role to simulate
    public static void RoleMenu() {
        System.out.println("Select Role: ");
        System.out.print("1: Trainee\n2: Finance Manager\n3: Manager\n");

        // Reading an int to choose a role
        Scanner in = new Scanner(System.in);
        int userInput = in.nextInt();

        
        if (userInput == 1) { 
            traineeOption();
        } else if (userInput == 2) {
            financeManagerOption();
        } else if (userInput == 3) {
            managerOption();
        } else {
            System.out.println("Input was invalid");
        }

        in.close();
    }

    public static void traineeOption() {
        // This user is just an example trainee, that was initialised for the purposes of this showcase. 
        // Normally the user themselves would login and the system would then grab the user's info.
        trainee user = new trainee(0001, "John Proctor", "JohnProctor43", "applebubblegum");
        System.out.println("1: File Complaint");
        System.out.println("2: Request Refund");

        Scanner in = new Scanner(System.in);
        int userInput = in.nextInt();
        String userReason = in.nextLine();
        if (userInput == 1) {
            //File Complaint
            System.out.println("File Complaint has been chosen.");
            System.out.println("Enter your complaint: ");
            String userComplaint = in.nextLine();
            // The user's feedback/complaint would be sent into the system
            user.sendComplaint(userComplaint);
            // Afterwards the user would get a Thank You message and notification about an email that will appear when feedback has been looked at.
            System.out.println("Thank you for the feedback. We will send you an email when the feedback has been looked at.");
        } else if (userInput == 2) {
            //Refund Request
            System.out.println("Refund Request has been chosen.");
            user.viewCourses();
            System.out.println("Provide a reason for refund: ");
            userReason = in.nextLine();
            //The user's request will be sent into the system.
            user.requestRefund("Software Engineering Fundamental's", userReason);
            // When the request has been successfully sent to the system, the trainee will get a message, saying Thank You but
            // also notifying them that they will get an email when the request has been looked at.
            System.out.println("Thank you for sending a request. An email will be sent when the request has been looked at.");
        }

        in.close();
    }

    public static void financeManagerOption() {

    }

    public static void managerOption() {

    }

}