package session_four;

import java.util.Locale;
import java.util.Scanner;

public class scanner {

    // Read a Single Word
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String x;
        x = sc.next(); // Read a single word
        System.out.println("You typed: " + x);

        sc.close();
    }
    // Read an Integer
    public static void main2 (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int y;
        y = sc.nextInt();
        System.out.println("You typed: " + y);

        sc.close();
    }

    // Read a Double
    public static void main3 (String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        
        double z;
        z = sc.nextDouble();
        System.out.println("You typed: " + z);

        sc.close();
    }

    // Read a Character
    public static void main4 (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        char c;
        c = sc.next().charAt(0);
        System.out.println("You typed: " + c);

        sc.close();
    }

    // Read multiple data
    public static void main5 (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int x;
        double y;
        char c;

        x = sc.nextInt();
        y = sc.nextDouble();
        sc.nextLine(); // Consume the newline character
        c = sc.nextLine().charAt(0);

        System.out.println("You typed: " + x);
        System.out.println("You typed: " + y);
        System.out.println("You typed: " + c);

        sc.close();
    }
}
