import java.util.Arrays;

class Students {

    private int grade1, grade2, grade3, grade4, grade5;
    int[] allGrades;
    private int search;

    public Students(int grade1, int grade2, int grade3, int grade4, int grade5, int search) {
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
        this.grade4 = grade4;
        this.grade5 = grade5;
        this.search = search;
        this.allGrades = new int[]{grade1, grade2, grade3, grade4, grade5};
    }

    public void displayGrades() {
        int allGrades = grade1 + grade2 + grade3 + grade4 + grade5;
        System.out.println("All grades: " + grade1 + ", " + grade2 + ", " + grade3 + ", " + grade4 + ", " + grade5);
    }

    public void calculateAverage() {
        double averageGrades = (grade1 + grade2 + grade3 + grade4 + grade5) / 5.0;
        System.out.println("Average grades: " + averageGrades);
    }

    public void searchGrades() {

        for (int i = 0; i < allGrades.length; i++) {
            if (search == allGrades[i]) {
                System.out.println("Your searching is " + allGrades[i]);
            }
        }
    }

    public void sortGrades() {
        Arrays.sort(allGrades);
        System.out.println("Your sorted grades are" + Arrays.toString(allGrades));
    }
}
