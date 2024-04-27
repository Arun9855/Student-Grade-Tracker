package Project;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class gradetracker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> grades = new ArrayList<>();
        char choice;

        do {
            System.out.print("Enter student Score: ");
            int grade = scanner.nextInt();
            grades.add(grade);

            System.out.print("Do you want to enter another Score? (Y/N): ");
            choice = scanner.next().charAt(0);
        } while (choice == 'Y' || choice == 'y');

        if (grades.isEmpty()) {
            System.out.println("No Score entered.");
            return;
        }

        double average = calculateAverage(grades);
        int highest = calculateHighest(grades);
        int lowest = calculateLowest(grades);

        System.out.println("Average Score: " + average);
        System.out.println("Highest Score: " + highest);
        System.out.println("Lowest Score: " + lowest);

        scanner.close();
    }

    public static double calculateAverage(ArrayList<Integer> grades) {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.size();
    }

    public static int calculateHighest(ArrayList<Integer> grades) {
        return Collections.max(grades);
    }

    public static int calculateLowest(ArrayList<Integer> grades) {
        return Collections.min(grades);
    }
}
