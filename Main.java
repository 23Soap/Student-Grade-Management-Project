import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First Grade: ");
        int grade1 = scanner.nextInt();
        System.out.println("Second Grade: ");
        int grade2 = scanner.nextInt();
        System.out.println("Third Grade: ");
        int grade3 = scanner.nextInt();
        System.out.println("Fourth Grade: ");
        int grade4 = scanner.nextInt();
        System.out.println("Fifth Grade: ");
        int grade5 = scanner.nextInt();


        Students students = new Students(grade1, grade2, grade3, grade4, grade5,scanner);
        students.displayGrades();
        students.calculateAverage();
//      students.searchGrades();
        students.sortGrades();

        scanner.close();


    }
}