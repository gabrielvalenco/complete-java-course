package section04;
import java.util.Locale;

public class App {
    public static void main (String[] args) {

        // Single-line comment
        System.out.println("Hello, World!"); // With line break
        System.out.print("Hello, World!"); // Without line break

        int y = 67;
        System.out.println(y);

        /// Number formatting
        double x = 69.1213;
        System.out.println(x);
        System.out.printf("%.2f%n", x); /// Rounds to 2 decimal places

        /// String formatting
        System.out.println("Result: " + x + " meters"); // Concatenating strings
        System.out.printf("Result = %.2f meters%n", x); // String formatting
        Locale.setDefault(Locale.US);

        /// String formatting with multiple parameters
        String name = "Gabriel";
        int age = 20;
        double height = 1.75;
        System.out.printf ("%s is %d years old and %.2f tall%n", name, age, height);
    }
}
