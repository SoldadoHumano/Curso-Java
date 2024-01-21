import java.util.Locale;
import java.util.Scanner;

/*
 Fazer um programa para ler as medidas dos lados de dois triângulos X e Y (Suponha medidas válidas).
 Em seguida, mostrar o valor das áreas dos dois triângulos e dizer qual dos dois triângulos possui a
 maior area.
 A fórmula para calcular a área de um triângulo a partir das medidas de seus lados a, b e c é a seguinte
 (Fórmula de Heron): area = Vp(p-a)(p-b)(p-c) onde p = a+b+c/2
*/

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double a1, b1, c1, a2, b2, c2;
        
        System.out.println("Enter the measures of triangle X: ");
        a1 = sc.nextDouble();
        b1 = sc.nextDouble();
        c1 = sc.nextDouble();

        System.out.println("Enter the measures of triangle Y: ");
        a2 = sc.nextDouble();
        b2 = sc.nextDouble();
        c2 = sc.nextDouble();

        double p = (a1 + b1 + c1) / 2.0;
        double areaX = Math.sqrt(p * (p - a1) * (p - b1) * (p - c1));

        p = (a2 + b2 + c2) / 2.0;
        double areaY = Math.sqrt(p * (p - a2) * (p - b2) * (p - c2));

        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Triangle Y area: %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("Larger area: X");
        }
        else {
            System.out.println("Larger area: Y");
        }

        sc.close();
    }
}
