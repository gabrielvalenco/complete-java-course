// Exercise 6:
// Make a program that reads three double-precision floating-point values: A, B and C. Then calculate and
// show:
// a) the area of the right triangle that has A as base and C as height.
// b) the area of the circle with radius C. (pi = 3.14159)
// c) the area of the trapezoid that has A and B as bases and C as height.
// d) the area of the square with side B.
// e) the area of the rectangle with sides A and B.

package section04.exercises;

import java.util.Locale;
import java.util.Scanner;

public class Exercise06 {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        double triangle = A * C / 2.0;
        double circle = 3.14159 * C * C;
        double trapezoid = (A + B) / 2.0 * C;
        double square = B * B;
        double rectangle = A * B;

        System.out.printf("TRIANGLE: %.3f%n", triangle);
        System.out.printf("CIRCLE: %.3f%n", circle);
        System.out.printf("TRAPEZOID: %.3f%n", trapezoid);
        System.out.printf("SQUARE: %.3f%n", square);
        System.out.printf("RECTANGLE: %.3f%n", rectangle);

        sc.close();
    }
}
