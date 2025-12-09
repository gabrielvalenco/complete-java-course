// Exercise 5:
// Write a program to read the code of product 1, the number of units of product 1, the price for each unit of product 1,
// the code of product 2, the number of units of product 2 and the price for each unit of product 2.
// Calculate and display the total amount to be paid.

package section04.exercises;

import java.util.Locale;
import java.util.Scanner;

public class Exercise05 {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        int code1, quantity1;
        double price1;

        int code2, quantity2;
        double price2;

        System.out.println("Enter product 1 details (Code Quantity Price):");
        code1 = sc.nextInt();
        quantity1 = sc.nextInt();
        price1 = sc.nextDouble();

        System.out.println("Enter product 2 details (Code Quantity Price):");
        code2 = sc.nextInt();
        quantity2 = sc.nextInt();
        price2 = sc.nextDouble();

        double total = price1 * quantity1 + price2 * quantity2;

        System.out.printf("TOTAL TO PAY: $ %.2f%n", total);
        
        sc.close();

    }
}
