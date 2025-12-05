import java.util.Locale;

public class App {
    public static void main (String[] args) {

        // Comentário de uma Linha
        System.out.println("Hello, World!"); // Com Quebra de Linha
        System.out.print("Hello, World!"); // Sem Quebra de Linha

        int y = 67;
        System.out.println(y);

        /// Formatação de Números
        double x = 69.1213;
        System.out.println(x);
        System.out.printf("%.2f%n", x); /// Arredonda para 2 casas decimais

        /// Formatação de Strings
        System.out.println("Resultado: " + x + "Metros"); // Concatenando Strings
        System.out.printf("Rsultado = %.2f Metros%n", x); // Formatação de String
        Locale.setDefault(Locale.US);

        /// Formatação de String com Vários Parâmetros
        String name = "Gabriel";
        int age = 20;
        double height = 1.75;
        System.out.printf ("%s tem %d anos e %.2f de altura%n", name, age, height);
    }
}
