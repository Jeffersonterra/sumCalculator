import java.util.Scanner;
import java.util.Locale;
import java.io.FileWriter;
import java.io.IOException;

public class soma {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        try {
            FileWriter writer = new FileWriter("LogADD.txt", true);
            Scanner sc = new Scanner(System.in);
            double x, y, soma;
            writer.append("\n(Powered by Jefftm)");
            System.out.println("Digite o valor de x para adicição");
            System.out.println("Input the x value for adition");
            x = sc.nextDouble();

            System.out.println("Digite o valor de y para adicição");
            System.out.println("Input the y value for adition");
            y = sc.nextDouble();
            soma = y + x;

            System.out.printf("A soma de %s e %s eh %1.2f\n", x, y, soma);
            System.out.printf("The sum of %s and %s is %1.2f", x, y, soma);
            writer.write(x + "  +  " + y + "  =  " + soma);
            /* ("%f.0 + %f.0 = %f.0") */
            sc.close();
            writer.close();
        } catch (IOException e) {
            // AUTO GENERATED CATCH BLOCK
            e.printStackTrace();
        }
    }
}

