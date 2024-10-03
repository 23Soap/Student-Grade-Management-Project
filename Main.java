import java.util.Scanner;
public class Program {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your first Grade: ");
        int grade1 = scanner.nextInt();
        System.out.println("Enter your second Grade: ");
        int grade2 = scanner.nextInt();
        System.out.println("Enter your third Grade: ");
        int grade3 = scanner.nextInt();
        System.out.println("Enter your fourth Grade: ");
        int grade4 = scanner.nextInt();
        System.out.println("Enter your fifth Grade: ");
        int grade5 = scanner.nextInt();

        System.out.println("search for a grade: ");
        int searchGrades = scanner.nextInt();

        Students students = new Students(grade1, grade2, grade3, grade4, grade5,searchGrades);

        students.displayGrades();
        students.calculateAverage();
        students.searchGrades();
        students.sortGrades();

        scanner.close();
        
    }
}
