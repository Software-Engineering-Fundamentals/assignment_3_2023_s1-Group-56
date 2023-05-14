package Group_56.src.main.java.model;
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
        System.out.print("1: Trainee\n2: Finance Manager\n3: Manager\n4: Exit\n");

        // Reading an int to choose a role
        Scanner in = new Scanner(System.in);
        while (!in.hasNextInt()) {
            System.out.println("Please enter a valid integer: ");
            in.next();
        }
        int userInput = in.nextInt();

        
        if (userInput == 1) { 
            traineeOption();
        } else if (userInput == 2) {
            financeManagerOption();
        } else if (userInput == 3) {
            managerOption();
        } else if (userInput == 4) {
            System.out.println("Goodbye :)");
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
        System.out.println("3: Back");

        Scanner in = new Scanner(System.in);
        while (!in.hasNextInt()) {
            System.out.println("Please enter a valid integer: ");
            in.next();
        }
        int userInput = in.nextInt();
        String userReason = in.nextLine();
        if (userInput == 1) {
            //File Complaint
            System.out.println("File Complaint has been chosen.");
            System.out.println("Enter your complaint: ");
            System.out.println("Enter \"Back\" to go back.");
            String userComplaint = in.nextLine();
            if (userComplaint.equals("Back")) {
                traineeOption();
            } 
            // The user's feedback/complaint would be sent into the system
            user.sendComplaint(userComplaint);
            // Afterwards the user would get a Thank You message and notification about an email that will appear when feedback has been looked at.
            System.out.println("Thank you for the feedback. We will send you an email when the feedback has been looked at.");
        } else if (userInput == 2) {
            //Refund Request
            System.out.println("Refund Request has been chosen.");
            user.viewCourses();
            System.out.println("Provide a reason for refund: ");
            System.out.println("Enter \"Back\" to go back.");
            userReason = in.nextLine();

            if (userReason.equals("Back")) {
                traineeOption();
            } else {
                //The user's request will be sent into the system.
                user.requestRefund(user.get_course().get_title(), userReason);
                // When the request has been successfully sent to the system, the trainee will get a message, saying Thank You but
                // also notifying them that they will get an email when the request has been looked at.
                System.out.println("Thank you for sending a request. An email will be sent when the request has been looked at.");
            }
        } else if (userInput == 3) {
            RoleMenu();
        } else {
            System.out.println("Input was invalid");
        }
        

        in.close();
    }

    public static void financeManagerOption() {
        /* This is a temporary finance manager, there is currently no login system or authentification. Under normal circumstances the system would detect
        that the person who logged in had finance manager level authority however, that is not implemented currently as its not neccessary
        for this scenario.*/
        financeManager user = new financeManager(0002, "Alfred Charles", "AlfredCharles77", "DonkeyBottles93");
        System.out.println("1: Assess Refund Requests");
        System.out.println("2: Back");
        Scanner in = new Scanner(System.in);
        // In this scenario, the finance manager chooses "Assess Refund Requests". 
        while (!in.hasNextInt()) {
            System.out.println("Please enter a valid integer: ");
            in.next();
        }
        int userInput = in.nextInt();
        in.nextLine();
        if (userInput == 1) {
            // Refund requests are then displayed for the finance manager to see. Letting them choose one to review.
            System.out.println("Select a refund request to review:");
            user.viewRefundRequests();
            System.out.println("3: Back");
            while (!in.hasNextInt()) {
                System.out.println("Please enter a valid integer: ");
                in.next();
            }
            int reviewChoice = in.nextInt();
            in.nextLine();
            if (reviewChoice == 1) {
                /* Once a request has been chosen then the request will display its details. In this case that includes the title, date, course and description.
                As the date and course date is needed to determine if the user has canceled 24 hours before the start date. Those are included in the request here.
                */
                System.out.println("Title: I dislike this course");
                System.out.println("Date: 10/06/2023");
                System.out.println("Course: Software Engineering Fundamental's");
                System.out.println("Course start date: 15/05/2023");
                System.out.println("Description: ");
                System.out.println("After trying out the course for the past couple of weeks, I've found that I dislike this course.");
                System.out.println("I don't have an interest in the course anymore.");

                // Once done the finance manager is able to choose to accept or deny the request. Whichever choice they make is sent to the system.
                System.out.println("\n\n1: Accept Request\n2: Deny Request\n3: Back");
                while (!in.hasNextInt()) {
                    System.out.println("Please enter a valid integer: ");
                    in.next();
                }
                int acceptOrDeny = in.nextInt();
                in.nextLine();
                if (acceptOrDeny == 3) {
                    financeManagerOption();
                }
                user.acceptOrDeny(acceptOrDeny);
            } else if (reviewChoice == 2) {
                /* Once a request has been chosen then the request will display its details. In this case that includes the title, date, course and description.
                As the date and course date is needed to determine if the user has canceled 24 hours before the start date. Those are included in the request here.
                */
                System.out.println("Title: Emergency situation at home");
                System.out.println("Date: 10/05/2023");
                System.out.println("Course: Software Engineering Fundamental's");
                System.out.println("Course start date: 15/05/2023");
                System.out.println("Description: ");
                System.out.println("An emergency has occured back at home, so I will not be able to attend the first session in 3 days time.");
                System.out.println("As I don't want to waste money, I would like to request a refund.");

                // Once done the finance manager is able to choose to accept or deny the request. Whichever choice they make is sent to the system.
                System.out.println("\n\n1: Accept Request\n2: Deny Request\n3: Back");
                while (!in.hasNextInt()) {
                    System.out.println("Please enter a valid integer: ");
                    in.next();
                }
                int acceptOrDeny = in.nextInt();
                in.nextLine();
                
                if (acceptOrDeny == 3) {
                    financeManagerOption();
                }
                user.acceptOrDeny(acceptOrDeny);
            } else if (reviewChoice == 3) {
                financeManagerOption();
            } else {
                System.out.println("Input was invalid.");
            }
        } else if (userInput == 2) {
            RoleMenu();
        } else {
            System.out.println("Input was invalid.");
        }
        in.close();
    }

    // Menu option for manager
    public static void managerOption() {
        //Temp manager user
        manager user = new manager(0003, "Manager Guy", "ManagerGuy123123", "AlphaPlateFour");
        // The manager would have more options but for this scenario we only need view complaints.
        System.out.println("1: View Complaints ");
        System.out.println("2: Back");
        Scanner in = new Scanner(System.in);

        while (!in.hasNextInt()) {
            System.out.println("Please enter a valid integer: ");
            in.next();
        }
        int userInput = in.nextInt();
        in.nextLine();

        if (userInput == 1) {
            // Complaints are then displayed to the manager
            System.out.println("Complaint's: ");
            user.viewComplaints();
            System.out.println("3: Back");
            System.out.println("Select a complaint to review:");
            while (!in.hasNextInt()) {
                System.out.println("Please enter a valid integer: ");
                in.next();
            }
            int complaintChoice = in.nextInt();
            if (complaintChoice == 3) {
                managerOption();
            }
            in.nextLine();

            if (complaintChoice == 1) {
                // Complaint chosen is expanded
                System.out.println("Title: Stream quality is bad.");
                System.out.println("Description: \nI'm currently enrolled into the online class rather than the face to face class.");
                System.out.println("The stream quality for the online classes have been absolutely terrible. I'm not sure if ");
                System.out.println("its a camera issue or a connection issue however the video quality feels like.");
                System.out.println("I'm watching it in 360p. Which sure could have been fine back then, however with technology nowadays");
                System.out.println("I feel like it's unacceptable especially when the prices for the courses aren't exactly small."); 

                // Manager then types in their response which will get sent to the system.
                System.out.println("Please type your response to the complaint: ");
                System.out.println("Enter \"Back\" to go back.");
                String response = in.nextLine();
                if (response.equals("Back")) {
                    managerOption();
                }
                user.respondToComplaints(response);
            } else if (complaintChoice == 2) {
                // Complaint chosen is expanded
                System.out.println("Title: Course too hard.");
                System.out.println("Description: \nI'm currently enrolled in the Software Engineering Fundamental's course and");
                System.out.println("i find the course to be too hard as of currently. I believe the structure of the course could be better.");
                System.out.println("The courses feel too rushed.");

                // Manager then types in their response which will get sent to the system.
                System.out.println("Please type your response to the complaint: ");
                System.out.println("Enter \"Back\" to go back.");
                String response = in.nextLine();
                if (response.equals("Back")) {
                    managerOption();
                }
                user.respondToComplaints(response);
            } else {
                System.out.println("Input was invalid.");
            }
        } else if (userInput == 2) {
            RoleMenu();
        } else {
            System.out.println("Input was invalid.");
        }
        in.close();
    }

}