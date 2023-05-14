public class trainee {
    int userId;
    String user_name;
    String user_username;
    String user_password;
    public trainee(int id, String name, String username, String password) {
       userId = id;
       user_name = name;
       user_username = username;
       user_password = password;
    }

    public int getUserID() {
        return userId;
    }

    public String getUser_Name() {
        return user_name;
    }

    public String getUser_UserName() {
        return user_username;
    }

    public String getUser_Password() {
        return user_password;
    }

    // Function to display courses. Temporarily this will only have 1 course just for showcase purposes.
    public void viewCourses() {
        System.out.println("Course: Software Engineering Fundamental's");
    }

    // This function would send the refund request into the system, which the finance manager will be able to view later.
    public void requestRefund(String course, String reason) {
        //Saved into system
    }

    //This function serves as a dummy, normally it would send the file into a system.
    public void sendComplaint(String complaint) {
        // Sent into the system
    }
}
