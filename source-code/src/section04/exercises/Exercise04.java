// Exercise 4:
// Create a program that reads an employee's number, their worked hours, the value they receive per
// hour and calculates that employee's salary. Then, show the employee's number and salary with two decimal places.

package section04.exercises;

import java.util.Locale;
import java.util.Scanner;

public class Exercise04 {
    public static void main (String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        int userID = sc.nextInt();
        double workedHours = sc.nextInt();
        double salary = sc.nextInt();
        double salaryPerHour = (workedHours * salary);

        System.out.println ("User ID: " + userID);
        System.out.printf ("Salary per hour: " + salaryPerHour);

        sc.close();
    }
}
