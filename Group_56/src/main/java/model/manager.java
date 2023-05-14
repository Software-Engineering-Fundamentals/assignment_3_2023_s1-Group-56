package Group_56.src.main.java.model;
public class manager {
    int userId;
    String user_name;
    String user_username;
    String user_password;
    public manager(int id, String name, String username, String password) {
       userId = id;
       user_name = name;
       user_username = username;
       user_password = password;
    }

    // Complaints should be listed out iteratively, however we will be manually printing out for this showcase.
    public void viewComplaints() {
        System.out.println("1: \"Stream quality is bad.\"");
        System.out.println("2: \"Course too hard.\"");
    }

    // Sends the response to system and the system then sends it to the user.
    public void respondToComplaints(String response) {
        System.out.println("Response has been sent.");
    }
}