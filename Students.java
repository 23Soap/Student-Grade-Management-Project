import java.util.Arrays;
import java.util.Scanner;

public class Students {
    private int grade1, grade2, grade3, grade4, grade5;
    private Scanner scanner;
    int grades[];

    public Students(int grade1, int grade2, int grade3, int grade4, int grade5, Scanner scanner) {
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
        this.grade4 = grade4;
        this.grade5 = grade5;
        this.scanner = scanner;
    }

    public void displayGrades() {
        System.out.println("All grades " + grade1 + "," + grade2 + "," + grade3 + "," + grade4 + "," + grade5);
    }

    public void calculateAverage() {
        int allGrades = grade1 + grade2 + grade3 + grade4 + grade5;
        double average = allGrades / 5.0;
        System.out.println("Grades avarage is " + average);
    }

    public void sortGrades() {
        int[] grades = {grade1, grade2, grade3, grade4, grade5};
        System.out.println("Original Grades: ");
        for (int grade : grades) {
            System.out.println(grade);
        }
        Arrays.sort(grades);
        System.out.println("Grade is sorted: ");
        for (int grade : grades) {
            System.out.println(grade);
        }
    }

//    public void searchGrades() {
//
//        System.out.println("Enter you Grade for search: ");
//        int gradeSearch = scanner.nextInt();
//
//        boolean found = false;
//
//        int[] grades = {grade1, grade2, grade3, grade4, grade5};
//        for (int i = 0; i < grades.length; i++) {
//            if (grades[i] == gradeSearch) {
//                found = true;
//            }
//            System.out.println(grades[i]);
//        }for (int grade : grades) {
//            if (grade == gradeSearch) {
//                found = true;
//                System.out.println("Your grade is " + grade);
//                break;
//
//            }
//        }
//        if (!found) {
//            System.out.println("Grade not found.");
//        }
//    }


}
