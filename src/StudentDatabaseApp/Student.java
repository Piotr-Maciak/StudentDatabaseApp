package StudentDatabaseApp;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int year;
    private String studentID;
    private String courses = "";
    private int tuitionBalance = 0;
    private static int costOfCourse = 600;
    private static int id = 1000;
    // Constructor: prompt user to enter student's name and year

    public Student() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter Student's first name: ");
        this.firstName = sc.nextLine();

        System.out.println("Please enter Student's last name: ");
        this.lastName = sc.nextLine();

        System.out.println("Please enter Student's year \n" +
                "1 - first year\n" +
                "2 - second year\n" +
                "3 - third year\n" +
                "4 - fourth year\n");

        this.year = sc.nextInt();

        setStudentID();

        System.out.println("Name: " + firstName + " " + lastName + "\nYear: " + year + "\nStudent's ID: " + studentID);





    }

    // Generate an ID
    private void setStudentID() {
        // Grade Level + ID
        id++;
        this.studentID = year + "" + id;


    }

    // Enroll in courses
    public void enroll() {
        //Get inside a loop, user hits 0
        do {
            System.out.println("Please enter a course to enroll (Q to quit): ");
            Scanner sc = new Scanner(System.in);
            String course = sc.nextLine();
            if (!course.equals("Q")) {
                courses = courses + "\n   " + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            }
            else {
                break;
            }


        } while (1 != 0);

    }


    // View balance
        public void viewBalance() {
            System.out.println("Your balance is: " + tuitionBalance + "$");
        }

    // Pay tuition
            public void payTuition() {

            viewBalance();
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter how much do you want to pay in $");
            int payment = sc.nextInt();
            tuitionBalance -= payment;
            System.out.println("Thank you for your payment of: " + payment + "$, your tuition balance is now " + tuitionBalance + "$");

        }

    // Show status
    @Override
    public String toString(){
        return "Name: " + firstName + " " + lastName +
                "\nStudent's year: " + year +
                "\nStudent's ID: " + studentID +
                "\nCourses Enrolled: " + courses +
                "\nBalance: " + tuitionBalance + "$";

    }




}
