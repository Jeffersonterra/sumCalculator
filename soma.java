import java.util.Scanner;
import java.util.Locale;
import java.io.FileWriter;
import java.io.IOException;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class soma {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        try {
            FileWriter writer = new FileWriter("LogADD.txt", true);
            Scanner sc = new Scanner(System.in);
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            LocalDateTime now = LocalDateTime.now();
            double x, y, soma;
            
            System.out.println("Digite o valor de x para adicição");
            System.out.println("Input the x value for adition");
            x = sc.nextDouble();

            System.out.println("Digite o valor de y para adicição");
            System.out.println("Input the y value for adition");
            y = sc.nextDouble();
            soma = y + x;

            System.out.printf("A soma de %s e %s eh %1.2f\n", x, y, soma);
            System.out.printf("The sum of %s and %s is %1.2f", x, y, soma);
            System.out.println(dtf.format(now));
            writer.write("\n");
            writer.write(x + "  +  " + y + "  =  " + soma);
            
            writer.append("\n                                      (Powered by Jefftm)" + dtf.format(now));
            
            sc.close();
            writer.close();
        } catch (IOException e) {
            // AUTO GENERATED CATCH BLOCK
            e.printStackTrace();
        }
    }
}

