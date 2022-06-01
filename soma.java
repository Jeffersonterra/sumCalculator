import java.util.Scanner;
import java.util.Locale;

public class soma {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        double x, y, soma;
        System.out.println("Digite o valor de x para adicição");
        System.out.println("Input the x value for adition");
        x = sc.nextDouble();

        System.out.println("Digite o valor de y para adicição");
        System.out.println("Input the y value for adition");
        y = sc.nextDouble();
        soma = y + x;

        System.out.printf("A soma de %s e %s eh %1.2f", x, y, soma);
        System.out.printf("The sum of %s and %s is %1.2f", x, y, soma);
        sc.close();
    }
}
