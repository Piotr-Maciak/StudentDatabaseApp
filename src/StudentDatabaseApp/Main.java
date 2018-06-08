package StudentDatabaseApp;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


	    // Ask how many new users we want to add
        System.out.println("Enter a number of students to enroll: ");
        Scanner sc = new Scanner(System.in);
        int numberOfStudents = sc.nextInt();
        Student[] students = new Student[numberOfStudents];

        //Create n number of new students
        for (int n = 0; n < numberOfStudents; n++){
            students[n] = new Student();
            students[n].enroll();
            students[n].payTuition();

        }
        for (int n = 0; n < numberOfStudents; n++){

            System.out.println(students[n].toString());

        }
    }
}
