public class Student {
    //fields
    private String firstName, lastName, student, grade;
    int studentNumber;
    //constructor with initial number
    public Student() {
        firstName = "";
        lastName = "";
        grade = "";
        studentNumber = 0;
    }
    //getter than returns value student
    public String getStudent() {
        return student;
    }
    //setter for student, parameters are in school.java
    public void setStudent(String fName, String lName, String gra) {
        this.firstName = fName;
        this.lastName = lName;
        this.grade = gra;
        //generates random studentNumber
        this.studentNumber = (int)(Math.random()*999999);
        student = ("\"Name: " + firstName + " " + lastName + " Grade: " + grade + ", " + studentNumber + "\"" );
    }
}
