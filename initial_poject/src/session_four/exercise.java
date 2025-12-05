package session_four;
import java.util.Locale;

public class exercise {
    public static void main (String[] args) {
        String product1 = "Computer";
        String product2 = "Office Desk";

        int age = 30;
        int code = 6769;
        char gender = 'F';

        double price1 = 2100.00;
        double price2 = 800.00;
        double measure = 53.00;

        System.out.println ("Products:");
        System.out.printf (product1 + "Wich price is U$%.2f%n", price1);
        System.out.printf (product2 + "Wich price is U$%.2f%n", price2);
        System.out.println ();
        System.out.printf ("Record: ");
        System.out.println ("Age: " + age + " Code: " + code + " Gender: " + gender);
        System.out.println ();
        System.out.println ("Measure with eight decimal places: " + String.format("%.8f", measure));
        System.out.println ("Rounded (three decimal places): " + String.format("%.3f", measure));
        Locale.setDefault(Locale.US);
        System.out.println ("US decimal point: " + String.format("%.3f", measure));
    }

}