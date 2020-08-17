import java.util.ArrayList;
import java.util.Scanner;

public class School {
    ArrayList<String> teachers = new ArrayList<>();
    ArrayList<String> students = new ArrayList<>();
    ArrayList<String> subjects = new ArrayList<>();
    //fields, firstN for first name, lastN for last name, subj for subject, sch for school, grad for grade
    String firstN, lastN, subj, sch, grad;
    //constructors that add teachers, students. and subjects
    public School() {
        teachers.add("teachers");
        students.add("students");
        subjects.add("Math, Science, Java");
    }
    public String getSch() {
        sch = "" + teachers + "\n" + students + "\n" + subjects;
        return sch;
    }
    //takes user input and stores them in variables which are accessed by student and teacher class and then
    public void setTeach() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter teachers first name: ");
        firstN = scan.nextLine();
        System.out.println("Enter teachers last name: ");
        lastN = scan.nextLine();
        System.out.println("Enter teachers subject: ");
        subj = scan.nextLine();
        Teacher setT = new Teacher();
        setT.setTeacher(firstN, lastN, subj);
        teachers.add(setT.getTeacher());
    }
    public void setStud() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter students first name: ");
        firstN = scan.nextLine();
        System.out.println("Enter students last name: ");
        lastN = scan.nextLine();
        System.out.println("Enter students grade: ");
        grad = scan.nextLine();
        Student setS = new Student();
        setS.setStudent(firstN, lastN, grad);
        students.add(setS.getStudent());
    }
    //scans user input and deletes the value of selected index
    public void delTeach() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter index to delete teacher");
        int i = scan.nextInt();
        teachers.remove(i);
    }
    public void delStud() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter index to delete student");
        int i = scan.nextInt();
        students.remove(i);
    }
    public void showTeach() {
        System.out.println(teachers);
    }
    public void showStud() {
        System.out.println(students);
    }
}

