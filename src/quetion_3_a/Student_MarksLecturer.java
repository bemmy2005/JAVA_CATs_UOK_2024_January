package quetion_3_a;


import java.util.Scanner;

public class Student_MarksLecturer {
    public static void main(String[] args) {
        double mark;

        System.out.println("Enter The Marks Of Students:");
        Scanner Marks = new Scanner(System.in);
        mark = Marks.nextDouble();

        if (mark > 79) {
            System.out.println("Excellent");
        } else if (mark >= 70 && mark <= 79) {
            System.out.println("Very Good");
        } else if (mark >= 60 && mark <= 69) {
            System.out.println("Satisfactory");
        } else if (mark >= 50 && mark <= 59) {
            System.out.println("Pass");
        } else if (mark < 50) {
            System.out.println("Fail");
        } else {
            System.out.println("   ");
        }
    }
}
