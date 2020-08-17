import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        School nSchool = new School();
        String exit, prompt;
        System.out.println("List of Teachers");
        nSchool.showTeach();
        System.out.println("List of Students");
        nSchool.showStud();
        prompt = ("1 to add  a teacher, 2 to add  a student, 3 to delete a teacher, 4 to delete a student \n" +
                "5 to show all teachers, 6 to show all students, 7 to show school, 0 to exit program,");
        System.out.println(prompt);
        exit = "";
        //while loop keeps the program running
        while (!exit.equals("0")) {
            Scanner scan = new Scanner(System.in);
            String option = scan.nextLine();
            switch (option) {
                case "0":
                    exit = "0";
                    break;
                case "1":
                    nSchool.setTeach();
                    System.out.println(prompt);
                    break;
                case "2":
                    nSchool.setStud();
                    System.out.println(prompt);
                    break;
                case "3":
                    nSchool.delTeach();
                    System.out.println(prompt);
                    break;
                case "4":
                    nSchool.delStud();
                    System.out.println(prompt);
                    break;
                case "5":
                    nSchool.showTeach();
                    System.out.println(prompt);
                    break;
                case "6":
                    nSchool.showStud();
                    System.out.println(prompt);
                    break;
                case "7":
                    System.out.println(nSchool.getSch());
                    System.out.println(prompt);
                    break;
            }
        }
    }
}

