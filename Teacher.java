public class Teacher {
    //fields
    private String firstName, lastName, subject, teacher;
    //constructor with initial values
    public Teacher() {
        firstName = "";
        lastName = "";
        subject = "";
    }
    //getter that returns value teacher
    public String getTeacher() {
        return teacher;
    }
    //setter for teacher, parameters are taken from school.java
    public void setTeacher(String fName, String lName, String sub) {
        this.firstName = fName;
        this.lastName = lName;
        this.subject = sub;
        teacher = ("\"Name: " + firstName + " " + lastName + " Subject: " + subject + "\"");
    }
}
