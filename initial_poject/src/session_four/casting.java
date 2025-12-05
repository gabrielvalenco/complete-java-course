package session_four;
public class casting {
    public static void main (String[] args) {
        // Variable Casting
        int a, b;
        double result;

        a = 5;
        b = 2;

        result = (double) a/b;
        System.out.printf("The result of: " + a + " divided by " + b + " is equal to: %.1f%n", result);

        double c;
        int d;

        c = 5.0;
        d = (int) c;

        System.out.println (d);
    }
}
