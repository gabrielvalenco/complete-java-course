// Exercise 2:
// Write a program to read the radius of a circle and then display the area of this circle with four decimal places as in the examples.
// Area formula: area = π * radius^2
// Consider π = 3.14159

package section04.exercises;

import java.util.Scanner;
import java.util.Locale;

public class Exercise02 {
    public static void main (String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double radius;
        double pi = 3.14159;
        
        radius = sc.nextDouble();

        double area = pi * (radius * radius);

        System.out.printf("A=%.4f%n", area);

        sc.close();
    }
}
