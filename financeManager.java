public class financeManager {
    int userId;
    String user_name;
    String user_username;
    String user_password;
    public financeManager(int id, String name, String username, String password) {
       userId = id;
       user_name = name;
       user_username = username;
       user_password = password;
    }

    public void viewRefundRequests() {
        System.out.println("1: \"I dislike this course\"");
        System.out.println("2: \"Emergency situation at home\"");
    }

    public void acceptOrDeny(int choice) {
        if (choice == 1) {
            acceptRequest();
        } else if (choice == 2) {
            denyRequest();
        }
    }

    public void acceptRequest() {
        refund_payment();
        System.out.println("Refund Request Accepted.");
    }

    public void denyRequest() {
        //Sends deny result into the system
        System.out.println("Refund Request Denied.");
    }

    public void refund_payment() {
        // Payment gets refunded to user by the system. Not displayed in terminal as the finance manager won't see this.
    }
}
