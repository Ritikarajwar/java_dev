package internship;
import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of grades to be entered: ");
        int numberOfGrades = sc.nextInt();

        double[] grades = new double[numberOfGrades];
        double sum = 0;

        for (int i = 0; i < numberOfGrades; i++) {
            System.out.print("Enter grade " + (i + 1) + ": ");
            grades[i] = sc.nextDouble();
            sum += grades[i]; 
        }

        double average = sum / numberOfGrades;

        System.out.printf("The average grade is: %.2f", average);

    }
}
