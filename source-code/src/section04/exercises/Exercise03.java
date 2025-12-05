// Exercise 3:
// Make a program to read four integer values A, B, C and D. Then calculate and show the difference of the product
// of A and B by the product of C and D according to the formula: DIFFERENCE = (A * B - C * D).

package section04.exercises;

import java.util.Locale;
import java.util.Scanner;

public class Exercise03 {
    public static void main (String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        int difference = (A * B - C * D);

        System.out.printf("The diferrence between " + A + B + " and " + C + D + " Is: " + difference);

        sc.close();
        
    }
}
