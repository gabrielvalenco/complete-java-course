public class casting {
    public static void main (String[] args) {
        // Casting de Variáveis
        int a, b;
        double result;

        a = 5;
        b = 2;

        result = (double) a/b;
        System.out.printf ("O resultado de: " + a + " Dividido por " + b + " é igual a: %.1f%n", result);

        double c;
        int d;

        c = 5.0;
        d = (int) c;

        System.out.println (d);
    }
}
