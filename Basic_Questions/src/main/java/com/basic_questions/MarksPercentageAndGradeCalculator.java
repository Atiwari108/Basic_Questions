package com.basic_questions;
import java.util.Scanner;



public class MarksPercentageAndGradeCalculator {
    public static void main(String[] args) {
        // Input marks for five subjects
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Physics marks: ");
        double physics = scanner.nextDouble();

        System.out.print("Enter Chemistry marks: ");
        double chemistry = scanner.nextDouble();

        System.out.print("Enter Biology marks: ");
        double biology = scanner.nextDouble();

        System.out.print("Enter Mathematics marks: ");
        double mathematics = scanner.nextDouble();

        System.out.print("Enter Computer marks: ");
        double computer = scanner.nextDouble();

        // Calculate percentage
        double percentage = calculatePercentage(physics, chemistry, biology, mathematics, computer);

        // Calculate grade
        char grade = calculateGrade(percentage);

        // Display result
        System.out.printf("Percentage: %.2f%%%n", percentage);
        System.out.println("Grade: " + grade);
    }

    public static double calculatePercentage(double physics, double chemistry, double biology, double mathematics, double computer) {
        double totalMarks = physics + chemistry + biology + mathematics + computer;
        double percentage = (totalMarks / (5 * 100)) * 100;
        return percentage;
    }

    public static char calculateGrade(double percentage) {
        char grade;

        if (percentage >= 90) {
            grade = 'A';
        } else if (percentage >= 80) {
            grade = 'B';
        } else if (percentage >= 70) {
            grade = 'C';
        } else if (percentage >= 60) {
            grade = 'D';
        } else if (percentage >= 40) {
            grade = 'E';
        } else {
            grade = 'F';
        }

        return grade;
    }
}
