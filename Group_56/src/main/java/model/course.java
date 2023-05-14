package Group_56.src.main.java.model;
public class course {
    String course_id;
    String course_title;
    String description;
    String duration;
    String course_price;
    // Trainer and Lesson's are different objects/classes, and as they are not implemented yet, they will be commented out.
    // They are just here to show that they would normally be associated in this course class.
    // Trainer trainer = new Trainer();
    // Lesson lessons = new Lesson();
    
    public course(String id, String title, String desc, String dura, String price) {
       course_id = id;
       course_title = title;
       description = desc;
       duration = dura;
       course_price = price;
    }

    // Getter functions for course attributes
    public String get_title() {
        return course_title;
    }
    
    public String get_description() {
        return description;
    }

    public String get_duration() {
        return duration;
    }

    public String get_price() {
        return course_price;
    }
}
