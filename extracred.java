package ExtraCredit;

import java.util.Scanner;

public class extracred {
    public static void main(String[] args) {
        Scanner keyb = new Scanner(System.in);
        double grade;
        double extracredit = 5; 
        double newGrade;

        System.out.println("\nHello. Welcome to the Extra Credit Program. Please enter your current grade: ");
        grade = keyb.nextDouble();

        newGrade = grade + extracredit;
        System.out.printf("Here is your new grade: %.2f", newGrade);
    }
}
